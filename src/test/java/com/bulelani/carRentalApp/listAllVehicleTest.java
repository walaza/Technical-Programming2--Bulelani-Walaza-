/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carRentalApp;

import com.bulelani.carrentalapp.model.listAllVehicle;
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
public class listAllVehicleTest {
    
    public listAllVehicleTest() {
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @Test
    public void testCreation() throws Exception{
       listAllVehicle l = new listAllVehicle.Builder("Toyota").category("Comfort").colour("Silver").regNum("NCX 4454").build();
       Assert.assertEquals(l.getName(), "Toyota");
       Assert.assertEquals(l.getCategory(),"Comfort");
       Assert.assertEquals(l.getColour(),"Silver");
       Assert.assertEquals(l.getRegNum(),"NCX 4454");
    }
    @Test
    public void testUpdate() throws Exception {
      listAllVehicle l = new listAllVehicle.Builder("Audi").category("Luxury").colour("Silver").regNum("NCX 4454").build();
    }
}
/*
       Assert.assertEquals(in.getRegNum(), "CX 12334");
        Assert.assertEquals(in.getCarName(),"Corolla");
        Assert.assertEquals(in.getInsureType(), "basic insurance");
*/