/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.services.crud.Impl;

import com.bulelani.carrentalapp.model.insurance;
import com.bulelani.carrentalapp.services.crud.insuranceCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bulelani
 */
public class insuranceCrudServiceImpl implements insuranceCrudservice{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public insurance find(String id) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public insurance persist(insurance entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public insurance merge(insurance entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public insurance remove(insurance entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<insurance> findAll() {
       return null;
    }
    
}
