/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bulelani.carrentalapp.model.availableCars;
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
public final class availableCarsTest {
    
    public availableCarsTest() {
    }
    @BeforeClass
    public static void setUp() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void testCreation() throws Exception{
        availableCars av = new availableCars.Builder("Lexus").regNum("CX 765433").avail(Boolean.TRUE).build();
          Assert.assertEquals(av.getName(), "Lexus");
        Assert.assertEquals(av.getRegNum(), "CX 765433");
        Assert.assertTrue(true, "Lexus");
    }
    @Test
     public void testUpdate() throws Exception{
         availableCars av = new availableCars.Builder("Lexus").regNum("CX 765433").avail(Boolean.TRUE).build();
     }
}
