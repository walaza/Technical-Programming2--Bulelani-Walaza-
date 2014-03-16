/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.bulelani.carrentalapp.model.pickupACar;
import com.bulelani.carrentalapp.services.crud.pickupACarCrudservice;
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
public class pickCarTestCrudService {
    @Mock
    pickupACarCrudservice crudService;
    @BeforeMethod
    public void setUpMethod() throws Exception {
      MockitoAnnotations.initMocks(this);
     crudService = Mockito.mock(pickupACarCrudservice.class); 
    }
    @Test
     public void testCreate() throws Exception{
     pickupACar p= new pickupACar.Builder("Xolani").date("10/03/14").place("Grand Parade").build();
      pickupACar returnPickupACar = crudService.persist(p);
      when(crudService.persist(p)).thenReturn(returnPickupACar);
      Mockito.verify(crudService).persist(p);
    } 
    @Test
      public void testRead() throws Exception {
       pickupACar p= new pickupACar.Builder("Xolani").date("10/03/14").place("Grand Parade").build();
       pickupACar returnPickupACar  = crudService.find(p.getCustName());
       when(crudService.find(p.getCustName())).thenReturn(returnPickupACar);
       Mockito.verify(crudService).find(p.getCustName());
     }
    @Test
      public void testUpdate() throws Exception{
     pickupACar p= new pickupACar.Builder("Xolani").date("10/03/14").place("Grand Parade").build();
     pickupACar returnPickupACar  = crudService.merge(p);
     when(crudService.find(p.getCustName())).thenReturn(returnPickupACar);
     Mockito.verify(crudService).merge(p);  
    } 
    @Test
    public void testDelete() throws Exception{
      pickupACar p= new pickupACar.Builder("Xolani").date("10/03/14").place("Grand Parade").build();
     pickupACar returnPickupACar  = crudService.remove(p);
     when(crudService.find(p.getCustName())).thenReturn(returnPickupACar);
     Mockito.verify(crudService).remove(p); 
    }        
}
