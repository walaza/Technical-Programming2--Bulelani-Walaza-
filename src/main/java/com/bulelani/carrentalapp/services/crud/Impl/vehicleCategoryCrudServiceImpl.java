/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.services.crud.Impl;

import com.bulelani.carrentalapp.model.vehicleCategory;
import com.bulelani.carrentalapp.services.crud.vehicleCategoryCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bulelani
 */
public class vehicleCategoryCrudServiceImpl implements vehicleCategoryCrudservice{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public vehicleCategory find(String id) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public vehicleCategory persist(vehicleCategory entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public vehicleCategory merge(vehicleCategory entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public vehicleCategory remove(vehicleCategory entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<vehicleCategory> findAll() {
       return null;
    }
    
}
