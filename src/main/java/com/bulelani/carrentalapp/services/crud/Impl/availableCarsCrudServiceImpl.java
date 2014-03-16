/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.services.crud.Impl;

import com.bulelani.carrentalapp.model.availableCars;
import com.bulelani.carrentalapp.services.crud.availableCarsCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bulelani
 */
public class availableCarsCrudServiceImpl implements availableCarsCrudservice{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public availableCars find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public availableCars persist(availableCars entity) {
      return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public availableCars merge(availableCars entity) {
      return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRED)
    public availableCars remove(availableCars entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<availableCars> findAll() {
        return null;
    }
    
}
