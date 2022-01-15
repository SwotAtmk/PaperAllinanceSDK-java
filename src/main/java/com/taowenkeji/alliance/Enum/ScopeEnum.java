package com.taowenkeji.alliance.Enum;

/**
 * api作用域 可选 目前可选值为js与background
 * scope默认行为为js，当在前端使用js调用时请务必设置值为js
 * background:结果将返回敏感值，如卖家检测成本
 * js:仅返回买家公开字段，不包含敏感值
 */
public enum ScopeEnum {
    js,
    background
}
