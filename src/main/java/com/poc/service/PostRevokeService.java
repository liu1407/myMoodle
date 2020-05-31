package com.poc.service;

import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * 消费撤销交易
 * @author Administrator
 *参数：
 *cardNo	卡号
 *amont		金额
 *tradeCode	交易码
 *tradeType	交易类型
 *descr		描述/备注（非必选）
 *oldSerlNo 原交易流水号
 *<br>
 *返回信息;
 *tradeStatus	交易状态
 *
 */
@Service
public class PostRevokeService implements BaseService{

	/**
	 * 1、查卡片，查原交易信息
	 * 2、判断原交易信息是否存在，不存在则报错
	 * 3、存在的话，判断消费类型是否是消费交易，判断状态是否已撤销
	 * 4、更新卡片消费金额和总金额，新增交易信息，设置返回信息
	 */
	@Override
	public void doService(Map<String, Object> context) {
		// TODO Auto-generated method stub
		
	}
	
}
