package com.bulelani.carRentalApp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bulelani.carrentalapp.model.drivers;
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
public class driversTest {
    
    public driversTest() {
    }
    @BeforeClass
    public static void setUp() throws Exception {
    }

    @Test
   public void testCreation() throws Exception{
     drivers d = new drivers.Builder("Wanda").idNo("8895564").build();
         Assert.assertEquals(d.getName(), "Wanda");
        Assert.assertEquals(d.getIdNo(), "8895564");
   }
  @Test
  public void testUpdate() throws Exception{
     drivers d = new drivers.Builder("Thando").idNo("9005564").build(); 
  }
}
