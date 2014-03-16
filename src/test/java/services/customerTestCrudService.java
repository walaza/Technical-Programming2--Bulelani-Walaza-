/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.bulelani.carrentalapp.model.customer;
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
public class customerTestCrudService {
    @Mock
    customerCrudservice crudService;
    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(customerCrudservice.class);
    }
    @Test
    public void testCreate() throws Exception{
        customer cu = new customer.Builder("Bulelani").surname("Walaza").idNo("901229").address("40417 khayelitsha").build();
        customer returnCustomer = crudService.persist(cu);
        when(crudService.persist(cu)).thenReturn(returnCustomer);
        Mockito.verify(crudService).persist(cu);
    }
    @Test
    public void testRead() throws Exception {
        customer cu = new customer.Builder("Bulelani").surname("Walaza").idNo("901229").address("40417 khayelitsha").build();
        customer returnCustomer = crudService.find(cu.getIdNo());
        when(crudService.find(cu.getIdNo())).thenReturn(returnCustomer);
        Mockito.verify(crudService).find(cu.getIdNo());
    }
    @Test
    public void testUpdate() throws Exception{
       customer cu = new customer.Builder("Bulelani").surname("Walaza").idNo("901229").address("40417 khayelitsha").build();
        customer returnCustomer = crudService.merge(cu);
        when(crudService.merge(cu)).thenReturn(returnCustomer);
        Mockito.verify(crudService).merge(cu); 
    }
    @Test
    public void testDelete() throws Exception {
        customer cu = new customer.Builder("Bulelani").surname("Walaza").idNo("901229").address("40417 khayelitsha").build();
        customer returnCustomer = crudService.remove(cu);
        when(crudService.merge(cu)).thenReturn(returnCustomer);
        Mockito.verify(crudService).remove(cu); 
    }
}
