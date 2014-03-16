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
public final class listAllVehicle {
    private String name;
    private String regNum;
    private String  colour;
    private String category;
    
    private listAllVehicle(){
        
    }
    private listAllVehicle(Builder builder){
      name = builder.name;
      regNum = builder.regNum;
      colour = builder.colour;
      category = builder.category;
    } 
    public static class Builder{
        private String name;
        private String regNum;
        private String colour;
        private String category;  
        
        public Builder(String name){
            this.name = name;
        }
        public Builder regNum(String value){
            regNum = value;
            return this;
        }
        public Builder colour(String value){
            colour = value;
            return this;
        }
        public Builder category(String value){
            category = value;
            return this;
        }
        public listAllVehicle build(){
            return new listAllVehicle(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getRegNum() {
        return regNum;
    }

    public String getColour() {
        return colour;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
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
        final listAllVehicle other = (listAllVehicle) obj;
        return true;
    }
    
}
