package com.myproject.PKA;
//TODO
//  PersonProcessor erklaren lassen

import java.util.HashMap;
import java.util.Map;

public class PersonManager {
    private Map<Integer, Person> personMap;

    public PersonManager() {
        personMap = new HashMap<>();
    }

    public void addPerson(Person person) {
        personMap.put(person.getId(), person);
    }

    public void removePerson(int id) {
        personMap.remove(id);
    }

    public Person findPerson(int id) {
        return personMap.get(id);
    }

    public int getPersonCount() {
        return personMap.size();
    }

    public void getAllPersons() {
        for (Person person : personMap.values()) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
    }
    /*
    void processPersons(PersonProcessor processor) {
        for (Person person : personMap.values()) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getEmail());
        }
    }*/
    public void processPersons(PersonProcessor processor) {
        for (Person person : personMap.values()) {
            processor.process(person);
        }
    }
}
