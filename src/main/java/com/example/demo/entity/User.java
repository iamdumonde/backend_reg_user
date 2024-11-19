package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //for getter and setter method add lombok annotation
@AllArgsConstructor //lombok annotation
@NoArgsConstructor
@Entity //to create the table
@Table(name = "user_tab") //for the table name
public class User {

    @Id //for id to be primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String mobile;
    private String address;
}
