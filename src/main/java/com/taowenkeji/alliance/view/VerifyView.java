package com.taowenkeji.alliance.view;

public class VerifyView {
    private boolean success=true;
    private String message;
    private int code=-1;

    private VerifyView(){}

    private VerifyView(boolean success){
        this.success = success;
    }

    private VerifyView(boolean success,String message){
        this.success = success;
        this.message = message;
    }

    private VerifyView(boolean success,String message,int code){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public static VerifyView getInstance(){
        return new VerifyView();
    }

    public static VerifyView getInstance(boolean success){
        return new VerifyView(success);
    }

    public static VerifyView getInstance(boolean success,String message) {
        return new VerifyView(success,message);
    }
    public static VerifyView getInstance(boolean success,String message,int code) {
        return new VerifyView(success,message,code);
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
