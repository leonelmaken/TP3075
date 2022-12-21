package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import modele.Compte;

public interface AppRepository extends JpaRepository<Compte, Long>{

}
