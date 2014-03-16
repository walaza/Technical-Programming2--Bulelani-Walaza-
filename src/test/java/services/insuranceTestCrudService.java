/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.bulelani.carrentalapp.model.insurance;
import com.bulelani.carrentalapp.services.crud.insuranceCrudservice;
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
public class insuranceTestCrudService {
    @Mock
    insuranceCrudservice crudService;
    @BeforeMethod
    public void setUpMethod() throws Exception {
    MockitoAnnotations.initMocks(this);
    crudService = Mockito.mock(insuranceCrudservice.class);        
    }
    @Test
     public void testCreate() throws Exception{
     insurance in = new insurance.Builder("CX 12334").carName("Corolla").insureType("basic insurance").build();
      insurance returnInsurance = crudService.persist(in);
      when(crudService.persist(in)).thenReturn(returnInsurance);
      Mockito.verify(crudService).persist(in);
    }  
    @Test
    public void testRead() throws Exception {
         insurance in = new insurance.Builder("CX 12334").carName("Corolla").insureType("basic insurance").build();
         insurance returnInsurance  = crudService.find(in.getInsureType());
         when(crudService.find(in.getInsureType())).thenReturn(returnInsurance);
         Mockito.verify(crudService).find(in.getInsureType());
     } 
    @Test
     public void testUpdate() throws Exception{
    insurance in = new insurance.Builder("CX 12334").carName("Corolla").insureType("basic insurance").build();
     insurance returnInsurance  = crudService.merge(in);
     when(crudService.find(in.getInsureType())).thenReturn(returnInsurance);
     Mockito.verify(crudService).merge(in);  
    }  
    @Test
    public void testDelete() throws Exception{
     insurance in = new insurance.Builder("CX 12334").carName("Corolla").insureType("basic insurance").build();
    insurance returnInsurance  = crudService.remove(in);
     when(crudService.find(in.getInsureType())).thenReturn(returnInsurance);
     Mockito.verify(crudService).remove(in); 
    }     
}
