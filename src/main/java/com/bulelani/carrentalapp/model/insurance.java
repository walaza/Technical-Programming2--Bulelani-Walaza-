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
public final class insurance {
   private String regNum;
   private String carName;
   private String insureType;
   
   private insurance(){
       
   }
   private insurance(Builder builder){
      regNum = builder.regNum; 
      carName = builder.carName;
      insureType = builder.insureType;
   }
   public static class Builder{
        private String regNum;
        private String carName;
        private String insureType;
       
        public Builder(String regNum){
            this.regNum = regNum;
        }
        public Builder carName(String value){
            carName = value;
            return this;
        }
        public Builder insureType(String value){
            insureType = value;
            return this;
        }
        public insurance build(){
            return new insurance(this);
        }
   }
    public String getRegNum() {
        return regNum;
    }

    public String getCarName() {
        return carName;
    }

    public String getInsureType() {
        return insureType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.insureType);
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
        final insurance other = (insurance) obj;
        return true;
    }
    
}
