package com.taowenkeji.alliance.request.checkorder;

import com.taowenkeji.alliance.AllianceClient;
import com.taowenkeji.alliance.AllianceConfig;
import com.taowenkeji.alliance.Enum.CheckContentTypeEnum;
import com.taowenkeji.alliance.view.ReturnView;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

public class ValidatePaperRequestTest extends TestCase {

    public void testRequest() {
        AllianceConfig config = new AllianceConfig("你的appKey","你的appSecret");
        PreCreateOneRequest allianceRequest = new PreCreateOneRequest(config);
        Map<String,Object> requestParam = new HashMap<>();
        requestParam.put("title","Test测试论文");
        requestParam.put("author","LJM");
        requestParam.put("content","错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文");
        requestParam.put("content_type", CheckContentTypeEnum.text);
//        requestParam.put("filename","xxx"); // 文件名 使用filebytes base64_filebytes两种提交方式需要filename
        requestParam.put("jane_name","checkpass");

        allianceRequest.setRequestParam(requestParam);
        AllianceClient allianceClient = new AllianceClient(config,allianceRequest);
        ReturnView<Object> r = allianceClient.run();
        System.out.println(r.getData());
    }
}
