/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.model;

import java.util.Locale.Builder;
import java.util.Objects;

/**
 *
 * @author bulelani
 */
public final class customer {
   private String name;
   private String surname;
   private String idNo;
   private String address;
    Object rentalType;
   
   private customer(){
       
   }
   private customer(Builder builder)
   {
       name=builder.name;
       idNo=builder.idNo;
       surname=builder.surname;
       address=builder.address;
   }

public static class Builder{
    private String name;
    private String surname;
    private String idNo;
    private String address;
    
    public Builder(String name){
       this.name =name;
   }
    public Builder surname(String value){
        surname = value;
        return this;
    }
    public Builder idNo(String value){
        idNo = value;
        return this;
    }
    public Builder address(String value){
        address = value;
        return this;
    }
    public customer build(){
        return new customer(this);
    }
}
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIdNo() {
        return idNo;
    }

    public String getAddress() {
        return address;
    }
   @Override
   public int hashCode(){
       return idNo.hashCode();
   }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final customer other = (customer) obj;
        return Objects.equals(this.idNo, other.idNo);
    }

}
