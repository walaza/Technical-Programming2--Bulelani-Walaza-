/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.model;

import com.bulelani.carrentalapp.model.addVehicle.Builder;
import java.util.Objects;

/**
 *
 * @author bulelani
 */
public class availableCars {
    private String name;
    private String regNum;
    private boolean avail;

    private availableCars()
    {
        
    }
     private availableCars(Builder builder){
         name = builder.name;
         regNum = builder.regNum;
         avail = builder.avail;
     }
     public static class Builder{
        private String name;
        private String regNum;
        private boolean avail;
        
        public Builder(String name){
            this.name =name;
        }
        public Builder regNum(String value){
            regNum = value;
            return this;
        }
        public Builder avail(Boolean avail){
            this.avail= avail;
            return this;
        }
        public availableCars build(){
            return new availableCars(this);
        }
                
         
     }

    public boolean isAvail() {
        avail = true;
        return avail;
    }
     
    public String getName() {
        return name;
    }

    public String getRegNum() {
        return regNum;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.regNum);
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
        final availableCars other = (availableCars) obj;
        return true;
    }
    
}
