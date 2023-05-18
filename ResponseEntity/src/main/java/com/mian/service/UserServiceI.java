package com.mian.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.mian.model.User;

public interface UserServiceI  {

	public User saveUserData(User user);

	public Iterable<User> getUsers();

	public Optional<User> getUser(int id);

	public User updateUser(User user, int id);

	public void deleteUser(int id);



}
