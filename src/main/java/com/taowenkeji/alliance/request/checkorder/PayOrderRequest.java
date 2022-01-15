package com.taowenkeji.alliance.request.checkorder;

import com.taowenkeji.alliance.AllianceConfig;
import com.taowenkeji.alliance.AllianceRequest;
import com.taowenkeji.alliance.Enum.RequestMethodEnum;
import com.taowenkeji.alliance.view.VerifyView;

/**
 * api:/checkorder/payOrder
 * 支付定单
 * 响应结果：{
 *   "code": null,
 *   "codeMsg": null,
 *   "data": {
 *     "oid": "T1234567981122546",
 *     "type": "qrlink",
 *     "qrlink": "weixin://wxpay/bizpayurl?pr=AGe684b",
 *     "money": 2.4
 *   }
 * }
 */
public class PayOrderRequest extends AllianceRequest {

    public PayOrderRequest(AllianceConfig config) {
        super(config);
    }

    @Override
    public VerifyView verification() {
        // todo:验证接口参数

        return VerifyView.getInstance();
    }

    @Override
    public void preRequestImpl() {

    }

    @Override
    public String getRequestUriImpl() {
        return "/checkorder/payOrder";
    }

    @Override
    public RequestMethodEnum getRequestMethodImpl() {
        return RequestMethodEnum.POST;
    }
}
