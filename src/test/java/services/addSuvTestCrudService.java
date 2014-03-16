/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.bulelani.carrentalapp.model.addSUV;
import com.bulelani.carrentalapp.services.crud.Impl.addSuvCrudservice;
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
public class addSuvTestCrudService {
    @Mock
    addSuvCrudservice crudService;
    @BeforeMethod
    public void setUpMethod() throws Exception {
       MockitoAnnotations.initMocks(this);
     crudService = Mockito.mock(addSuvCrudservice.class);    
    }
    @Test
      public void testCreate() throws Exception{
      addSUV a = new addSUV.Builder("JEEP").colour("Blue").model("Compass").numOfAdded(5).build();
      addSUV returnAddSUV = crudService.persist(a);
      when(crudService.persist(a)).thenReturn(returnAddSUV);
      Mockito.verify(crudService).persist(a);
    } 
      @Test
     public void testRead() throws Exception {
      addSUV a = new addSUV.Builder("JEEP").colour("Blue").model("Compass").numOfAdded(5).build();
        addSUV returnAddSUV = crudService.find(a.getSuvVendor());
         when(crudService.find(a.getSuvVendor())).thenReturn(returnAddSUV);
         Mockito.verify(crudService).find(a.getSuvVendor());
     } 
     @Test
    public void testUpdate() throws Exception{
     addSUV a = new addSUV.Builder("JEEP").colour("Blue").model("Compass").numOfAdded(5).build();
     addSUV returnAddSUV   = crudService.merge(a);
     when(crudService.find(a.getSuvVendor())).thenReturn(returnAddSUV);
     Mockito.verify(crudService).merge(a);  
    } 
    @Test
    public void testDelete() throws Exception{
    addSUV a = new addSUV.Builder("JEEP").colour("Blue").model("Compass").numOfAdded(5).build();
     addSUV returnAddSUV  = crudService.remove(a);
     when(crudService.find(a.getSuvVendor())).thenReturn(returnAddSUV);
     Mockito.verify(crudService).remove(a); 
    }  
}
