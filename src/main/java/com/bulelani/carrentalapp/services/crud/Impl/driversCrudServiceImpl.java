/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.services.crud.Impl;

import com.bulelani.carrentalapp.model.drivers;
import com.bulelani.carrentalapp.services.crud.driversCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bulelani
 */
public class driversCrudServiceImpl implements driversCrudservice{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public drivers find(String id) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public drivers persist(drivers entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public drivers merge(drivers entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public drivers remove(drivers entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<drivers> findAll() {
       return null;
    }
    
}
