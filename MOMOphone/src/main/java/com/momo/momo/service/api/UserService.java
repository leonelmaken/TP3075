package com.momo.momo.service.api;

import java.util.List;
import org.springframework.http.ResponseEntity;

import com.momo.momo.entities.User;

public interface UserService {
	ResponseEntity<String> saveUser(User user);
	ResponseEntity<String> updateUser(User user,Long id);
	String deleteUser(User user);
	String deleteUserById(Long id);
    User getUser(Long id);
	List<User> getAllUsers();
}
