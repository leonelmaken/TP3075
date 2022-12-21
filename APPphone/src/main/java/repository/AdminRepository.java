package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import modele.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{

}
