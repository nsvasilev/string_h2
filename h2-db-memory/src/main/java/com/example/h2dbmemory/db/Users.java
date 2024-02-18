package com.example.h2dbmemory.db;

import jakarta.persistence.*;

@Entity
//@Table(name = "PERSON")
public class Users {
    @jakarta.persistence.Id
    @GeneratedValue // Id генерируется автоматически
    @Column(name = "Id", nullable = false)
    private long Id;

   @Column(name = "user_name")
    private String username ;


//Создаем конструктор для корректной сервелизации
    public Users() {

    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;

    }
}
