package com.example.GitPractise.service;

import com.example.GitPractise.entity.Pet;

import java.util.List;

public interface PetService {
    public List<Pet> findAll();
    public Pet findById(int theId);
    public void save(Pet thePet);
}
