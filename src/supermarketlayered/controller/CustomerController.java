/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.controller;

import java.util.ArrayList;
import supermarketlayered.dto.CustomerDto;
import supermarketlayered.service.custom.CustomerService;
import supermarketlayered.service.ServiceFactory;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class CustomerController {

    CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String saveCustomer(CustomerDto customer) throws Exception {
        return customerService.saveCustomer(customer);
    }

    public ArrayList<CustomerDto> getAllCustomer() throws Exception{
        return customerService.getAllCustomers();
    }

}
