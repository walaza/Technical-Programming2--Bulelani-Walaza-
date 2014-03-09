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
public final class rental {
    private String pickupDate;
    private String returnDate;
    private String rentalType;
   private String custId;
    private rental()
    {
        
    }
   private rental(Builder builder){
        pickupDate=builder.pickupDate;
        returnDate=builder.returnDate;
        rentalType=builder.rentalType;
        custId=builder.custId;
    }
    public static class Builder{
        private String pickupDate;
        private String returnDate;
        private String rentalType;
        private String  custId;
       
        public Builder(String pickupDate){
            this.pickupDate = pickupDate;
        }
        public Builder returnDate(String value){
            returnDate=value;
            return this;
        }
        public Builder rentalType(String value){
            rentalType = value;
            return this;
        }
        public Builder custId(String value){
            custId = value;
            return this;
        }
        public rental build(){
           return new rental(this);     
    }
    }
    public String getPickupDate() {
        return pickupDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public String getRentalType() {
        return rentalType;
    }
    public String getCustId() {
            return custId;
      }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.rentalType);
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
        final rental other = (rental) obj;
        if (!Objects.equals(this.rentalType, other.rentalType)) {
            return false;
        }
        return true;
    }
}
