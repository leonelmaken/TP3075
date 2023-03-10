package com.momo.momo.service.api;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.momo.momo.entities.Admin;
import com.momo.momo.entities.Compte;
import com.momo.momo.entities.Transaction;
import com.momo.momo.entities.User;

public interface AdminService {
	 ResponseEntity<String> saveAdmin(Admin admin);
	 ResponseEntity<String> updateAdmin(Admin admin,Long id);
	 String deleteAdminById(Long id);
	 Admin getAdmin(Long id);
	 Admin getAdminByUnsername(String username);
	 List<Compte> getAllComptes();
	 List<Admin> getAllAdmins();
	 Compte getCompte(int numeroTel);
	 List<User> getAllUsers();
	 List<Transaction> getAllTransactions();
	 Transaction getTransactionById(Long id);
}
