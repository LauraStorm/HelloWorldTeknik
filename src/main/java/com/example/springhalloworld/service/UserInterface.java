package com.example.springhalloworld.service;

import com.example.springhalloworld.model.Bruger;

public interface UserInterface extends CRUDService<Bruger, Long >{
    //Vi extender, fordi dette UserInterface bliver en child class til CRUDService(Parentclass)
}
