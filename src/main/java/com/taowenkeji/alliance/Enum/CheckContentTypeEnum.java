package com.taowenkeji.alliance.Enum;

/**
 * 检测内容类型
 * text:纯文本
 * fid:文件ID提交,请将content的值设置为fid
 * filebytes:二进制字节流
 * base64_filebytes:二进制字节的base64编码
 * formdata:使用http协议multipart/form-data提交文件
 */
public enum CheckContentTypeEnum {
    text,
    filebytes,
    base64_filebytes,
    formdata
}
