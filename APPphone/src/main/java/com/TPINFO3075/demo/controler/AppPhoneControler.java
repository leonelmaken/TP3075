package com.TPINFO3075.demo.controler;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Service.UserService;
import lombok.AllArgsConstructor;
import modele.Compte;

import java.util.List;

@RestController
@AllArgsConstructor
public class AppPhoneControler {

    private final UserService user = new UserService();

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Compte compte) {
        return user.CreerCompt(compte);
    }

    @PutMapping(value="/update/{idUser}")
    public ResponseEntity<String> update(@PathVariable long idUser,Compte compte) {
        return user.ModifierInfo(idUser, compte);
    }

    @DeleteMapping(value="/delete")
    public String delete(@PathVariable long idUser,String CodePin) {
        return user.SupprimerCompt(idUser, CodePin);
    }

    @GetMapping(value = "/transac")
    public List DernierTransac() {
        return user.DernierTransac();
    }

}
