package com.moodle.service.login;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moodle.db.dao.Dao;
import com.moodle.db.entity.User;
import com.moodle.service.implService.login.LoginServiceImpl;
import com.moodle.util.CommonUtils;
@Service
public class LoginService implements LoginServiceImpl {

	
	
	@Autowired
	Dao dao;
	
	private static final Logger logger = LoggerFactory.getLogger(LoginService.class);
	@Override
	public Map<String, Object> login(User user) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("retCode", "0");
		
		user = dao.selectOne("User.selectByUserName",user,false);
		//0-登陆成功、1-密码错误、2-用户类型不匹配、3-用户名不存在、-1-其他错误
		//用户名不存在
		if(CommonUtils.isEmpty(user)){
			map.put("retCode", "3");
			map.put("msg", "用户不存在");
			return map;
		}
		
		if(user.getPassword().equals(user.getPassword()) == false){
			map.put("retCode", "1");
			map.put("msg", "密码错误");
			return map;
		}
		
//		if(user.getUserType().equals(Suser.getUserType()) == false){
//			map.put("retCode", "2");
//			map.put("msg", "用户类型不匹配");
//		}
			
		map.put("user", user);
		return map;
	}

	@Override
	public Map<String, Object> register(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
