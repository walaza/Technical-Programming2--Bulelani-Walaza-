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
public final class vehicleCategory {
    private String SUV;
    private String sports;
    private String sedan;
    private String hatchBack;

    private vehicleCategory(){
        
    }
    private vehicleCategory(Builder builder){
        SUV = builder.SUV;
        sports = builder.sports;
        sedan = builder.sedan;
        hatchBack = builder.hatchBack;
    }
    public static class Builder{
        private String hatchBack;
        private String sedan;
        private String sports;
        private String SUV;
       
        public Builder(String SUV){
            this.SUV = SUV;
        }
        public Builder sports(String value){
            sports = value;
            return this;
        }
        public Builder sedan(String value){
            sedan = value;
            return this;
        }
        public Builder hatchBack(String value){
            hatchBack = value;
            return this;
        }
        public vehicleCategory build(){
            return new vehicleCategory(this);
        }
    }
    public String getSUV() {
        return SUV;
    }

    public String getSports() {
        return sports;
    }

    public String getSedan() {
        return sedan;
    }

    public String getHatchBack() {
        return hatchBack;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.SUV);
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
        final vehicleCategory other = (vehicleCategory) obj;
        return true;
    }
    
}
