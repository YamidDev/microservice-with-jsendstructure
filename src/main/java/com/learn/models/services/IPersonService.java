package com.learn.models.services;

import com.learn.models.entity.Person;

import java.util.List;

public interface IPersonService {

    List<Person> findAll();

    Person save(Person person);

    Person findById(Integer id);

    void deleteById(Integer id);
}
