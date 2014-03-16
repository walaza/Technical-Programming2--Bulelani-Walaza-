package com.bulelani.carRentalApp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bulelani.carrentalapp.model.pickupACar;
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
public class pickCarTest {
    private pickupACar pickupACar;
    
    public pickCarTest() {
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @Test
    public void testCreation() throws Exception{
       pickupACar p= new pickupACar.Builder("Xolani").date("10/03/14").place("Grand Parade").build();
       Assert.assertEquals(p.getCustName(),"Xolani");
        Assert.assertEquals(p.getDate(),"10/03/14");
        Assert.assertEquals(p.getPlace(), "Grand Parade");
    }
    @Test
    public void testUpdate() throws Exception {
        pickupACar p= new pickupACar.Builder("Thera").date("11/03/14").place("Parade").build();
    }
}
