package com.perfree.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfree.entiy.User;
import com.perfree.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User findByUserName(String userName) {
		System.out.println(userName);
		User user = userMapper.getUserByEmail(userName);
		return user;
	}

}
