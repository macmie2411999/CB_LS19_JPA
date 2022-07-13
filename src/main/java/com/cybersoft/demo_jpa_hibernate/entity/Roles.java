package com.cybersoft.demo_jpa_hibernate.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "roles")
public class Roles {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "role_name")
	private String roleName;

	@OneToMany(mappedBy = "role")
	private Set<Users> listUsers;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	
	
}
