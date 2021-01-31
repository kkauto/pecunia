package com.project.pecunia.Controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.pecunia.model.User;
import com.project.pecunia.service.UserService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	
		@Autowired
		private UserService service;
		@PostMapping("/save-user")
		@Transactional
		public String registerUser(@RequestBody User user) {
			
			service.saveMyUser(user);
			return"Hello "+user.getFirstname()+" your registeration is succecssfull";
		}
			
		@GetMapping("/allusers")
		public Iterable<User> showAllUsers(){ 
			return service.showAllUsers();
		}
}
		

