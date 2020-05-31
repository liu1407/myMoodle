package com.poc.service;

import java.math.BigDecimal;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.TransientDataAccessException;
import org.springframework.stereotype.Service;

import com.poc.db.dao.Dao;
import com.poc.db.entity.CardInfo;
import com.poc.db.entity.TradeInfo;

/**
 * 消费交易
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
 */
@Service
public class PostService implements BaseService{

	/**
	 * 1、查卡片，判断额度是否足够，不足报错
	 * 2、足够，更新卡片消费金额和总金额
	 * 3、新增交易记录，设置返回信息
	 */
	@Autowired
	Dao dao;
	@Override
	public void doService(Map<String, Object> context) {
		// TODO Auto-generated method stub
		System.err.println("到这了" + context.get("msg").toString());
		CardInfo cardInfo = new CardInfo();
		cardInfo.setCardNo("6225880000000000001");
		cardInfo.setUserName("张三");
		BigDecimal  totalCrlmt = new BigDecimal(10000); 
		cardInfo.setTotalCrlmt(totalCrlmt);
		BigDecimal  remainCrlmt = new BigDecimal(10000);
		cardInfo.setRemainCrlmt(remainCrlmt);
		
		int iRet = dao.insert(cardInfo);
		if(iRet != 1){
			System.err.println("新增卡片失败");
		}else{
			System.out.println("新增卡片失败");
		}
		
		TradeInfo tradeInfo  = new TradeInfo();
		tradeInfo.setSerlNo("2020053017503500000001");
		tradeInfo.setCardNo("6225880000000000001");
		BigDecimal  amont = new BigDecimal(10000);
		tradeInfo.setAmont(amont);
		tradeInfo.setTradeCode("0001");
		tradeInfo.setTradeType("01");
		tradeInfo.setTradeStatusFlag("0");
		tradeInfo.setTradeDate("20200530");
		tradeInfo.setTradeTime("175035");
		tradeInfo.setDescr("消费交易-1000");
		
		iRet = dao.insert(tradeInfo);
		if(iRet != 1){
			System.err.println("新增交易失败");
		}else{
			System.out.println("新增交易失败");
		}
		
		cardInfo.setRemainCrlmt(amont);
		iRet = dao.insert(cardInfo);
		if(iRet != 1){
			System.err.println("修改卡片失败");
		}else{
			System.out.println("修改卡片失败");
		}
		
	}

	
}
