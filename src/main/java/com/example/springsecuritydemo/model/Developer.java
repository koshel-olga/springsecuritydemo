package com.example.springsecuritydemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Developer {
    private Long id;
    private String name;
}
