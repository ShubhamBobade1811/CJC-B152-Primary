package com.mian.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mian.Repository.UserRepos;
import com.mian.model.User;


@Service
public class UserServiceIml implements UserServiceI {

	
	@Autowired
	UserRepos hr;
	
	@Override
	public User saveUserData(User user) {
		
		User u = hr.save(user);
		return u;
	}

	@Override
	public Iterable<User> getUsers() {
		Iterable<User> l = hr.findAll();
		return l;
	}

	@Override
	public Optional<User> getUser(int id) {
		return hr.findById(id);
	}

	@Override
	public User updateUser(User user, int id) {
		Optional<User> ou= hr.findById(id);
		
		if( ou.isPresent() ) {
			user.setId(ou.get().getId());
			return hr.save(user);
		}
		else {
			return new User();
		}
	}

	@Override
	public void deleteUser(int id) {
		
		Optional<User> ou = hr.findById(id);
		if(ou.isPresent()) {
			hr.deleteById(id);
		}
		
		else {
			
		}
		
		
	}


}
