package com.taowenkeji.alliance.request.checkorder;

import com.taowenkeji.alliance.AllianceConfig;
import com.taowenkeji.alliance.AllianceRequest;
import com.taowenkeji.alliance.Enum.RequestMethodEnum;
import com.taowenkeji.alliance.view.VerifyView;

/**
 * api:/checkorder/preCreateOne
 * 查询定单状态
 * 响应结果：{
 *   "code": null,
 *   "codeMsg": null,
 *   "data": 3 // 0:创建成功 1:买家已付款 2:平台已扣款 3:成功
 * }
 */
public class CheckOrderStatusRequest extends AllianceRequest {
    private String oid;

    public CheckOrderStatusRequest(AllianceConfig allianceConfig ,String oid){
        super(allianceConfig);
        this.oid = oid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
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
        return "/checkorder/" + oid + "/status";
    }

    @Override
    public RequestMethodEnum getRequestMethodImpl() {
        return RequestMethodEnum.GET;
    }
}
