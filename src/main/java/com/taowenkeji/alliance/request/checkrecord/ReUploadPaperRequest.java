package com.taowenkeji.alliance.request.checkrecord;

import com.taowenkeji.alliance.AllianceConfig;
import com.taowenkeji.alliance.AllianceRequest;
import com.taowenkeji.alliance.Enum.RequestMethodEnum;
import com.taowenkeji.alliance.view.VerifyView;

/**
 * api:/checkrecord/{paper_id}/reUploadPaper
 * 重新上传论文
 * 响应结果：{
 *   "code": "string",
 *   "codeMsg": "string",
 *   "data": true
 * }
 */
public class ReUploadPaperRequest extends AllianceRequest {

    private String paperId;

    public ReUploadPaperRequest(AllianceConfig config, String paperId) {
        super(config);
        this.paperId=paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    public String getPaperId() {
        return paperId;
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
        return "/checkrecord/"+paperId+"/reUploadPaper";
    }

    @Override
    public RequestMethodEnum getRequestMethodImpl() {
        return RequestMethodEnum.POST;
    }
}
