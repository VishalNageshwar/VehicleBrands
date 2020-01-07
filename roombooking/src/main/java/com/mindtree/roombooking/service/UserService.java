package com.mindtree.roombooking.service;

import java.util.List;

import com.mindtree.roombooking.entity.User;

public interface UserService {

	void insertUser(User user);

	List<User> getUserlist();

}
