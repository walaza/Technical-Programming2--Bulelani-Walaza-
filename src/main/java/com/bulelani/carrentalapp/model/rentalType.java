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
public final class rentalType {
   private String comfortCars;
   private String luxury;
   private String trucks;
   private String vans;

   private rentalType(){
       
   }
   private rentalType(Builder builder){
      comfortCars = builder.comfortCars;
      luxury = builder.luxury;
      trucks = builder.trucks;
      vans = builder.vans;
      
   }
   public static class Builder{
        private String comfortCars;
        private String luxury;
        private String trucks;
        private String vans;
       
        public Builder(String comfortCars){
            this.comfortCars = comfortCars;
        }
        public Builder luxury(String value){
            luxury = value;
            return this;
        }
        public Builder trucks(String value){
            trucks = value;
            return this;
        }
        public Builder vans(String value){
            vans = value;
            return this;
        }
        public rentalType build(){
            return new rentalType(this);
        }
   }
    public String getComfortCars() {
        return comfortCars;
    }

    public String getLuxury() {
        return luxury;
    }

    public String getTrucks() {
        return trucks;
    }

    public String getVans() {
        return vans;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.comfortCars);
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
        final rentalType other = (rentalType) obj;
        return true;
    }
    
}
