package com.example.h2dbmemory.repository;

import com.example.h2dbmemory.db.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRep extends CrudRepository<Users, Long> {
}
