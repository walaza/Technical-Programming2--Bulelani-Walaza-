/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.services.crud.Impl;

import com.bulelani.carrentalapp.model.listAllVehicle;
import com.bulelani.carrentalapp.services.crud.listAllVehicleCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bulelani
 */
public class listAllVehicleCrudServiceImpl implements listAllVehicleCrudservice{
      @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public listAllVehicle find(String id) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public listAllVehicle persist(listAllVehicle entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public listAllVehicle merge(listAllVehicle entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public listAllVehicle remove(listAllVehicle entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<listAllVehicle> findAll() {
       return null;
    }
}
