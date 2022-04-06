package com.medicine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicine.model.Items;
import com.medicine.model.User;
import com.medicine.service.RegistrationService;

@RestController

public class RegistrationController {

	@Autowired
	private RegistrationService service;

	@PostMapping("/registeruser")
	@CrossOrigin(origins = "http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempEmail = user.getEmailId();
		if (tempEmail != null && !"".equals(tempEmail)) {
			User userObj = service.fetchUserByEmailId(tempEmail);
			if (userObj != null) {
				throw new Exception("user with " + tempEmail + " is already exist");
			}
		}
		User userObj = null;
		userObj = service.saveUser(user);
		return userObj;
	}

	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmail = user.getEmailId();
		String tempPass = user.getPassword();
		User userObj = null;
		if (tempEmail != null && tempPass != null) {
			userObj = service.fetchUserByEmailIdAndPass(tempEmail, tempPass);
		}
		if (userObj == null) {
			throw new Exception("Bad Credentials");
		}
		return userObj;
	}

	@GetMapping("/vusers")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<User> getAllUser() {
		return service.getAllUser();

	}

}
