/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.bulelani.carrentalapp.model.rentalType;
import com.bulelani.carrentalapp.services.crud.rentalTypeCrudservice;
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
public class rentalTypeTestCrudService {
    @Mock
    rentalTypeCrudservice crudService;
    @BeforeMethod
    public void setUpMethod() throws Exception {
       MockitoAnnotations.initMocks(this);
     crudService = Mockito.mock(rentalTypeCrudservice.class);        
    }
    @Test
    public void testCreate() throws Exception{
      rentalType rt = new rentalType.Builder("Mazda").luxury("Porsche").trucks("Man").vans("Mazda BT-50").build();
      rentalType returnRentalType = crudService.persist(rt);
      when(crudService.persist(rt)).thenReturn(returnRentalType);
      Mockito.verify(crudService).persist(rt);
    }
    @Test
    public void testRead() throws Exception {
      rentalType rt = new rentalType.Builder("Mazda").luxury("Porsche").trucks("Man").vans("Mazda BT-50").build();
      rentalType returnRentalType   = crudService.find(rt.getLuxury());
      when(crudService.find(rt.getLuxury())).thenReturn(returnRentalType);
      Mockito.verify(crudService).find(rt.getLuxury());
     } 
    @Test
     public void testUpdate() throws Exception{
     rentalType rt = new rentalType.Builder("Mazda").luxury("Porsche").trucks("Man").vans("Mazda BT-50").build();
     rentalType returnRentalType  = crudService.merge(rt);
     when(crudService.find(rt.getLuxury())).thenReturn(returnRentalType);
     Mockito.verify(crudService).merge(rt);  
    }  
    @Test
     public void testDelete() throws Exception{
     rentalType rt = new rentalType.Builder("Mazda").luxury("Porsche").trucks("Man").vans("Mazda BT-50").build();
     rentalType returnRentalType  = crudService.remove(rt);
     when(crudService.find(rt.getLuxury())).thenReturn(returnRentalType);
     Mockito.verify(crudService).remove(rt); 
    }  
}
