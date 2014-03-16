/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.services.crud.Impl;

import com.bulelani.carrentalapp.model.rental;
import com.bulelani.carrentalapp.services.crud.rentalCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bulelani
 */
public class rentalCrudServiceImpl implements rentalCrudservice{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public rental find(String id) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public rental persist(rental entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public rental merge(rental entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public rental remove(rental entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<rental> findAll() {
       return null;
    }
    
}
