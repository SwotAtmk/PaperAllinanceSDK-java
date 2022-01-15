package com.taowenkeji.alliance.request.checkorder;

import com.taowenkeji.alliance.AllianceClient;
import com.taowenkeji.alliance.AllianceConfig;
import com.taowenkeji.alliance.Enum.CheckContentTypeEnum;
import com.taowenkeji.alliance.view.ReturnView;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

public class preCreateOneRequestTest extends TestCase {
    public void testRequest(){
        AllianceConfig config = new AllianceConfig("你的appKey","你的appSecret");
        PreCreateOneRequest allianceRequest = new PreCreateOneRequest(config);
        Map<String,Object> requestParam = new HashMap<>();
        requestParam.put("title","Test测试论文");
        requestParam.put("author","LJM");
        requestParam.put("content","错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文");
        requestParam.put("content_type", CheckContentTypeEnum.text);
        requestParam.put("jane_name","checkpass");
        requestParam.put("selling_data","10.0|10000");

        allianceRequest.setRequestParam(requestParam);
        AllianceClient allianceClient = new AllianceClient(config,allianceRequest);
        ReturnView<Object> r = allianceClient.run();
        System.out.println(r.getData());
    }

}
