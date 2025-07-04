package com.egtm.personapi.service;

import com.egtm.personapi.dto.PersonDTO;
import com.egtm.personapi.model.Person;
import com.egtm.personapi.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  // Service katmanı olarak işaretledik
public class PersonService {

    private final PersonRepository personRepository;

    // Constructor ile repository bağımlılığını alıyoruz
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // Yeni kişi ekleme
    public Person addPerson(PersonDTO personDTO) {
        Person person = new Person();
        person.setName(personDTO.getName());
        person.setAge(personDTO.getAge());
        // Kaydet ve döndür
        return personRepository.save(person);
    }

    // Tüm kişileri getir
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    // Var olan kişiyi güncelle
    public Person updatePerson(Long id, PersonDTO personDTO) {
        // ID ile kişiyi bul, yoksa hata fırlat
        Person person = personRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Person not found with id: " + id));

        // Yeni verilerle güncelle
        person.setName(personDTO.getName());
        person.setAge(personDTO.getAge());

        // Kaydet ve döndür
        return personRepository.save(person);
    }

    // Kişiyi sil
    public void deletePerson(Long id) {
        Person person = personRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Person not found with id: " + id));
        personRepository.delete(person);
    }
}
