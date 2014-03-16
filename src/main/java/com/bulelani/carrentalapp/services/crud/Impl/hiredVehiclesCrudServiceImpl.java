/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.services.crud.Impl;

import com.bulelani.carrentalapp.model.hiredVehicles;
import com.bulelani.carrentalapp.services.crud.hiredVehiclesCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bulelani
 */
public class hiredVehiclesCrudServiceImpl implements hiredVehiclesCrudservice{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public hiredVehicles find(String id) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public hiredVehicles persist(hiredVehicles entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public hiredVehicles merge(hiredVehicles entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public hiredVehicles remove(hiredVehicles entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<hiredVehicles> findAll() {
       return null;
    }
    
}
