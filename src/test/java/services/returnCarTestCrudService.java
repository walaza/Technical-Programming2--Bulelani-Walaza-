/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.bulelani.carrentalapp.model.returnCar;
import com.bulelani.carrentalapp.services.crud.returnCarCrudservice;
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
public class returnCarTestCrudService {
    @Mock
    returnCarCrudservice crudService;
    @BeforeMethod
    public void setUpMethod() throws Exception {
     MockitoAnnotations.initMocks(this);
     crudService = Mockito.mock(returnCarCrudservice.class);  
    }
    @Test
    public void testCreate() throws Exception{
      returnCar r = new returnCar.Builder("05/04/14").custName("Bule").build();
      returnCar returnReturnCar = crudService.persist(r);
      when(crudService.persist(r)).thenReturn(returnReturnCar);
      Mockito.verify(crudService).persist(r);
    }
    @Test
      public void testRead() throws Exception {
        returnCar r = new returnCar.Builder("05/04/14").custName("Bule").build();
        returnCar returnReturnCar  = crudService.find(r.getReturndate());
         when(crudService.find(r.getReturndate())).thenReturn(returnReturnCar);
         Mockito.verify(crudService).find(r.getReturndate());
     } 
    @Test
    public void testUpdate() throws Exception{
     returnCar r = new returnCar.Builder("05/04/14").custName("Bule").build();
     returnCar returnReturnCar  = crudService.merge(r);
     when(crudService.find(r.getReturndate())).thenReturn(returnReturnCar);
     Mockito.verify(crudService).merge(r);  
    } 
    @Test
    public void testDelete() throws Exception{
     returnCar r = new returnCar.Builder("05/04/14").custName("Bule").build();
    returnCar returnReturnCar  = crudService.remove(r);
     when(crudService.find(r.getReturndate())).thenReturn(returnReturnCar);
     Mockito.verify(crudService).remove(r); 
    }  
}
