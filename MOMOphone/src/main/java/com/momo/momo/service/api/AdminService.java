package com.momo.momo.service.api;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.momo.momo.entities.Admin;
import com.momo.momo.entities.Compte;
import com.momo.momo.entities.User;

public interface AdminService {
	 ResponseEntity<String> saveAdmin(Admin admin);
	 ResponseEntity<String> updateAdmin(Admin admin,Long id);
	 String deleteAdminById(Long id);
	 Admin getAdmin(Long id);
	 List<Compte> getAllComptes();
	 Compte getCompte(int numeroTel);
	 List<User> getAllUsers();
	 String deleteUserById(Long id);
	 User getUser(Long id);
	 User getUser(int numeroTel);
}
