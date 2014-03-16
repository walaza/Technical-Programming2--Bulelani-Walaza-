/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalapp.app;

import com.bulelani.carrentalapp.services.crud.Impl.addVehicleCrudServiceImpl;
import com.bulelani.carrentalapp.services.crud.Impl.availableCarsCrudServiceImpl;
import com.bulelani.carrentalapp.services.crud.Impl.bookingsCrudServiceImpl;
import com.bulelani.carrentalapp.services.crud.Impl.customerCrudServiceImpl;
import com.bulelani.carrentalapp.services.crud.Impl.driversCrudServiceImpl;
import com.bulelani.carrentalapp.services.crud.Impl.hiredVehiclesCrudServiceImpl;
import com.bulelani.carrentalapp.services.crud.Impl.insuranceCrudServiceImpl;
import com.bulelani.carrentalapp.services.crud.Impl.listAllVehicleCrudServiceImpl;
import com.bulelani.carrentalapp.services.crud.Impl.paymentCrudServiceImpl;
import com.bulelani.carrentalapp.services.crud.Impl.pickupACarCrudServiceImpl;
import com.bulelani.carrentalapp.services.crud.Impl.rentalCrudServiceImpl;
import com.bulelani.carrentalapp.services.crud.Impl.rentalTypeCrudServiceImpl;
import com.bulelani.carrentalapp.services.crud.Impl.returnCarCrudServiceImpl;
import com.bulelani.carrentalapp.services.crud.Impl.vehicleCategoryCrudServiceImpl;
import com.bulelani.carrentalapp.services.crud.addVehicleCrudservice;
import com.bulelani.carrentalapp.services.crud.availableCarsCrudservice;
import com.bulelani.carrentalapp.services.crud.bookingsCrudservice;
import com.bulelani.carrentalapp.services.crud.customerCrudservice;
import com.bulelani.carrentalapp.services.crud.driversCrudservice;
import com.bulelani.carrentalapp.services.crud.hiredVehiclesCrudservice;
import com.bulelani.carrentalapp.services.crud.insuranceCrudservice;
import com.bulelani.carrentalapp.services.crud.listAllVehicleCrudservice;
import com.bulelani.carrentalapp.services.crud.paymentCrudservice;
import com.bulelani.carrentalapp.services.crud.pickupACarCrudservice;
import com.bulelani.carrentalapp.services.crud.rentalCrudservice;
import com.bulelani.carrentalapp.services.crud.rentalTypeCrudservice;
import com.bulelani.carrentalapp.services.crud.returnCarCrudservice;
import com.bulelani.carrentalapp.services.crud.vehicleCategoryCrudservice;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author bulelani
 */
public class AppConfig {
     @Bean(name = "customerCrudService")
     public customerCrudservice getcustomerCrudService(){
         return new customerCrudServiceImpl();
     }
     @Bean(name = "addVehicleCrudService")
     public addVehicleCrudservice getaddVehicleCrudService(){
         return new addVehicleCrudServiceImpl();
     }
     @Bean(name = "availableCarsCrudService")
     public availableCarsCrudservice getavailableCarsCrudService(){
         return new availableCarsCrudServiceImpl();
     }
     @Bean(name = "bookingsCrudService")
     public bookingsCrudservice getbookingsCrudService(){
         return new bookingsCrudServiceImpl();
     }
     @Bean(name = "driversCrudService")
       public driversCrudservice getdriversCrudService(){
         return new driversCrudServiceImpl();
     }
     @Bean(name = "hiredVehiclesCrudService")
       public hiredVehiclesCrudservice gethiredVehiclesCrudService(){
         return new hiredVehiclesCrudServiceImpl();
     }
     @Bean(name = "insuranceCrudService")
     public insuranceCrudservice getinsuranceCrudService(){
         return new insuranceCrudServiceImpl();
     }
     @Bean(name = "listCrudService")
     public listAllVehicleCrudservice getlistAllVehicleCrudService(){
         return new listAllVehicleCrudServiceImpl();
     }
     @Bean(name = "paymentCrudService")
     public paymentCrudservice getpaymentCrudService(){
         return new paymentCrudServiceImpl();
     }  
     @Bean(name = "pickupACarCrudService")
     public pickupACarCrudservice getpickupACarCrudService(){
         return new pickupACarCrudServiceImpl();
     } 
     @Bean(name = "rentalCrudService")
     public rentalCrudservice getrentalCrudService(){
         return new rentalCrudServiceImpl();
     }   
     @Bean(name = "rentalTypeCrudService")
     public rentalTypeCrudservice getrentalTypeCrudService(){
         return new rentalTypeCrudServiceImpl();
     } 
     @Bean(name = "returnCarCrudService")
     public returnCarCrudservice getreturnCarCrudService(){
         return new returnCarCrudServiceImpl();
     } 
     @Bean(name = "vehicleCategoryCarCrudService")
     public vehicleCategoryCrudservice getvehicleCategoryCrudService(){
         return new vehicleCategoryCrudServiceImpl();
     }  
}
