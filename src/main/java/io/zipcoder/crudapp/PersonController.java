package io.zipcoder.crudapp;

import io.zipcoder.Model.Person;
import io.zipcoder.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
public class PersonController {


    private List<Person> people;
    @Autowired
    PersonService personService;

    @PostMapping("/people")
    public Person createPerson(Person p){
        return null;
        return personService.createPerson(p);
    }

    @GetMapping("/people/{id}")
    public Person getPerson(@PathVariable Integer id){
        return null;
        return personService.getPerson(id);
    }

    @GetMapping("/people")
    public List<Person> getPersonList(){
        return null;
        return personService.getPersonList();
    }

    @PutMapping("/people/{id}")
    public Person updatePerson(Person p, @PathVariable Integer id){
        return null;
        return personService.updatePerson(p, id);
    }
    @DeleteMapping("/people/{id}")
    public void deletePerson(@PathVariable Integer id){

        personService.deletePerson(id);
    }

}