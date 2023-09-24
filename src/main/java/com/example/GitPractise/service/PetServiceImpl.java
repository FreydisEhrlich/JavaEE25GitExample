package com.example.GitPractise.service;

import com.example.GitPractise.dao.PetDAO;
import com.example.GitPractise.entity.Pet;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements PetService{
    private PetDAO petDAO;
    @Autowired
    public PetServiceImpl(PetDAO petDAO){
        this.petDAO = petDAO;
    }
    @Override
    @Transactional
    public List<Pet> findAll() {
        return petDAO.findAll();
    }
}
