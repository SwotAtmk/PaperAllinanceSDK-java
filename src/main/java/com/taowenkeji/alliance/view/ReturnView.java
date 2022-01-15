package com.taowenkeji.alliance.view;

public class ReturnView<T> {
    private T data;

    private Integer code=200;

    private String codeMsg="success";

    public ReturnView(){}

    public ReturnView(T data){
        this.data = data;
    }

    public ReturnView(T data,Integer code,String codeMsg){
        this.data = data;
        this.code = code;
        this.codeMsg = codeMsg;
    }

    public ReturnView(T data,Object code,Object codeMsg){
        this.data = data;
        this.code = (Integer) code;
        this.codeMsg = (String) codeMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getCodeMsg() {
        return codeMsg;
    }

    public void setCodeMsg(String codeMsg) {
        this.codeMsg = codeMsg;
    }
}
