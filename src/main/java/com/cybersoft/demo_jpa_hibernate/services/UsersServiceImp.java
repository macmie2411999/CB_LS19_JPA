package com.cybersoft.demo_jpa_hibernate.services;

import java.util.List;

import com.cybersoft.demo_jpa_hibernate.entity.Users;

public interface UsersServiceImp {
	List<Users> getAllUser();
	List<Users> getUsersByUserName(String username);
	void insertUsers(Users users);
	void deleteUsersById(Integer id);
}
