package com.mindtree.roombooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.roombooking.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	

	User findByuserName(String userName);

}
