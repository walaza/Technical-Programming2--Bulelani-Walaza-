/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.bulelani.carrentalapp.model.availableCars;
import com.bulelani.carrentalapp.services.crud.addVehicleCrudservice;
import com.bulelani.carrentalapp.services.crud.availableCarsCrudservice;
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
public class availableCarsTestCrudService {
    @Mock
    availableCarsCrudservice crudService;
    @BeforeMethod
    public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    crudService = Mockito.mock(availableCarsCrudservice.class);       
    }
    @Test
     public void testCreate() throws Exception{
      availableCars a = new availableCars.Builder("Lexus").regNum("CX 765433").avail(Boolean.TRUE).build();
      availableCars returnAvailableCars = crudService.persist(a);
      when(crudService.persist(a)).thenReturn(returnAvailableCars);
      Mockito.verify(crudService).persist(a);
    }
     @Test
    public void testRead() throws Exception {
         availableCars a = new availableCars.Builder("Lexus").regNum("CX 765433").avail(Boolean.TRUE).build();
         availableCars returnAvailableCars  = crudService.find(a.getRegNum());
         when(crudService.find(a.getRegNum())).thenReturn(returnAvailableCars);
         Mockito.verify(crudService).find(a.getRegNum());
     } 
    @Test
     public void testUpdate() throws Exception{
     availableCars a = new availableCars.Builder("Lexus").regNum("CX 765433").avail(Boolean.TRUE).build();
     availableCars returnAvailableCars = crudService.merge(a);
     when(crudService.find(a.getRegNum())).thenReturn(returnAvailableCars);
     Mockito.verify(crudService).merge(a);  
    }
     @Test
     public void testDelete() throws Exception{
     availableCars a = new availableCars.Builder("Lexus").regNum("CX 765433").avail(Boolean.TRUE).build();
     availableCars returnAvailableCars = crudService.remove(a);
     when(crudService.find(a.getRegNum())).thenReturn(returnAvailableCars);
     Mockito.verify(crudService).remove(a); 
    } 
 
}
