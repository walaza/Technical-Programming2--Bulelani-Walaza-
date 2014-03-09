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
public final class returnCar {
    private String returndate;
    private String custName;

    private returnCar(){
        
    }
    private returnCar(Builder builder){
     returndate = builder.returndate;
     custName = builder.custName;
    }
    public static class Builder{
        private String custName;
        private String returndate;
        
        public Builder(String returndate){
            this.returndate = returndate;
        }
        public Builder custName(String value){
            custName = value;
            return this;
        }
        public returnCar build(){
            return new returnCar(this);
        }
    }
    public String getReturndate() {
        return returndate;
    }

    public String getCustName() {
        return custName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.returndate);
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
        final returnCar other = (returnCar) obj;
        return true;
    }
    
}
