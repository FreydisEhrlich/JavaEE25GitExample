package com.example.GitPractise.dao;

import com.example.GitPractise.entity.Pet;

import java.util.List;

public interface PetDAO {
    public List<Pet> findAll();
}
