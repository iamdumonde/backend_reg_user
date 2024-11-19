package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserService {
    
    @Autowired
    private UserRepo repo;

    public String saveUser(User user) {

        repo.save(user);
        return "User registered Successfully";
    }

    public List<User> getAllUsers() {
        return repo.findAll(); // Récupère tous les utilisateurs de la base de donnée
    }
    
}
