/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.bulelani.carrentalapp.model.payment;
import com.bulelani.carrentalapp.services.crud.paymentCrudservice;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
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
public class paymentTestCrudService {
    @Mock
    paymentCrudservice crudService;
    @BeforeMethod
    public void setUpMethod() throws Exception {
    MockitoAnnotations.initMocks(this);
    crudService = Mockito.mock(paymentCrudservice.class);         
    }
    @Test
     public void testCreate() throws Exception{
     payment p = new payment.Builder(2000.00).paymentType("Credit card").build();
      payment returnPayment = crudService.persist(p);
      when(crudService.persist(p)).thenReturn(returnPayment);
      Mockito.verify(crudService).persist(p);
    } 
    @Test
    public void testRead() throws Exception {
     payment p = new payment.Builder(2000.00).paymentType("Credit card").build();
     payment returnPayment  = crudService.find(p.getPaymentType());
     when(crudService.find(p.getPaymentType())).thenReturn(returnPayment);
     Mockito.verify(crudService).find(p.getPaymentType());
   } 
    @Test
     public void testUpdate() throws Exception{
     payment p = new payment.Builder(2000.00).paymentType("Credit card").build();
     payment returnPayment  = crudService.merge(p);
     when(crudService.find(p.getPaymentType())).thenReturn(returnPayment);
     Mockito.verify(crudService).merge(p);  
    } 
    @Test
    public void testDelete() throws Exception{
      payment p = new payment.Builder(2000.00).paymentType("Credit card").build();
     payment returnPayment = crudService.remove(p);
     when(crudService.find(p.getPaymentType())).thenReturn(returnPayment);
     Mockito.verify(crudService).remove(p); 
    }     
}
