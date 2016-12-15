package com.models.database;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class ClassDAOImpl implements ClassDAO {

    @PersistenceContext
    private EntityManager em;

    

}
