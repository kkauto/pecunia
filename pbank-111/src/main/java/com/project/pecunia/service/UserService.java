package com.project.pecunia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pecunia.model.User;
import com.project.pecunia.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	public UserService() {}
	public UserService(UserRepository repo) { //nthino vendi thalakuna sambar
		super();
		this.repo = repo;
	}
	public void saveMyUser(User user) {
		repo.save(user);
		
	}
	public Iterable<User> showAllUsers(){
		return repo.findAll();
	}
}
