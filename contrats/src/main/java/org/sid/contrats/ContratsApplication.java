package org.sid.contrats;

import org.sid.contrats.model.Contrat;
import org.sid.contrats.repository.ContratRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.Random;

@SpringBootApplication
public class ContratsApplication {

    public static void main(String[] args) {
        org.sid.contrats.aspects.ApplicationContext.authenticateUser("root","1234",new String[]{"ADMIN"});
        SpringApplication.run(ContratsApplication.class, args);
    }
   /* @Bean
    CommandLineRunner start(ContratRepository contratRepository){
        return args -> {
            contratRepository.save(new Contrat(null,"Contrat 1",new Date(),1+new Random().nextDouble(),"khadija","M123456"));
            contratRepository.save(new Contrat(null,"Contrat 2",new Date(),1+new Random().nextDouble(),"naima","M123457"));
            contratRepository.save(new Contrat(null,"Contrat 3",new Date(),1+new Random().nextDouble(),"rania","M123458"));
        };
    }*/

}

