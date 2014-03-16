/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.services.crud.Impl;

import com.bulelani.carrentalapp.model.bookings;
import com.bulelani.carrentalapp.services.crud.bookingsCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bulelani
 */
public class bookingsCrudServiceImpl implements bookingsCrudservice{

    @Override
     @Transactional(propagation = Propagation.SUPPORTS)
    public bookings find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public bookings persist(bookings entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public bookings merge(bookings entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public bookings remove(bookings entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<bookings> findAll() {
        return null;
    }
    
}
