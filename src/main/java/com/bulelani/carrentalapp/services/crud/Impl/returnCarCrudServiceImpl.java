/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.services.crud.Impl;

import com.bulelani.carrentalapp.model.returnCar;
import com.bulelani.carrentalapp.services.crud.returnCarCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bulelani
 */
public class returnCarCrudServiceImpl implements returnCarCrudservice{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public returnCar find(String id) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public returnCar persist(returnCar entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public returnCar merge(returnCar entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public returnCar remove(returnCar entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<returnCar> findAll() {
       return null;
    }
    
}
