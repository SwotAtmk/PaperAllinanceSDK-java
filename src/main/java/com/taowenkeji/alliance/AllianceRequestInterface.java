package com.taowenkeji.alliance;

import com.taowenkeji.alliance.Enum.RequestMethodEnum;

public interface AllianceRequestInterface {
    public void preRequest();

    /**
     * 设置请求链接实现方法
     * @return
     */
    public String getRequestUriImpl();

    /**
     * 设置请求方式实现方法
     * @return
     */
    public RequestMethodEnum getRequestMethodImpl();
}
