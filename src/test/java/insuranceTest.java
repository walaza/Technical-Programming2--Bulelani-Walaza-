/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bulelani.carrentalapp.model.insurance;
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
public class insuranceTest {
    
    public insuranceTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @Test
    public void testCreation() throws Exception{
        insurance in = new insurance.Builder("CX 12334").carName("Corolla").insureType("basic insurance").build();
         Assert.assertEquals(in.getRegNum(), "CX 12334");
        Assert.assertEquals(in.getCarName(),"Corolla");
        Assert.assertEquals(in.getInsureType(), "basic insurance");
    }
    @Test
    public void testUpdate() throws Exception {
       insurance in = new insurance.Builder("ND 12334").carName("Golf").insureType("basic insurance").build(); 
    }
}
