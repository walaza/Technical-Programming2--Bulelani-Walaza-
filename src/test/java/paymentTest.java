/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bulelani.carrentalapp.model.payment;
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
public class paymentTest {
    
    public paymentTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @Test
    public void testCreation() throws Exception{
        payment p = new payment.Builder(2000.00).paymentType("Credit card").build();
        Assert.assertEquals(2000.00, 2000.00, 2000.00);
        Assert.assertEquals(p.getPaymentType(), "Credit card");
    }
    @Test
    public void testUpdate() throws Exception {
      payment p = new payment.Builder(4000.00).paymentType("Credit card").build();  
    }
}
