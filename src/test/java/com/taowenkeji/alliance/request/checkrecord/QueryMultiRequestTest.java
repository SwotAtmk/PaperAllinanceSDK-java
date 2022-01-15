package com.taowenkeji.alliance.request.checkrecord;

import com.taowenkeji.alliance.AllianceClient;
import com.taowenkeji.alliance.AllianceConfig;
import com.taowenkeji.alliance.view.ReturnView;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

public class QueryMultiRequestTest extends TestCase {

    public void testQueryMultiRequest(){
        AllianceConfig config = new AllianceConfig("你的appKey","你的appSecret");
        QueryMultiRequest allianceRequest = new QueryMultiRequest(config);
        Map<String,String> queryParam = new HashMap<>();
//        queryParam.put("pids","");//论文ID 多个ID用逗号隔开
        queryParam.put("oid","订单id");//订单ID
        allianceRequest.setRequestQuery(queryParam);
        AllianceClient allianceClient = new AllianceClient(config,allianceRequest);
        ReturnView<Object> r = allianceClient.run();
        System.out.println(r.getData());
    }
}
