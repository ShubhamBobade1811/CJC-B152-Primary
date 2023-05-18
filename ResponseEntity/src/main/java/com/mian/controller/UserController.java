package com.mian.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mian.model.User;
import com.mian.service.UserServiceI;

@RestController
public class UserController {

	@Autowired
	UserServiceI service;
	
	@PostMapping("/save")
	public ResponseEntity<User> saveUser(@RequestBody User user) {

		ResponseEntity<User> responseEntity=new ResponseEntity<User>(service.saveUserData(user), HttpStatus.NOT_FOUND);
		return responseEntity;
	}
	
	
	@GetMapping("/getUsers")
	public ResponseEntity<Iterable<User>> getUsersData(){
		ResponseEntity<Iterable<User>> list= new ResponseEntity<Iterable<User>>(service.getUsers(), HttpStatus.NOT_FOUND);
		return list;
	}
	
	@GetMapping("/getUser/{id}")
	public ResponseEntity<Optional<User>> getUserData(@PathVariable int id){
		ResponseEntity<Optional<User>> list= (ResponseEntity<Optional<User>>) new ResponseEntity<Optional<User>>(service.getUser(id), HttpStatus.NOT_FOUND);
		return list;
	}
	
	
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable ("id") int id){
		
		ResponseEntity<User> u = new ResponseEntity<User>(service.updateUser(user, id), HttpStatus.BAD_REQUEST); 
		return ResponseEntity.ok(user);
	}
	
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable ("id") int id) {
		service.deleteUser(id);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
	
	
	
}
