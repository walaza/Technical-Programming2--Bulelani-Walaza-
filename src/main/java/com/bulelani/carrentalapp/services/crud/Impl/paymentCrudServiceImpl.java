/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.services.crud.Impl;

import com.bulelani.carrentalapp.model.payment;
import com.bulelani.carrentalapp.services.crud.paymentCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bulelani
 */
public class paymentCrudServiceImpl implements paymentCrudservice{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public payment find(String id) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public payment persist(payment entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public payment merge(payment entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public payment remove(payment entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<payment> findAll() {
       return null;
    }
    
}
