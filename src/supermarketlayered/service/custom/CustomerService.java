/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarketlayered.service.custom;

import supermarketlayered.dto.CustomerDto;
import supermarketlayered.service.SuperService;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public interface CustomerService extends SuperService{
    
    public String saveCustomer(CustomerDto customer);
}
