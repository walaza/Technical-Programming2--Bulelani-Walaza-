/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bulelani.carrentalapp.model.vehicleCategory;
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
public class categoryTest {
    
    public categoryTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @Test
    public void testCreation() throws Exception{
      vehicleCategory c = new vehicleCategory.Builder("JEEP").sports("Ferari").hatchBack("A3").sedan("Nissan almera").build();
      Assert.assertEquals(c.getSUV(),"JEEP");
        Assert.assertEquals(c.getSports(),"Ferari");
        Assert.assertEquals(c.getHatchBack(), "A3");
        Assert.assertEquals(c.getSedan(), "Nissan almera");
    }
    @Test
    public void testUpdate() throws Exception {
       vehicleCategory c = new vehicleCategory.Builder("Audi Q7").sports("Ferari").hatchBack("Tazz").sedan("Nissan almera").build(); 
    }
}
