/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.model;

import java.util.Objects;

/**
 *
 * @author bulelani
 */
public class hiredVehicles {
    private String name;
    private String regNum;
    private String category;
    
    private hiredVehicles(){
      
    }
    private hiredVehicles(Builder builder){
        name = builder.name; 
        regNum = builder.regNum;
        category = builder.category;
    }   
    public static class Builder{
        private String name;
        private String regNum;
        private String category;
        
        public Builder(String name){
            this.name = name;
            
        }
        public Builder regNum(String value){
            regNum = value;
            return this;
        }
        public Builder category(String value){
            category = value;
            return this;
        }
        public hiredVehicles build(){
            return new hiredVehicles(this);
        }
    }
    public String getName() {
        return name;
    }

    public String getRegNum() {
        return regNum;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.regNum);
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
        final hiredVehicles other = (hiredVehicles) obj;
        return true;
    }
    
}
