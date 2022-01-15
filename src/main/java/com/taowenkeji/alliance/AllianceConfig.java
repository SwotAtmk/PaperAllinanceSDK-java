package com.taowenkeji.alliance;

import java.lang.reflect.Array;

public class AllianceConfig {

    private String AppKey;

    private String AppSecret;

    private final String BaseUrl;

    public AllianceConfig(String appKey, String appSecret){
        AppKey = appKey;
        AppSecret = appSecret;
        BaseUrl = "https://api.checkpass.net/v3";
    }

    public AllianceConfig(String appKey, String appSecret,String baseUrl) {
        AppKey = appKey;
        AppSecret = appSecret;
        BaseUrl = baseUrl;
    }

    public String getBaseUrl() {
        return BaseUrl;
    }

    public String getAppKey() {
        return AppKey;
    }

    public void setAppKey(String appKey) {
        AppKey = appKey;
    }

    public String getAppSecret() {
        return AppSecret;
    }

    public void setAppSecret(String appSecret) {
        AppSecret = appSecret;
    }
}
