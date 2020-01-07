package com.mindtree.roombooking.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.roombooking.entity.User;
import com.mindtree.roombooking.repository.UserRepository;
import com.mindtree.roombooking.service.UserService;
@Service
public class UserServiceImpl implements UserService{
@Autowired
UserRepository userrepository;
	@Override
	public void insertUser(User user) {
		userrepository.save(user);
		
	}
	@Override
	public List<User> getUserlist() {
		List<User>userlist=userrepository.findAll();
		return userlist;
	}

}
