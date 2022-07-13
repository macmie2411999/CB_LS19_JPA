package com.cybersoft.demo_jpa_hibernate.services;

import com.cybersoft.demo_jpa_hibernate.entity.Users;
import com.cybersoft.demo_jpa_hibernate.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServicesDemo implements UsersServiceImp {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public List<Users> getAllUser() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Users> getUsersByUserName(String username) {
        return null;
    }

    @Override
    public void insertUsers(Users users) {

    }

    @Override
    public void deleteUsersById(Integer id) {

    }
}
