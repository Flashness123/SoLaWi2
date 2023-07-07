package com.myproject.PKA;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PersonRepository extends CrudRepository<Person,Long> {
    Person findByFirstName(String firstName);
    List<Person> findByNumber(Integer number);

}
