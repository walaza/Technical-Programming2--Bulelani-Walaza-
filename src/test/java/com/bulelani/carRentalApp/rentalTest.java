package com.bulelani.carRentalApp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bulelani.carrentalapp.model.rental;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author bulelani
 */
public class rentalTest {
    
    public rentalTest() {
    }
     @BeforeClass
    public static void setUp() throws Exception {
    }
    @Test
    public void testCreation() throws Exception {
        rental r = new rental.Builder("08-03-14").returnDate("10-03-14").rentalType("Luxury").custId("0555544").build();
        Assert.assertEquals(r.getPickupDate(), "08-03-14");
        Assert.assertEquals(r.getReturnDate(), "10-03-14");
        Assert.assertEquals(r.getRentalType(), "Luxury");
        Assert.assertEquals(r.getCustId(), "0555544");
    }
     @Test
     public void testUpdate() throws Exception {
        rental r = new rental.Builder("08-03-14").returnDate("10-04-14").rentalType("Luxury").custId("0555544").build(); 
     }
}
//Assert.assertEquals(c.getName(), "Bulelani");