package com.pravass.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Login")
public class Login {
	
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "Id")
//	private long Id;
	
	@Id
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Password")
	private String password;
	
	
	@Override
	public String toString() {
		return "Login [email=" + email + ", password=" + password + "]";
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
