package com.orangetalents.apirest.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args -> {
            User mariam = new User(
                            1L,
                            "Mariam",
                            "marian.jamal@gmail.com",
                            "123.452.132.651-01",
                            LocalDate.of(1988,5,25)
                    );
            User alex = new User(
                    "Alex",
                    "alex.jamal@gmail.com",
                    "123.452.320.400-01",
                    LocalDate.of(2004,5,30)
            );
            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
