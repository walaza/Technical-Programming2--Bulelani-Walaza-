/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.model;

/**
 *
 * @author bulelani
 */
public final class payment {
    private double amountPaid;
    private String paymentType;
    
    private payment(){
        
    }
    private payment(Builder builder){
       amountPaid = builder.amountPaid;
       paymentType = builder.paymentType;
    }
    public static class Builder{
        private double amountPaid;
        private String paymentType;
       
        public Builder(double amountPaid){
            this.amountPaid = amountPaid;
        }
        public Builder paymentType(String value){
            paymentType = value;
            return this;
        }
        public payment build(){
            return new payment(this);  
        }
    }
    public double getAmountPaid() {
        return amountPaid;
    }

    public String getPaymentType() {
        return paymentType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.amountPaid) ^ (Double.doubleToLongBits(this.amountPaid) >>> 32));
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
        final payment other = (payment) obj;
        return true;
    }
    
}
