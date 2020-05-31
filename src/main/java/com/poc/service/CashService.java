package com.poc.service;

import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * 取现交易
 * @author Administrator
 *参数：
 *cardNo	卡号
 *amont		金额
 *tradeCode	交易码
 *tradeType	交易类型
 *descr		描述/备注（非必选）
 *<br>
 *返回信息;
 *tradeStatus	交易状态
 *
 */
@Service
public class CashService implements BaseService{

	/**
	 * 1、查卡片，判断额度是否足够，不足报错
	 * 2、足够，更新卡片取现金额和总金额
	 * 3、新增交易记录，设置返回信息
	 */
	@Override
	public void doService(Map<String, Object> context) {
		// TODO Auto-generated method stub
		
	}
	
}
