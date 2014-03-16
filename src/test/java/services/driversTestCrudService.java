/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.bulelani.carrentalapp.model.drivers;
import com.bulelani.carrentalapp.model.drivers;
import com.bulelani.carrentalapp.services.crud.driversCrudservice;
import com.bulelani.carrentalapp.services.crud.driversCrudservice;
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
public class driversTestCrudService {
    @Mock
    driversCrudservice crudService;
    @BeforeMethod
    public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    crudService = Mockito.mock(driversCrudservice.class);         
    }
    @Test
    public void testCreate() throws Exception{
     drivers d = new drivers.Builder("Wanda").idNo("8895564").build();
      drivers returnDrivers = crudService.persist(d);
      when(crudService.persist(d)).thenReturn(returnDrivers);
      Mockito.verify(crudService).persist(d);
    }
   @Test
   public void testRead() throws Exception {
     drivers d = new drivers.Builder("Wanda").idNo("8895564").build();
         drivers returnDrivers  = crudService.find(d.getIdNo());
         when(crudService.find(d.getIdNo())).thenReturn(returnDrivers);
         Mockito.verify(crudService).find(d.getIdNo());
     } 
   @Test
    public void testUpdate() throws Exception{
     drivers d = new drivers.Builder("Wanda").idNo("8895564").build();
     drivers returnDrivers = crudService.merge(d);
     when(crudService.find(d.getIdNo())).thenReturn(returnDrivers);
     Mockito.verify(crudService).merge(d);  
    }
    @Test
    public void testDelete() throws Exception{
      drivers d = new drivers.Builder("Wanda").idNo("8895564").build();
     drivers returnDrivers = crudService.remove(d);
     when(crudService.find(d.getIdNo())).thenReturn(returnDrivers);
     Mockito.verify(crudService).remove(d); 
    } 
}
