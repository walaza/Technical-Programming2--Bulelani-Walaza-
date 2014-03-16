package com.bulelani.carRentalApp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bulelani.carrentalapp.model.rentalType;
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
public class rentalTypeTest {
    
    public rentalTypeTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @Test
    public void testCreation() throws Exception{
        rentalType rt = new rentalType.Builder("Mazda").luxury("Porsche").trucks("Man").vans("Mazda BT-50").build();
         Assert.assertEquals(rt.getComfortCars(),"Mazda");
        Assert.assertEquals(rt.getLuxury(),"Porsche");
        Assert.assertEquals(rt.getTrucks(), "Man");
        Assert.assertEquals(rt.getVans(), "Mazda BT-50");
    }
    @Test
    public void testUpdate() throws Exception {
        rentalType rt = new rentalType.Builder("chevrolet").luxury("Jaguar").trucks("Man").vans("Mazda BT-50").build(); 
    }
}
