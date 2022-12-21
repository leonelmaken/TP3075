package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import modele.Compte;

public interface ComptRepository extends JpaRepository<Compte, Long>{

}
