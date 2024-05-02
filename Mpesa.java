package com.entity;

public class Mpesa {
    private String appKey;
    private String appSecret;

    public Mpesa(String app_key, String app_secret) {
        appKey = app_key;
        appSecret = app_secret;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }
}
