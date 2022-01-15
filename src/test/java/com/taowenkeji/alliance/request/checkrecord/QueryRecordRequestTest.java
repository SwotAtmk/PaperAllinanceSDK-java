package com.taowenkeji.alliance.request.checkrecord;

import com.taowenkeji.alliance.AllianceClient;
import com.taowenkeji.alliance.AllianceConfig;
import com.taowenkeji.alliance.view.ReturnView;
import junit.framework.TestCase;


public class QueryRecordRequestTest extends TestCase {

    public void testQueryRecordRequest(){
        AllianceConfig config = new AllianceConfig("你的appKey","你的appSecret");
        QueryRecordRequest allianceRequest = new QueryRecordRequest(config,"论文id");
        AllianceClient allianceClient = new AllianceClient(config,allianceRequest);
        ReturnView<Object> r = allianceClient.run();
        System.out.println(r.getData());
    }
}
