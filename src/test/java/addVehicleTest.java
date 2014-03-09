/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bulelani.carrentalapp.model.addVehicle;
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
public class addVehicleTest {
    
    public addVehicleTest() {
    }
    @BeforeClass
    public static void setUp() throws Exception {
    }
    @Test
     public void testCreation() throws Exception {
         addVehicle v = new addVehicle.Builder("BMW").colour("Black").regNumber("CA 589 763 423").category("Luxury").build();
         Assert.assertEquals(v.getCarName(), "BMW");
        Assert.assertEquals(v.getColour(), "Black");
        Assert.assertEquals(v.getRegNumber(), "CA 589 763 423");
        Assert.assertEquals(v.getCategory(), "Luxury");
     }
     @Test
     public void testUpdate() throws Exception {
       addVehicle v = new addVehicle.Builder("Audi").colour("Blue").regNumber("CA 556 764 424").category("Luxury").build();   
     }
}
