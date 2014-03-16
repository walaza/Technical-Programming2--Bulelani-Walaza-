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
public final class addSUV {
    private String suvVendor;
    private String model;
    private String colour;
    private int numOfAdded;
    
    private addSUV(){
        
    }
    private addSUV(Builder builder){
     suvVendor = builder.suvVendor;
     model = builder.model;
     colour = builder.colour;
     numOfAdded = builder.numOfAdded;
    }
    public static class Builder{
        private String suvVendor;
        private String model;
        private String colour;
        private int numOfAdded;
        
        public Builder(String suvVend){
            this.suvVendor = suvVendor;
        }
        public Builder model(String value){
            model = value;
            return this;
        }
        public Builder colour(String value){
            colour  = value;
            return this;
        }
        public Builder numOfAdded(int value){
            numOfAdded = value;
            return this;
        }
        public addSUV build(){
            return new addSUV(this);
        }
    }

    public String getSuvVendor() {
        return suvVendor;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getNumOfAdded() {
        return numOfAdded;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.suvVendor);
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
        final addSUV other = (addSUV) obj;
        return true;
    }
    
}
