/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bulelani.carrentalapp.model.returnCar;
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
public class returnCarTest {
    
    public returnCarTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @Test
    public void testCreation() throws Exception{
        returnCar r = new returnCar.Builder("05/04/14").custName("Bule").build();
        Assert.assertEquals(r.getReturndate(),"05/04/14");
        Assert.assertEquals(r.getCustName(),"Bule");
    }
    @Test
    public void testUpdate() throws Exception {
          returnCar r = new returnCar.Builder("05/05/14").custName("Bule").build();
    }
}
