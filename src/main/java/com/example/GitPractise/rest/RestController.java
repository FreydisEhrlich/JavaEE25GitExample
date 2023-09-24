package com.example.GitPractise.rest;

import com.example.GitPractise.entity.Pet;
import com.example.GitPractise.service.PetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private PetService petService;

    public RestController(PetService petService){
        this.petService = petService;
    }

    @GetMapping("/pets")
    public List<Pet> findAll(){
        return petService.findAll();
    }
}
