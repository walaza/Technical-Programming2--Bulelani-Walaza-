/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.bulelani.carrentalapp.model.addVehicle;
import com.bulelani.carrentalapp.services.crud.addVehicleCrudservice;
import com.bulelani.carrentalapp.services.crud.customerCrudservice;
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
public class addVehicleTestCrudService {
    @Mock
    addVehicleCrudservice crudService;
    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(addVehicleCrudservice.class);
    }
    @Test
    public void testCreate() throws Exception{
         addVehicle av = new addVehicle.Builder("BMW").colour("Black").regNumber("CA 589 763 423").category("Luxury").build();
         addVehicle returnCustomer = crudService.persist(av);
        when(crudService.persist(av)).thenReturn(returnCustomer);
        Mockito.verify(crudService).persist(av);
    }
    @Test
     public void testRead() throws Exception {
         addVehicle av = new addVehicle.Builder("BMW").colour("Black").regNumber("CA 589 763 423").category("Luxury").build();
         addVehicle returnAddVehicle = crudService.find(av.getRegNumber());
         when(crudService.find(av.getRegNumber())).thenReturn(returnAddVehicle);
         Mockito.verify(crudService).find(av.getRegNumber());
     }
     @Test
       public void testUpdate() throws Exception{
         addVehicle av = new addVehicle.Builder("BMW").colour("Black").regNumber("CA 589 763 423").category("Luxury").build();
         addVehicle returnAddVehicle = crudService.merge(av);
         when(crudService.find(av.getRegNumber())).thenReturn(returnAddVehicle);
         Mockito.verify(crudService).merge(av);  
       }
      @Test
      public void testDelete() throws Exception{
         addVehicle av = new addVehicle.Builder("BMW").colour("Black").regNumber("CA 589 763 423").category("Luxury").build();
         addVehicle returnAddVehicle = crudService.remove(av);
         when(crudService.find(av.getRegNumber())).thenReturn(returnAddVehicle);
         Mockito.verify(crudService).remove(av); 
      }
}
