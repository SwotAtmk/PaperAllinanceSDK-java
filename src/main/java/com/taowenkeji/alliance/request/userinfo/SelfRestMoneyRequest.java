package com.taowenkeji.alliance.request.userinfo;

import com.taowenkeji.alliance.AllianceConfig;
import com.taowenkeji.alliance.AllianceRequest;
import com.taowenkeji.alliance.Enum.RequestMethodEnum;
import com.taowenkeji.alliance.view.VerifyView;
import com.taowenkeji.utils.MyUtil;
import java.util.Date;

/**
 * 查询用户余额
 * 响应结果：{
 *   "code": "string",
 *   "codeMsg": "string",
 *   "data": 0 // 余额
 * }
 */
public class SelfRestMoneyRequest extends AllianceRequest {

    public SelfRestMoneyRequest(AllianceConfig config) {
        super(config);
    }

    @Override
    public VerifyView verification() {
        return VerifyView.getInstance();
    }

    @Override
    public void preRequestImpl() {
        // 签名 md5(nonce+appsecret)
        String nonce = String.valueOf(new Date().getTime());
        addRequestQuery("nonce", nonce); // 设置随机字符串
        String sign =  MyUtil.md5(nonce + allianceConfig.getAppSecret());
        addRequestQuery("sign",sign);// 设置签名
    }

    @Override
    public String getRequestUriImpl() {
        return "/userinfo/self/restMoney";
    }

    @Override
    public RequestMethodEnum getRequestMethodImpl() {
        return RequestMethodEnum.GET;
    }
}
