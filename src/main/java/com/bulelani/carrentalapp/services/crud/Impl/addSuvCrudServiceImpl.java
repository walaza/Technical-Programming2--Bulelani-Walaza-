/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.services.crud.Impl;

import com.bulelani.carrentalapp.model.addSUV;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bulelani
 */
public class addSuvCrudServiceImpl implements addSuvCrudservice{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public addSUV find(String id) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public addSUV persist(addSUV entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public addSUV merge(addSUV entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public addSUV remove(addSUV entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<addSUV> findAll() {
       return null;
    }
    
}
