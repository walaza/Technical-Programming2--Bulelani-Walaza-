/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.bulelani.carrentalapp.model.bookings;
import com.bulelani.carrentalapp.model.bookings;
import com.bulelani.carrentalapp.services.crud.bookingsCrudservice;
import com.bulelani.carrentalapp.services.crud.bookingsCrudservice;
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
public class bookingsTestCrudService {
    @Mock
    bookingsCrudservice crudService;
    @BeforeMethod
    public void setUpMethod() throws Exception {
    MockitoAnnotations.initMocks(this);
    crudService = Mockito.mock(bookingsCrudservice.class);          
    }
     @Test
     public void testCreate() throws Exception{
      bookings b = new bookings.Builder(10).custName("Anda").regNum("CY 133456").booking("CY 133456").build();
      bookings returnBookings = crudService.persist(b);
      when(crudService.persist(b)).thenReturn(returnBookings);
      Mockito.verify(crudService).persist(b);
    }  
    @Test
     public void testRead() throws Exception {
          bookings b = new bookings.Builder(10).custName("Anda").regNum("CY 133456").booking("CY 133456").build();
         bookings returnBookings  = crudService.find(b.getRegNum());
         when(crudService.find(b.getRegNum())).thenReturn(returnBookings);
         Mockito.verify(crudService).find(b.getRegNum());
     } 
     @Test
     public void testUpdate() throws Exception{
     bookings b = new bookings.Builder(10).custName("Anda").regNum("CY 133456").booking("CY 133456").build();
     bookings returnBookings = crudService.merge(b);
     when(crudService.find(b.getRegNum())).thenReturn(returnBookings);
     Mockito.verify(crudService).merge(b);  
    }
     @Test
     public void testDelete() throws Exception{
     bookings b = new bookings.Builder(10).custName("Anda").regNum("CY 133456").booking("CY 133456").build();
     bookings returnBookings = crudService.remove(b);
     when(crudService.find(b.getRegNum())).thenReturn(returnBookings);
     Mockito.verify(crudService).remove(b); 
    } 
}
