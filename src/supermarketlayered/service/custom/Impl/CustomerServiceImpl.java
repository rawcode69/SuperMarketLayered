/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.service.custom.Impl;

import supermarketlayered.dao.DaoFactory;
import supermarketlayered.dao.custom.CustomerDao;
import supermarketlayered.dto.CustomerDto;
import supermarketlayered.entity.CustomerEntity;
import supermarketlayered.service.custom.CustomerService;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class CustomerServiceImpl implements CustomerService {
    
    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    @Override
    public String saveCustomer(CustomerDto customer) {
      
    }

    

}
