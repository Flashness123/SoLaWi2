//TODO
// why .class? also btw what is this
package com.myproject.PKA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringPkaDemoApplication {
    private static final Logger log = LoggerFactory.getLogger(SpringPkaDemoApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SpringPkaDemoApplication.class, args);

    }
    @Bean
    public CommandLineRunner demo(PersonRepository personRepository){
        return(args) -> {
            personRepository.save(new Person(0,"Dieter", "Karst"));
            personRepository.save(new Person(1,"Peter", "Ohar"));
            personRepository.save(new Person(2,"Detlef", "Vogt"));

            log.info("Person found with findAll()");
            log.info("-------------------------");
            for (Person person : personRepository.findAll()) {
                log.info(person.toString());
            }
        };
    }

}
