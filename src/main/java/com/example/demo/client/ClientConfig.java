package com.example.demo.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class ClientConfig {

    @Bean
    CommandLineRunner commandLineRunner(ClientRepository clientRepository){
        return args -> {
            Client Matviy = new Client(
                    "matviyko@gmail.com",
                    "matviyko@gmail.com",
                    "Matviy",
                    "Hrihorov",
                    LocalDate.of(2000, APRIL, 12),
                    380962641232L,
                    "Kyiv");

            Client Serhiy = new Client(
                    "serhiyko@gmail.com",
                    "qwerty123456",
                    "Seriy",
                    "Hrihorov",
                    LocalDate.of(2012, JANUARY, 19),
                    380962641232L,
                    "Briansk");

            clientRepository.saveAll(
                    List.of(Matviy, Serhiy)
            );
        };
    }
}
