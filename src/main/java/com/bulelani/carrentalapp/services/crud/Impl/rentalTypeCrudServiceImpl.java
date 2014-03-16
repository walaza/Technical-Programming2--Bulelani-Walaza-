/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.services.crud.Impl;

import com.bulelani.carrentalapp.model.rentalType;
import com.bulelani.carrentalapp.services.crud.rentalTypeCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bulelani
 */
public class rentalTypeCrudServiceImpl implements rentalTypeCrudservice{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public rentalType find(String id) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public rentalType persist(rentalType entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public rentalType merge(rentalType entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public rentalType remove(rentalType entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<rentalType> findAll() {
       return null;
    }
    
}
