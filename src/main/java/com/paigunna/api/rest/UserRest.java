package com.paigunna.api.rest;

import com.paigunna.api.domain.User;
import com.paigunna.api.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRest {

    @Autowired
    UserRepo userRepo;

    @GetMapping
    public List<User> getAllUser(){
        return userRepo.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return userRepo.findOne(id);
    }
}
