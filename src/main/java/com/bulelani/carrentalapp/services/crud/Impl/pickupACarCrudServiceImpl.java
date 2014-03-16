/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.services.crud.Impl;

import com.bulelani.carrentalapp.model.pickupACar;
import com.bulelani.carrentalapp.services.crud.pickupACarCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bulelani
 */
public class pickupACarCrudServiceImpl implements pickupACarCrudservice{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public pickupACar find(String id) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public pickupACar persist(pickupACar entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public pickupACar merge(pickupACar entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public pickupACar remove(pickupACar entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<pickupACar> findAll() {
       return null;
    }
    
}
