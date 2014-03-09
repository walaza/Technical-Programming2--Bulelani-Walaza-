/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.model;

import com.bulelani.carrentalapp.model.addVehicle.Builder;

/**
 *
 * @author bulelani
 */
public final class bookings {
    private addVehicle vehicle;
  private int hrsBooked;
  private String custName;
  private String regNum;
  private String booking;
    public int getHrsBooked() {
        return hrsBooked;
    }
    private bookings(Builder builder){
        hrsBooked = builder.hrsBooked;
        custName = builder.custName;
        regNum = builder.regNum;
        booking = builder.booking;
    }
    public static class Builder{
        private int hrsBooked;
        private String custName;
        private String regNum;
        private String booking;
        
        public Builder(int hrsBooked){
            this.hrsBooked = hrsBooked;
        }
        public Builder custName(String value){
            custName = value;
            return this;
        }
        public Builder regNum(String value){
            regNum = value;
            return this;
        }
        public Builder booking(String value){
            booking = value;
            return this;
        }
        public bookings build(){
            return new bookings(this);
        }
    }
    public String getCustName() {
        return custName;
    }

    public String getRegNum() {
        return regNum;
    }

    public String getBooking() {
       if(regNum.equals(vehicle.getRegNumber()))
        {
            System.out.println("The car has been booked");
        }
       else
           System.out.println("Car doesnt exist");
       
        return booking;
    }
    
    
}
