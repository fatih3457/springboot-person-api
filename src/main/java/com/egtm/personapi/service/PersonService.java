package com.egtm.personapi.service;

import com.egtm.personapi.dto.PersonDTO;
import com.egtm.personapi.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonService {

    private final List<Person> personList = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    public Person addPerson(PersonDTO dto) {
        Person person = new Person();
        person.setId(idCounter.getAndIncrement());
        person.setFirstName(dto.getFirstName());
        person.setLastName(dto.getLastName());
        person.setEmail(dto.getEmail());
        person.setAge(dto.getAge());

        personList.add(person);
        return person;
    }

    public List<Person> getAllPersons() {
        return personList;
    }
}
