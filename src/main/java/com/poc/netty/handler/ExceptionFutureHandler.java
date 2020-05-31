package com.poc.netty.handler;

import org.springframework.stereotype.Component;

@Component
public class ExceptionFutureHandler implements Handler {

	private Handler nextHandler;
	
	public Handler getNextHandler(){
		return nextHandler;
	}
	
	public void setNextHandler(Handler handler){
		this.nextHandler = handler;
	}
	
	@Override
	public String hander(String msg) {
		// TODO Auto-generated method stub
		System.out.println("出现异常，异常信息：" + msg);
		if (nextHandler != null) {
			nextHandler.hander(msg);
		}
		return COMMONRET;
	}

}
