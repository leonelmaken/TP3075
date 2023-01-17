package com.momo.momo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.momo.momo.entities.Admin;
import com.momo.momo.entities.ResponsableDeCoin;
import com.momo.momo.entities.User;
import com.momo.momo.service.api.AdminService;
import com.momo.momo.service.api.ResponsableDeCoinService;
import com.momo.momo.service.api.UserService;

@RestController
@RequestMapping(path="/Admin")
public class AdminControler {
 
	@Autowired
	AdminService adminService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	ResponsableDeCoinService responsableDeCoinService;
	
	@PostMapping(path="/createAdmin")
	public ResponseEntity<String> createAdmin(@RequestBody Admin admin) {
		return adminService.saveAdmin(admin);	
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
	@DeleteMapping(path="/deleteAdmin/{id}")
	public String deleteAdmin(@PathVariable Long id) {
		return adminService.deleteAdminById(id);
	}
	@GetMapping(path="/readAdmin")
	public List<Admin>  readAdmin(){
		return adminService.getAllAdmins();	
	}
	@GetMapping(path="/readAdminUser")
	public List<User>  readAdminUser(){
		return adminService.getAllUsers();	
	}
	@GetMapping(path="/readRespons")
	public List<ResponsableDeCoin>  readRespons(){
		return responsableDeCoinService.getAllResponsD();	
	}
	@GetMapping(path="/readResponsById")
	public ResponsableDeCoin  readResponsById(Long id){
		return responsableDeCoinService.getRespon(id);	
	}
	@PostMapping(path="/createRespons")
	public ResponseEntity<String> createRespons(@RequestBody ResponsableDeCoin respons) {
		return responsableDeCoinService.saveRespon(respons);	
	}
	@DeleteMapping(path="/deleteRespons/{id}")
	public String deleteRespons(@PathVariable Long id) {
		return responsableDeCoinService.deleteResponById(id);
	}
	
}
