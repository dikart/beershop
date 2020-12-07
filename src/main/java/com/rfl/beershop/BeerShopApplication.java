package com.rfl.beershop;

import com.rfl.beershop.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@AllArgsConstructor
@SpringBootApplication
public class BeerShopApplication implements ApplicationRunner {

    private final UserRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(BeerShopApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        repo.findAll().forEach(System.out::println);
    }
}