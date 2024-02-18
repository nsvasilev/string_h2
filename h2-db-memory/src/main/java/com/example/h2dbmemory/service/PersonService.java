package com.example.h2dbmemory.service;

import com.example.h2dbmemory.db.Person;
import com.example.h2dbmemory.repository.PersonRepository;
import org.springframework.stereotype.Service;


@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public Person createUser(String userName){
        Person person = new Person(userName);
        return personRepository.save(person);
    }

    public Person updateUserName(long id, String userName) {
        Person person = personRepository.findById(id).get();
        person.setUsername(userName);
        return personRepository.save(person);
    }

    public void deletePerson(long id) {
        personRepository.deleteById(id);
    }
}
