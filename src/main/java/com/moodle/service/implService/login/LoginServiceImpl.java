package com.moodle.service.implService.login;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.moodle.db.entity.User;


public interface LoginServiceImpl {

	public Map<String, Object> login(User user);
	public Map<String, Object> register(User user);
}
