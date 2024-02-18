package com.example.h2dbmemory.controllers;

import com.example.h2dbmemory.db.Users;
import com.example.h2dbmemory.repository.PersonRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "", produces = "application/json")
public class UserController {
    @Autowired
    private PersonRep personRep;
    @RequestMapping("create-person")
    public Users createPerson () {

        return personRep.save(new Users());

    }




    }



