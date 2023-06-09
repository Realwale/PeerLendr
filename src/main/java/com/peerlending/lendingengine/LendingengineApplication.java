package com.peerlending.lendingengine;

import com.peerlending.lendingengine.domain.model.User;
import com.peerlending.lendingengine.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LendingengineApplication implements CommandLineRunner {


    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(LendingengineApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        userRepository.save(new User(2, "jude", "emeka", 15, "farmer"));
       userRepository.save(new User(1, "John",
               "eve", 17,
               "software developer"));
    }
}
