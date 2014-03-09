/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bulelani.carrentalapp.model.hiredVehicles;
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
public final class hiredVehiclesTest {
    
    public hiredVehiclesTest() {
    }

    @BeforeClass
    public static void setUp() throws Exception {
    }
    @Test
    public void testCreation() throws Exception {
        hiredVehicles h = new hiredVehicles.Builder("Ford").regNum("NCW 14202").category("Comfort").build();
        Assert.assertEquals(h.getName(),"Ford");
        Assert.assertEquals(h.getRegNum(),"NCW 14202");
        Assert.assertEquals(h.getCategory(), "Comfort");
    }
    @Test
    public void testUpdate() throws Exception {
        hiredVehicles h = new hiredVehicles.Builder("Mazda").regNum("NCX 14202").category("Comfort").build();
    }
}
