package com.taowenkeji.alliance.request.checkrecord;

import com.taowenkeji.alliance.AllianceConfig;
import com.taowenkeji.alliance.AllianceRequest;
import com.taowenkeji.alliance.Enum.RequestMethodEnum;
import com.taowenkeji.alliance.view.VerifyView;

/**
 * api:/checkrecord/{paper_id}
 * 查询单条检测纪录
 * 响应结果：{
 *   "code": "string",
 *   "codeMsg": "string",
 *   "data": {
 *     "paper_id": "string",
 *     "title": "string",
 *     "author": "string",
 *     "origin_path": "string",
 *     "report_path": "string",
 *     "upload_time": "string",
 *     "status": 0,
 *     "note": "string",
 *     "jane_name": "wanfangbd"
 *   }
 * }
 */
public class QueryRecordRequest extends AllianceRequest {
    private String paperId;

    public QueryRecordRequest(AllianceConfig config,String paperId) {
        super(config);
        this.paperId = paperId;
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
        return "/checkrecord/" + paperId;
    }

    @Override
    public RequestMethodEnum getRequestMethodImpl() {
        return RequestMethodEnum.GET;
    }
}
