package com.example.springhalloworld.repository;

import com.example.springhalloworld.model.Bruger;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository <Bruger, Long> {
    //Vi extender til CrudRepository, som allerede har metoder i sin class
}
