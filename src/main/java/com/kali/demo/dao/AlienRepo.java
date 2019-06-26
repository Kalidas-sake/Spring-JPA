package com.kali.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.kali.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{

}
