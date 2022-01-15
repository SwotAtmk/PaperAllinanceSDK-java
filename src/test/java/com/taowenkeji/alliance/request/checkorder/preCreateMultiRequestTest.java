package com.taowenkeji.alliance.request.checkorder;

import com.taowenkeji.alliance.AllianceClient;
import com.taowenkeji.alliance.AllianceConfig;
import com.taowenkeji.alliance.Enum.CheckContentTypeEnum;
import com.taowenkeji.alliance.view.ReturnView;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class preCreateMultiRequestTest extends TestCase {
    public void testRequest(){
        AllianceConfig config = new AllianceConfig("你的appKey","你的appSecret");
        PreCreateMultiRequest allianceRequest = new PreCreateMultiRequest(config);
        Map<String,Object> requestParam = new HashMap<>();
        requestParam.put("jane_name","checkpass");
        requestParam.put("selling_data","10.0|10000");

        // 设置多篇论文上传
        List<Map<String,String>> paperData = new ArrayList<>();
        Map<String,String> paperContent = new HashMap<>();

        // 第一篇文章内容
        paperContent.put("title","Test测试论文");
        paperContent.put("author","LJM");
        paperContent.put("content","错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文错误:提交的内容为空,标题:Test测试论文");
        paperContent.put("content_type", CheckContentTypeEnum.text.toString());
        paperData.add(paperContent);
        // 第二篇及以上以此类推……

        requestParam.put("papers",paperData);

        allianceRequest.setRequestParam(requestParam);
        AllianceClient allianceClient = new AllianceClient(config,allianceRequest);
        ReturnView<Object> r = allianceClient.run();
        System.out.println(r.getData());
    }
}
