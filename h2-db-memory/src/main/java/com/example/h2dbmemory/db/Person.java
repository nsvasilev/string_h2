package com.example.h2dbmemory.db;

import jakarta.persistence.*;

@Entity
//@Table(name = "PERSON")
public class Person {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Id генерируется автоматически
    @Column(name = "Id", nullable = false)
    private Long id;

   @Column(name = "user_name")
    private String username ;

    public Person(String username) {
        this.username = username;
    }

    public Person() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
