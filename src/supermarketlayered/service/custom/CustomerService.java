/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarketlayered.service.custom;

import java.util.ArrayList;
import supermarketlayered.dto.CustomerDto;
import supermarketlayered.service.SuperService;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public interface CustomerService extends SuperService{
    
    public String saveCustomer(CustomerDto customer) throws Exception;

    public ArrayList<CustomerDto> getAllCustomers() throws Exception;

    public CustomerDto searchCustomer(String custID)throws Exception;

    public String updateCustomer(CustomerDto customer) throws Exception;

    public String deleteCustomer(String custId) throws Exception;
}
