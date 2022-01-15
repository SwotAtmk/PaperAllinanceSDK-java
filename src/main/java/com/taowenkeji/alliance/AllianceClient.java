package com.taowenkeji.alliance;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.taowenkeji.alliance.view.ReturnView;
import com.taowenkeji.alliance.view.VerifyView;
import com.taowenkeji.utils.OkHttpUtils;

import java.net.URLEncoder;
import java.util.Map;
import java.util.Objects;

public class AllianceClient {
    private final AllianceConfig allianceConfig;
    private AllianceRequest allianceRequest;

    private AllianceClient(AllianceConfig config){
        assert config != null;
        allianceConfig = config;
    }

    public AllianceClient(AllianceConfig config, AllianceRequest request){
        assert config != null;
        allianceConfig = config;
        allianceRequest = request;
    }

    public static AllianceClient getInstance(AllianceConfig config) {
        return new AllianceClient(config);
    }

    public static AllianceClient getInstance(AllianceConfig config,AllianceRequest request) {
        return new AllianceClient(config,request);
    }


    public void setAllianceRequest(AllianceRequest allianceRequest) {
        this.allianceRequest = allianceRequest;
    }

    public ReturnView<Object> run(){
        // 验证
        VerifyView vr = allianceRequest.verification();
        if (!vr.isSuccess()){
            return new ReturnView<>(vr.isSuccess(),vr.getCode(),vr.getMessage());
        }

        // 预请求
        allianceRequest.preRequest();

        // 处理请求
        String requestUrl = allianceConfig.getBaseUrl() + allianceRequest.getRequestUri();

        // 处理query参数
        if (!allianceRequest.getRequestQuery().isEmpty()){
            StringBuilder urlBuilder = new StringBuilder(requestUrl);
            urlBuilder.append("?");
            try {
                Map<String,String> query = allianceRequest.getRequestQuery();
                for (Map.Entry<String, String> entry : query.entrySet()) {
                    urlBuilder.append(URLEncoder.encode(entry.getKey(), "utf-8")).
                            append("=").
                            append(URLEncoder.encode(entry.getValue(), "utf-8")).
                            append("&");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            urlBuilder.deleteCharAt(urlBuilder.length() - 1);
            requestUrl = urlBuilder.toString();
        }

        OkHttpUtils okHttpUtils =  OkHttpUtils.builder().url(requestUrl);

        // 设置请求头
        if (!allianceRequest.getHeaders().isEmpty()){
            allianceRequest.getHeaders().forEach(okHttpUtils::addHeader);
        }

        // 设置请求参数body部分
        if (Objects.equals(allianceRequest.getRequestMethod(), "POST")&&!allianceRequest.getRequestParam().isEmpty()){
            allianceRequest.getRequestParam().forEach(okHttpUtils::addParam);
        }

        if (Objects.equals(allianceRequest.getRequestMethod(), "GET")){
            okHttpUtils.get();
        }else if (Objects.equals(allianceRequest.getRequestMethod(), "POST")){
            okHttpUtils.post(true);
        } else {
            return new ReturnView<>(null,-1,"请求异常");
        }

        String res = okHttpUtils.sync();

        // json反序列化
        JSONObject r = JSON.parseObject(res);

        if (r.get("code") == null){
            return new ReturnView<>(r.get("data"));
        }

        return new ReturnView<>(r.get("data"),r.get("code"),r.get("codeMsg"));
    }

//
//    /**
//     * 创建预支付订单-单篇论文
//     * api:/checkorder/preCreateOne
//     * @return null
//     */
//    public Object preCreateOne(){
//        return null;
//    }




}
