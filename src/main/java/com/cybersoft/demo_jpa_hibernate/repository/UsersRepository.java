package com.cybersoft.demo_jpa_hibernate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybersoft.demo_jpa_hibernate.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
	List<Users> findAll();
	List<Users> findByuserName(String username);
}

