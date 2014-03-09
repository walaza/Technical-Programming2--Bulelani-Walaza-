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
public final class pickupACar {
   private String custName;
   private String date;
   private String place;

   private pickupACar(){
       
   }
   private pickupACar(Builder builder){
      custName = builder.custName;
      date = builder.date;
      place = builder.place;
   }
   public static class Builder{
        private String custName;
        private String date;
        private String place;
       
        public Builder(String custName){
            this.custName = custName;
        }
        public Builder date(String value){
            date = value;
            return this;
        }
        public Builder place(String value){
            place = value;
            return this;
        }
        public pickupACar build(){
            return new pickupACar(this);
        }
   }
    public String getCustName() {
        return custName;
    }

    public String getDate() {
        return date;
    }

    public String getPlace() {
        return place;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.place);
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
        final pickupACar other = (pickupACar) obj;
        return true;
    }
    
}
