package com.perfree.mapper;

import java.util.List;

import com.perfree.entiy.User;

public interface UserMapper {

	List<String> getUserRoleByEmail(String email);

	User getUserByEmail(String email);

}
