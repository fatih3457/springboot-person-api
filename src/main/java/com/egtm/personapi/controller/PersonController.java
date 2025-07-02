package com.egtm.personapi.controller;

import com.egtm.personapi.dto.PersonDTO;
import com.egtm.personapi.model.Person;
import com.egtm.personapi.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<Person> addPerson(@RequestBody @Valid PersonDTO personDTO) {
        Person savedPerson = personService.addPerson(personDTO);
        return new ResponseEntity<>(savedPerson, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }
}
