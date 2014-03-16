package com.bulelani.carRentalApp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bulelani.carrentalapp.model.bookings;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author bulelani
 */
public class bookingsTest {
    
    public bookingsTest() {
    }

   @Test
    public static void setUp() throws Exception {
    }
    public void testCreation() throws Exception{
        bookings b = new bookings.Builder(10).custName("Anda").regNum("CY 133456").booking("CY 133456").build();
         Assert.assertEquals(b.getHrsBooked(), 10);
        Assert.assertEquals(b.getCustName(), "Anda");
        Assert.assertEquals(b.getRegNum(), "CY 13456");
        Assert.assertEquals(b.getBooking(), "CY 133456");
    }
    @Test
    public void testUpdate() throws Exception {
      bookings b = new bookings.Builder(5).custName("Buja").regNum("CY 1456").booking("CY 1456").build();  
    }
}
