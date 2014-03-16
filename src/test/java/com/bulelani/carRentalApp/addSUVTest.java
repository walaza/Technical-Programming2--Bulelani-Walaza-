/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carRentalApp;

import com.bulelani.carrentalapp.model.addSUV;
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
public class addSUVTest {
    
    public addSUVTest() {
    }
    @BeforeClass
    public static void setUp() throws Exception {
    }
    @Test
    public void testCreation() throws Exception{
        addSUV a = new addSUV.Builder("JEEP").colour("Blue").model("Compass").numOfAdded(5).build();
        Assert.assertEquals(a.getSuvVendor(), "JEEP");
        Assert.assertEquals(a.getSuvVendor(), "JEEP");
        Assert.assertEquals(a.getColour(), "Blue");
        Assert.assertEquals(a.getModel(), "Compass");
        Assert.assertEquals(5, 5);
    }
    @Test
    public void testUpdate() throws Exception {
      addSUV a = new addSUV.Builder("JEEP").colour("White").model("Cherokee").numOfAdded(5).build();
    }    
}
