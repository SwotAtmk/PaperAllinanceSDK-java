package com.taowenkeji.alliance.request.checkorder;

import com.taowenkeji.alliance.AllianceClient;
import com.taowenkeji.alliance.AllianceConfig;
import com.taowenkeji.alliance.Enum.PayTypeEnum;
import com.taowenkeji.alliance.view.ReturnView;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

public class PayOrderRequestTest extends TestCase {
    public void testRequest(){
        AllianceConfig config = new AllianceConfig("你的appKey","你的appSecret");
        PayOrderRequest allianceRequest = new PayOrderRequest(config);

        Map<String,Object> requestParam = new HashMap<>();
        requestParam.put("pay_id","*******订单支付编号*******");
        requestParam.put("pay_type", PayTypeEnum.alipay);
        requestParam.put("params","支付变量 格式：urlencode(k1=v1&k2=v2)");
        allianceRequest.setRequestParam(requestParam);

        AllianceClient allianceClient = new AllianceClient(config,allianceRequest);
        ReturnView<Object> r = allianceClient.run();
        System.out.println(r.getData());
    }
}
