package com.taowenkeji.alliance.request.checkorder;

import com.taowenkeji.alliance.AllianceConfig;
import com.taowenkeji.alliance.AllianceRequest;
import com.taowenkeji.alliance.Enum.RequestMethodEnum;
import com.taowenkeji.alliance.view.VerifyView;
import com.taowenkeji.utils.MyUtil;

import java.util.ArrayList;
import java.util.Date;

/**
 * api:/checkorder/preCreateOne
 * 创建预支付定单-单篇论文
 * 响应结果：{
 *   "code": "string",
 *   "codeMsg": "string",
 *   "data": {
 *     "pay_id": "string",
 *     "paper_id": "string",
 *     "wordsnum": 0,
 *     "cost_money": 0,
 *     "buyer_money": 0,
 *     "buyer_nums": 0
 *   }
 * }
 */
public class PreCreateOneRequest extends AllianceRequest {

    public PreCreateOneRequest(AllianceConfig config) {
        super(config);
    }

    @Override
    public VerifyView verification() {
        // todo:验证接口参数

        return VerifyView.getInstance();
    }

    @Override
    public void preRequestImpl() {
        String nonce = String.valueOf(new Date().getTime());
        addRequestQuery("nonce", nonce); // 设置随机字符串

        ArrayList<String> signList = new ArrayList<>();

        // scope+jane_name+selling_data+nonce+appsecret
        signList.add(getRequestParamByKey("scope").toString()); // scope
        signList.add(getRequestParamByKey("jane_name").toString());
        signList.add(getRequestParamByKey("selling_data").toString());
        signList.add(nonce);
        signList.add(allianceConfig.getAppSecret());

        StringBuilder signStr = new StringBuilder(); // 待签名字符串

        for (String item: signList) {
            signStr.append(item);
        }

        String sign =  MyUtil.md5(signStr.toString());

        // 签名 md5(scope+jane_name+selling_data+nonce+appsecret)
        addRequestQuery("sign",sign);// 设置签名
    }

    @Override
    public String getRequestUriImpl() {
        return "/checkorder/preCreateOne";
    }

    @Override
    public RequestMethodEnum getRequestMethodImpl() {
        return RequestMethodEnum.POST;
    }
}
