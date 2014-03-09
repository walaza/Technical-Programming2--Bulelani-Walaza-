/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.model;

import java.util.Locale.Builder;
import java.util.Objects;

/**
 *
 * @author bulelani
 */
public final class drivers {
    private String name;
    private String idNo;
    private drivers(){
        
    }
     private drivers(Builder builder){
      name = builder.name;
      idNo = builder.idNo;
     }
      public static class Builder{
        private String name;
        private String idNo;
         
        public Builder(String name){
            this.name = name;
        }
        public Builder idNo(String value){
            idNo = value;
            return this;
        }
        public drivers build(){
            return new drivers(this);
        }
      }
    public String getName() {
        return name;
    }

    public String getIdNo() {
        return idNo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.idNo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final drivers other = (drivers) obj;
        return true;
    }
    
}
