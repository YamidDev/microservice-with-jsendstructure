package com.learn.controllers;

import com.learn.models.entity.Person;
import com.learn.models.services.PersonService;
import jsend.JSendResponse;
import jsend.JSendStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api/v1")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping("/person/list")
    public List<Person> findAll(){
        return service.findAll();
    }

    @GetMapping("/person/{id}")
    public ResponseEntity<?> show(@PathVariable Integer id){
        Person person = service.findById(id);
        if(person == null) {
            return new ResponseEntity<>(
                    JSendResponse.fail("lo sentimos el registro : "+id.toString()+" no se encuentra"),
                    HttpStatus.NOT_FOUND);
        }
        try {
            return new ResponseEntity<>(
                    JSendResponse.success("person", service.findById(id),
                            "Persona: "+id.toString()+" Cargada con éxito"),
                    HttpStatus.OK);
        } catch (DataAccessException e) {
            return new ResponseEntity<>(JSendResponse.error(e.getMessage() +": "+
                    e.getMostSpecificCause().getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
