package com.taowenkeji.alliance.request.userinfo;

import com.taowenkeji.alliance.AllianceClient;
import com.taowenkeji.alliance.AllianceConfig;
import com.taowenkeji.alliance.view.ReturnView;
import junit.framework.TestCase;

public class SelfRestMoneyRequestTest extends TestCase {

    public void testSelfRestMoneyRequest(){
        AllianceConfig config = new AllianceConfig("你的appKey","你的appSecret");
        SelfRestMoneyRequest allianceRequest = new SelfRestMoneyRequest(config);
        AllianceClient allianceClient = new AllianceClient(config,allianceRequest);
        ReturnView<Object> r = allianceClient.run();
        System.out.println(r.getData());
    }
}
