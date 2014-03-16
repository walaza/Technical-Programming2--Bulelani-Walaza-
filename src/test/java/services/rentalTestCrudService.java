/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.bulelani.carrentalapp.model.rental;
import com.bulelani.carrentalapp.services.crud.rentalCrudservice;
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
public class rentalTestCrudService {
    @Mock
    rentalCrudservice crudService;
    @BeforeMethod
    public void setUpMethod() throws Exception {
     MockitoAnnotations.initMocks(this);
     crudService = Mockito.mock(rentalCrudservice.class);         
    }
    @Test
      public void testCreate() throws Exception{
     rental r = new rental.Builder("08-03-14").returnDate("10-03-14").rentalType("Luxury").custId("0555544").build();
      rental returnRental = crudService.persist(r);
      when(crudService.persist(r)).thenReturn(returnRental);
      Mockito.verify(crudService).persist(r);
    }
   @Test
     public void testRead() throws Exception {
        rental r = new rental.Builder("08-03-14").returnDate("10-03-14").rentalType("Luxury").custId("0555544").build();
        rental returnRental  = crudService.find(r.getCustId());
         when(crudService.find(r.getCustId())).thenReturn(returnRental);
         Mockito.verify(crudService).find(r.getCustId());
     }  
    @Test
    public void testUpdate() throws Exception{
    rental r = new rental.Builder("08-03-14").returnDate("10-03-14").rentalType("Luxury").custId("0555544").build();
     rental returnRental  = crudService.merge(r);
     when(crudService.find(r.getCustId())).thenReturn(returnRental);
     Mockito.verify(crudService).merge(r);  
    } 
    @Test
     public void testDelete() throws Exception{
     rental r = new rental.Builder("08-03-14").returnDate("10-03-14").rentalType("Luxury").custId("0555544").build();
     rental returnRental  = crudService.remove(r);
     when(crudService.find(r.getCustId())).thenReturn(returnRental);
     Mockito.verify(crudService).remove(r); 
    }   
}
