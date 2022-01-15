package com.taowenkeji.alliance.request.checkorder;

import com.taowenkeji.alliance.AllianceConfig;
import com.taowenkeji.alliance.AllianceRequest;
import com.taowenkeji.alliance.Enum.RequestMethodEnum;
import com.taowenkeji.alliance.view.VerifyView;

/**
 * api:/checkorder/validatePaper
 * 论文验证 如内容最大长度，标题最大长度，文档格式，作者是否必须等
 * 参数：
 * 响应结果：{
 *   "code": "string",
 *   "codeMsg": "string",
 *   "data": {
 *     "success": true,
 *     "fid": "string",
 *     "wordsnum": 0
 *   }
 * }
 */
public class ValidatePaperRequest extends AllianceRequest {

    public ValidatePaperRequest(AllianceConfig config) {
        super(config);
    }

    @Override
    public VerifyView verification() {
        return VerifyView.getInstance();
    }

    @Override
    public void preRequestImpl() {

    }

    @Override
    public String getRequestUriImpl() {
        return "/checkorder/validatePaper";
    }

    @Override
    public RequestMethodEnum getRequestMethodImpl() {
        return RequestMethodEnum.POST;
    }
}
