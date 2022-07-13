package com.cybersoft.demo_jpa_hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.demo_jpa_hibernate.entity.Roles;
import com.cybersoft.demo_jpa_hibernate.entity.Users;
import com.cybersoft.demo_jpa_hibernate.services.UsersServiceImp;
import com.cybersoft.demo_jpa_hibernate.services.UsersServices;

@RestController
@RequestMapping("/account")
public class UsersController {
	
	@Autowired
	UsersServiceImp serviceImp;
	
	@GetMapping("")
	public ResponseEntity<?> index(){
		return new ResponseEntity<List<Users>>(
				serviceImp.getAllUser(), HttpStatus.OK);
	}
	
	@GetMapping("/{username}")
	public ResponseEntity<?> getUsersByUserName(
			@PathVariable("username") String username){
		return new ResponseEntity<List<Users>>(
				serviceImp.getUsersByUserName(username), HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<?> getUsersByUserName(
			@RequestBody Users users){
		serviceImp.insertUsers(users);

		return new ResponseEntity<String>(
				"", HttpStatus.OK);
	}

//	@PostMapping("/createDemo")
//	public ResponseEntity<?> getUsersByUserNameDemo(
//			@RequestParam("username") String username,
//			@RequestParam("role_id") int role_id){
//		Users users = new Users();
//		users.setUserName(username);
//		Roles roles = new Roles();
//		roles.setId(role_id);
//		users.setRole(roles);
//		serviceImp.insertUsers(users);
//
//		return new ResponseEntity<String>(
//				"", HttpStatus.OK);
//	}

	@GetMapping("/delete/{id}")
	public ResponseEntity<?> deleteUserById(
			@PathVariable("id") int id){
		serviceImp.deleteUsersById(id);
		return new ResponseEntity<String>(
				"", HttpStatus.OK);
	} 
	
	/* Tạo API thêm Users mới
	 * Tạo API xoá users theo ID
	 * */
	
}
