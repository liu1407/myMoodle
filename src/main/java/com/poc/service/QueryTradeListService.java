package com.poc.service;

import java.util.Map;

/**
 * 查询交易明细
 * @author Administrator
 *参数：
 *cardNo	卡号
 *startDate	开始时间
 *endDate	结束时间
 *tradeType	交易类型
 *<br>
 *返回信息;
 *tradeStatus	交易状态
 *totalAmont	总金额
 *totalNum		总笔数	
 */
public class QueryTradeListService implements BaseService{
	
	/**
	 * 1、查询交易信息，设置返回信息
	 */
	@Override
	public void doService(Map<String, Object> context) {
		// TODO Auto-generated method stub
		
	}
}
