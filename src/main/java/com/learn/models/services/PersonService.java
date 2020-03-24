package com.learn.models.services;

import com.learn.models.dao.IPersonDao;
import com.learn.models.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService{
    @Autowired
    private IPersonDao repo;

    @Override
    public List<Person> findAll() {
        return repo.findAll();
    }

    @Override
    public Person save(Person person) {
        return repo.save(person);
    }

    @Override
    public Person findById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        repo.deleteById(id);
    }
}
