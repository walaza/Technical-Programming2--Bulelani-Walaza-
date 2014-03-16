/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.bulelani.carrentalapp.model.listAllVehicle;
import com.bulelani.carrentalapp.services.crud.listAllVehicleCrudservice;
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
public class listAllVehicleTestCrudService {
    @Mock
    listAllVehicleCrudservice crudService;
    @BeforeMethod
    public void setUpMethod() throws Exception {
     MockitoAnnotations.initMocks(this);
     crudService = Mockito.mock(listAllVehicleCrudservice.class);         
    }
    @Test
     public void testCreate() throws Exception{
      listAllVehicle l = new listAllVehicle.Builder("Toyota").category("Comfort").colour("Silver").regNum("NCX 4454").build();
      listAllVehicle returnAllVehicle = crudService.persist(l);
      when(crudService.persist(l)).thenReturn(returnAllVehicle);
      Mockito.verify(crudService).persist(l);
    }  
    @Test
     public void testRead() throws Exception {
      listAllVehicle l = new listAllVehicle.Builder("Toyota").category("Comfort").colour("Silver").regNum("NCX 4454").build();
        listAllVehicle returnAllVehicle  = crudService.find(l.getName());
         when(crudService.find(l.getName())).thenReturn(returnAllVehicle);
         Mockito.verify(crudService).find(l.getName());
     }
    @Test
    public void testUpdate() throws Exception{
     listAllVehicle l = new listAllVehicle.Builder("Toyota").category("Comfort").colour("Silver").regNum("NCX 4454").build();
     listAllVehicle returnAllVehicle   = crudService.merge(l);
     when(crudService.find(l.getName())).thenReturn(returnAllVehicle);
     Mockito.verify(crudService).merge(l);  
    }
    @Test
    public void testDelete() throws Exception{
     listAllVehicle l = new listAllVehicle.Builder("Toyota").category("Comfort").colour("Silver").regNum("NCX 4454").build();
     listAllVehicle returnAllVehicle  = crudService.remove(l);
     when(crudService.find(l.getName())).thenReturn(returnAllVehicle);
     Mockito.verify(crudService).remove(l); 
    }  
}
