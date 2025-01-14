package com.compagny.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApiController {

    @Autowired
    private PersonneRepository personneRepository;

    @RequestMapping("/api")
    public String index() {
        return "API disponible !";
    }

    @GetMapping(value = "/api/personnes")
    public List<Personne> getPersonnes() {
        return personneRepository.findAll();
    }

    @PostMapping(value = "/api/personnes")
    public Personne addPersonne(@RequestBody Personne personne) {
        return personneRepository.saveAndFlush(personne);
    }

    @DeleteMapping(value = "/api/personnes/{id}")
    public void deletePersonne(@RequestBody Personne personne) {
        personneRepository.delete(personne);
    }
}
