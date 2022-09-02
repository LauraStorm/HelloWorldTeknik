package com.example.springhalloworld.controller;

import com.example.springhalloworld.model.Bruger;
import com.example.springhalloworld.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/findAllUsers")
    public ResponseEntity<Set<Bruger>> getAllUsers (){
        //Gem listen
        Set<Bruger> allUsers = userService.findAll();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

    @PostMapping("/addUser")
    public ResponseEntity<Bruger> saveUser (Bruger user){
        userService.save(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Long> deleteUserById(@RequestParam ("id") Long id){
        userService.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Bruger> updateUser (@RequestParam ("id") long id, @RequestBody Bruger user){
        //Find user via id
        Bruger userToUpdate = userService.findById(id).get();
        //Ændre user's værdier
        userToUpdate.setUsername(user.getUsername());
        //Gem de nye værdier
        userService.save(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }


}
