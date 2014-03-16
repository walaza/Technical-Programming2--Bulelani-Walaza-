/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.services.crud.Impl;

import com.bulelani.carrentalapp.model.customer;
import com.bulelani.carrentalapp.services.crud.customerCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bulelani
 */
public class customerCrudServiceImpl implements customerCrudservice {

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public customer find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public customer persist(customer entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public customer merge(customer entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public customer remove(customer entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<customer> findAll() {
        return null;
    }
    
}
