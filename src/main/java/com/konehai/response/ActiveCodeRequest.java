package com.konehai.response;

import java.sql.Timestamp;

/**
 * Created by HP on 15-02-2017.
 */
public class ActiveCodeRequest {

    private String activeCode;
    private Timestamp time;

    public String getActiveCode() {
        return activeCode;
    }

    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}
