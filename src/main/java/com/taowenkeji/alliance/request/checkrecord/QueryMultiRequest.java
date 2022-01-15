package com.taowenkeji.alliance.request.checkrecord;

import com.taowenkeji.alliance.AllianceConfig;
import com.taowenkeji.alliance.AllianceRequest;
import com.taowenkeji.alliance.Enum.RequestMethodEnum;
import com.taowenkeji.alliance.view.VerifyView;

/**
 * 查询多条检测记录
 * 响应结果：{
 *   "code": "string",
 *   "codeMsg": "string",
 *   "data": [
 *     {
 *       "paper_id": "string",
 *       "title": "string",
 *       "author": "string",
 *       "origin_path": "string",
 *       "report_path": "string",
 *       "upload_time": "string",
 *       "status": 0,
 *       "note": "string",
 *       "jane_name": "wanfangbd"
 *     }
 *   ]
 * }
 */
public class QueryMultiRequest extends AllianceRequest {

    public QueryMultiRequest(AllianceConfig config) {
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
        return "/checkrecord";
    }

    @Override
    public RequestMethodEnum getRequestMethodImpl() {
        return RequestMethodEnum.GET;
    }
}
