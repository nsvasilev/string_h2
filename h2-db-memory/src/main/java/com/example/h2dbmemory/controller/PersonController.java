package com.example.h2dbmemory.controller;

import com.example.h2dbmemory.db.Person;
import com.example.h2dbmemory.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/create/{userName}")
    public Person createPerson(@PathVariable String userName) {
        return personService.createUser(userName);
    }

    /**
     * @param id       - id пользователя, которому мы меняем имя
     * @param userName - имя которое собираемся сохранить в БД
     * @return изменённого пользователя
     */
    @GetMapping("/update/{id}/{userName}")
    public Person updatePerson(@PathVariable long id, @PathVariable String userName) {
        return personService.updateUserName(id, userName);
    }

    @GetMapping("/delete/{id}")
    public String deletePerson(@PathVariable long id) {
        personService.deletePerson(id);
        return "ОК";
    }

}



