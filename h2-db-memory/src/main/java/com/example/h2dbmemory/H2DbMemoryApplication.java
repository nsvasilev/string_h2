package com.example.h2dbmemory;

import com.example.h2dbmemory.db.Users;
import com.example.h2dbmemory.repository.PersonRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class H2DbMemoryApplication {


	public static void main(String[] args) {
		SpringApplication.run(H2DbMemoryApplication.class, args);

	}

}
