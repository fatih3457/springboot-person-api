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
@RequestMapping("/api/persons")  // Tüm istekler bu path ile başlar
public class PersonController {

    private final PersonService personService;

    // Constructor injection, service katmanını kullanacağız
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    // POST /api/persons → Yeni kişi ekleme
    @PostMapping
    public ResponseEntity<Person> addPerson(@RequestBody @Valid PersonDTO personDTO) {
        Person savedPerson = personService.addPerson(personDTO);
        // Kaydedilen kişiyi 201 Created ile dönüyoruz
        return new ResponseEntity<>(savedPerson, HttpStatus.CREATED);
    }

    // GET /api/persons → Tüm kişileri listele
    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    // PUT /api/persons/{id} → Var olan kişiyi güncelle
    @PutMapping("/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable Long id, @RequestBody @Valid PersonDTO personDTO) {
        Person updatedPerson = personService.updatePerson(id, personDTO);
        // Güncellenen kişiyi 200 OK ile dönüyoruz
        return new ResponseEntity<>(updatedPerson, HttpStatus.OK);
    }

    // DELETE /api/persons/{id} → Kişiyi sil
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
        // Silme başarılı ise 204 No Content dönüyoruz (body yok)
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
