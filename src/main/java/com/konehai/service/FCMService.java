package com.konehai.service;

import com.konehai.dao.FCMDao;
import com.konehai.model.FCMMessage;
import com.konehai.model.FCMRequest;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by imittal on 2/19/17.
 */
@Service
public class FCMService {
    public final static String AUTH_KEY_FCM = "AIzaSyC61bBIv9WV4D2UWBDcM_HwBwsWMcVY49s";
    public final static String API_URL_FCM = "https://fcm.googleapis.com/fcm/send";

    @Autowired
    private FCMDao fcmDao;

// userDeviceIdKey is the device id you will query from your database

    public void pushFCMNotification(String userDeviceIdKey, FCMMessage fcmMessage) throws Exception {

        String authKey = AUTH_KEY_FCM; // You FCM AUTH key
        String FMCurl = API_URL_FCM;

        URL url = new URL(FMCurl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setUseCaches(false);
        conn.setDoInput(true);
        conn.setDoOutput(true);

        conn.setRequestMethod("POST");
        conn.setRequestProperty("Authorization", "key=" + authKey);
        conn.setRequestProperty("Content-Type", "application/json");

        JSONObject json = new JSONObject();
        json.put("to", userDeviceIdKey.trim());
        JSONObject info = new JSONObject();
        info.put("title", fcmMessage.getNotificationTitle()); // Notification title
        info.put("body", fcmMessage.getNotificationBody()); // Notification body
        json.put("notification", info);

        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
        wr.write(json.toString());
        wr.flush();
        conn.getInputStream();
    }

    public void saveDeviceId(String userId, String deviceId) {
        FCMRequest request = new FCMRequest(userId, deviceId);
        fcmDao.save(request);
    }
}
