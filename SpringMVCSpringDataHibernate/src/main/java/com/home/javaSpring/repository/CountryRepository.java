package com.home.javaSpring.repository;

import com.home.javaSpring.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country,Integer> { 
    
}