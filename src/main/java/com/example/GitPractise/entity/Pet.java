package com.example.GitPractise.entity;

import jakarta.persistence.*;

@Entity
@Table(name="petmanager")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;

    @Column(name ="pet_name")
    private String petName;

    @Column(name ="species")
    private String species;

    @Column(name ="owner_name")
    private String ownerName;

    public Pet(){};

    public Pet(String petName, String species, String ownerName) {
        this.petName = petName;
        this.species = species;
        this.ownerName = ownerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", petName='" + petName + '\'' +
                ", species='" + species + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
