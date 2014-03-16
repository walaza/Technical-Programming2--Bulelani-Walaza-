/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.services.crud.Impl;

import com.bulelani.carrentalapp.model.addVehicle;
import com.bulelani.carrentalapp.services.crud.addVehicleCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bulelani
 */
public class addVehicleCrudServiceImpl implements addVehicleCrudservice{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public addVehicle find(String id) {
            return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public addVehicle persist(addVehicle entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public addVehicle merge(addVehicle entity) {
       return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRED)
    public addVehicle remove(addVehicle entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<addVehicle> findAll() {
        return null;
    }
    
}
