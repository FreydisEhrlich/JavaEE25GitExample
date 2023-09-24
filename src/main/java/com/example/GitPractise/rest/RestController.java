package com.example.GitPractise.rest;

import com.example.GitPractise.entity.Pet;
import com.example.GitPractise.service.PetService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/pets/{petId}")
    public Pet getEmployee(@PathVariable int petId){
        Pet thePet = petService.findById(petId);
        if(thePet == null){
            throw new RuntimeException("Pet id not found - " + petId);
        }
        return thePet;
    }

    @PostMapping("/pets")
    public Pet addPet(@RequestBody Pet thePet){
        thePet.setId(0);//sql understands that it is nothing, and assigns new id
        petService.save(thePet);
        return thePet;
    }
}
