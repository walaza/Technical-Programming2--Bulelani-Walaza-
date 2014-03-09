/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.model;

import com.bulelani.carrentalapp.model.customer.Builder;
import java.util.Objects;

/**
 *
 * @author bulelani
 */
public final class addVehicle {
    static boolean regNum;
    private String carName;
    private String colour;
    private String regNumber;
    private String category;
    
    public addVehicle(){
        
    }
    private addVehicle(Builder builder){
       carName = builder.carName;
       colour = builder.colour;
       regNumber = builder.regNumber;
       category = builder.category;
       
    }
    public static class Builder{
        private String carName;
        private String colour;
        private String regNumber;
        private String category;
        
       public Builder(String carName){
           this.carName = carName;
       }
        public Builder colour(String value){
            colour = value;
            return this;
        }       
        public Builder regNumber(String value){
            regNumber = value;
            return this;
        }
        public Builder category(String value){
            category = value;
            return this;
        }
        public addVehicle build(){
            return new addVehicle(this);
        }
    }
    public String getCarName() {
        return carName;
    }

    public String getColour() {
        return colour;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.regNumber);
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
        final addVehicle other = (addVehicle) obj;
        return true;
    }
    
}
