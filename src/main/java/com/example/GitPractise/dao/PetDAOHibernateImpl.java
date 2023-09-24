package com.example.GitPractise.dao;

import com.example.GitPractise.entity.Pet;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PetDAOHibernateImpl implements PetDAO {
    private EntityManager entityManager;

    @Autowired
    public PetDAOHibernateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Pet> findAll() {
        Session currentSession = entityManager.unwrap(org.hibernate.Session.class);
        Query<Pet> theQuery = currentSession.createQuery("from Pet", Pet.class);

        //Execute query and get result list
        List<Pet> pets = theQuery.getResultList();
        return pets;
    }
}