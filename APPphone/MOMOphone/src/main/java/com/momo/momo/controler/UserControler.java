package com.momo.momo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.momo.momo.entities.User;
import com.momo.momo.service.api.UserService;

@RestController
@RequestMapping(path="/User") 
public class UserControler {

	@Autowired
	UserService userService;
	@PostMapping(path="/createUser")
	public ResponseEntity<String> createUser(@RequestBody User user) {
		return userService.saveUser(user);	
	}
	
	@GetMapping(path="/readUser")
	public List<User>  readUser(){
		return userService.getAllUsers();	
	}
	@GetMapping(path="/readUserId/{id}")
	public User  readUserId(@PathVariable Long id){
		return userService.getUser(id);	
	}
	@DeleteMapping(path="/deleteUser/{id}")
	public String deleteUser(@PathVariable Long id) {
		return userService.deleteUserById(id);
	}
}
