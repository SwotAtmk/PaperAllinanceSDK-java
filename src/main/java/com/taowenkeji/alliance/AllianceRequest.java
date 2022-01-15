package com.taowenkeji.alliance;

import com.taowenkeji.alliance.view.ReturnView;
import com.taowenkeji.alliance.view.VerifyView;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class AllianceRequest implements AllianceRequestInterface {
    protected Map<String,Object> RequestParam=new HashMap<>(); // body参数，若为GET请求时充当query参数
    protected Map<String,String> RequestQuery=new HashMap<>(); // query参数
    protected Map<String,String> Headers=new HashMap<>();
    protected AllianceConfig allianceConfig;


    public AllianceRequest(AllianceConfig config){
        allianceConfig = config;
    }

    public void addRequestParam(String key,String value){
        if (RequestParam == null){
            RequestParam = new HashMap<>();
        }
        RequestParam.put(key,value);
    }

    public void removeRequestParam(String key){
        RequestParam.remove(key);
    }

    public Map<String, Object> getRequestParam() {
        return RequestParam;
    }

    public void setRequestParam(Map<String, Object> requestParam) {
        RequestParam = requestParam;
    }

    public String getRequestMethod() {
        return getRequestMethodImpl().toString();
    }

    public Map<String, String> getHeaders() {
        return Headers;
    }

    public void setHeaders(Map<String, String> headers) {
        Headers = headers;
    }

    public String getRequestUri() {
        return getRequestUriImpl();
    }

    public Map<String, String> getRequestQuery() {
        return RequestQuery;
    }

    public void setRequestQuery(Map<String, String> requestQuery) {
        RequestQuery = requestQuery;
    }

    public void addRequestQuery(String key,String value){
        if (RequestQuery == null){
            RequestQuery = new HashMap<>();
        }
        RequestQuery.put(key,value);
    }

    public void removeRequestQuery(String key){
        RequestQuery.remove(key);
    }

    /**
     * @return Object
     */
    public Object getRequestParamByKey(String key){
        Map<String,Object> requestParam = getRequestParam();
        if (requestParam.containsKey(key)){
            return requestParam.get(key);
        }
        return "";
    }

    /**
     * @return String
     */
    public String getRequestQueryByKey(String key){
        Map<String,String> requestQuery = getRequestQuery();
        if (requestQuery.containsKey(key)){
            return requestQuery.get(key);
        }
        return "";
    }

    /**
     * 预请求，用于签名等……操作
     */
    public void preRequest(){
        // 设置apiKey
        addRequestQuery("apikey", allianceConfig.getAppKey());
        preRequestImpl();
    }

    /**
     * 请求前验证验证
     * @return ReturnView
     */
    public abstract VerifyView verification();
    public abstract void preRequestImpl();

}
