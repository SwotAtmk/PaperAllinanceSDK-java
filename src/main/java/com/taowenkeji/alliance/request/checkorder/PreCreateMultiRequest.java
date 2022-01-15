package com.taowenkeji.alliance.request.checkorder;

import com.taowenkeji.alliance.AllianceConfig;

/**
 * api:/checkorder/preCreateMulti
 * 创建预支付定单-多篇论文
 * 响应结果：{
 *   "code": "string",
 *   "codeMsg": "string",
 *   "data": {
 *     "pay_id": "string",
 *     "cost_money": 0,
 *     "buyer_money": 0,
 *     "buyer_nums": 0,
 *     "papers": [
 *       {
 *         "paper_id": "string",
 *         "wordsnum": 0
 *       }
 *     ]
 *   }
 * }
 */
public class PreCreateMultiRequest extends PreCreateOneRequest {

    public PreCreateMultiRequest(AllianceConfig config) {
        super(config);
    }

    @Override
    public String getRequestUriImpl() {
        return "/checkorder/preCreateMulti";
    }
}
