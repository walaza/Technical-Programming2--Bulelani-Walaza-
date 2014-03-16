/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.bulelani.carrentalapp.model.hiredVehicles;
import com.bulelani.carrentalapp.services.crud.driversCrudservice;
import com.bulelani.carrentalapp.services.crud.hiredVehiclesCrudservice;
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
public class hiredVehicleTestCrudService {
    @Mock
    hiredVehiclesCrudservice crudService;
    @BeforeMethod
    public void setUpMethod() throws Exception {
    MockitoAnnotations.initMocks(this);
    crudService = Mockito.mock(hiredVehiclesCrudservice.class);
    }
    @Test
     public void testCreate() throws Exception{
     hiredVehicles h = new hiredVehicles.Builder("Ford").regNum("NCW 14202").category("Comfort").build();
      hiredVehicles returnHiredVehicles = crudService.persist(h);
      when(crudService.persist(h)).thenReturn(returnHiredVehicles);
      Mockito.verify(crudService).persist(h);
    }  
     @Test
     public void testRead() throws Exception {
    hiredVehicles h = new hiredVehicles.Builder("Ford").regNum("NCW 14202").category("Comfort").build();
         hiredVehicles returnHiredVehicles  = crudService.find(h.getRegNum());
         when(crudService.find(h.getRegNum())).thenReturn(returnHiredVehicles);
         Mockito.verify(crudService).find(h.getRegNum());
     }    
    @Test
     public void testUpdate() throws Exception{
    hiredVehicles h = new hiredVehicles.Builder("Ford").regNum("NCW 14202").category("Comfort").build();
     hiredVehicles returnHiredVehicles = crudService.merge(h);
     when(crudService.find(h.getRegNum())).thenReturn(returnHiredVehicles);
     Mockito.verify(crudService).merge(h);  
    }   
     @Test
     public void testDelete() throws Exception{
     hiredVehicles h = new hiredVehicles.Builder("Ford").regNum("NCW 14202").category("Comfort").build();
     hiredVehicles returnHiredVehicles = crudService.remove(h);
     when(crudService.find(h.getRegNum())).thenReturn(returnHiredVehicles);
     Mockito.verify(crudService).remove(h); 
    }     
}
