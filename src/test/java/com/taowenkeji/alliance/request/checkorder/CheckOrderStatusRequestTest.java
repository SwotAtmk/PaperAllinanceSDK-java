package com.taowenkeji.alliance.request.checkorder;

import com.taowenkeji.alliance.AllianceClient;
import com.taowenkeji.alliance.AllianceConfig;
import com.taowenkeji.alliance.view.ReturnView;
import junit.framework.TestCase;

public class CheckOrderStatusRequestTest extends TestCase {

    public void testRequest() {
        AllianceConfig config = new AllianceConfig("你的appKey","你的appSecret");
        CheckOrderStatusRequest allianceRequest = new CheckOrderStatusRequest(config,"订单编号");
        AllianceClient allianceClient = new AllianceClient(config,allianceRequest);
        ReturnView<Object> r = allianceClient.run();
        System.out.println(r.getData());
    }
}
