package com.konehai.model;

/**
 * Created by imittal on 2/19/17.
 */
public class FCMMessage {
    private String notificationTitle;
    private String notificationBody;

    public String getNotificationTitle() {
        return notificationTitle;
    }

    public String getNotificationBody() {
        return notificationBody;
    }

    public void setNotificationBody(String notificationBody) {
        this.notificationBody = notificationBody;
    }
}
