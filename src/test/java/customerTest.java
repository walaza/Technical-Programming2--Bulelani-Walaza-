/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bulelani.carrentalapp.model.customer;
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
public class customerTest {
    
    public customerTest() {
    }

    @BeforeClass
    public static void setUp() throws Exception {
    }

    @Test
    public void testCreation() throws Exception {
        customer c = new customer.Builder("Bulelani").surname("Walaza").idNo("90122958").address("40417 khayelitsha").build();
        Assert.assertEquals(c.getName(), "Bulelani");
        Assert.assertEquals(c.getSurname(),"Walaza");
        Assert.assertEquals(c.getIdNo(), "90122958");
        Assert.assertEquals(c.getAddress(), "40417 khayelitsha");
    }
    @Test
      public void testUpdate() throws Exception {
         customer c = new customer.Builder("Siyanda").surname("Dlepu").idNo("90122958").address("40417 khayelitsha").build(); 
      }
}
