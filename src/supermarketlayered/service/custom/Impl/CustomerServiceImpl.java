/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.service.custom.Impl;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import supermarketlayered.dao.CrudDao;
import supermarketlayered.dao.CrudUtil;
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
    public String saveCustomer(CustomerDto customer) throws Exception {
        try {
            if (customerDao.add(new CustomerEntity(
                    customer.getCustId(),
                    customer.getCustTitle(),
                    customer.getCustName(),
                    customer.getDob(),
                    customer.getSalary(),
                    customer.getCustAddress(),
                    customer.getCity(),
                    customer.getProvince(),
                    customer.getPostalCode()))) {
                return "Succes";
            } else {
                return "Customer Save Failed";
            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomers() throws Exception {

        ArrayList<CustomerEntity> customerEntitys = customerDao.getAll();

        ArrayList<CustomerDto> customerDtos = new ArrayList<>();

        for (CustomerEntity entity : customerEntitys) {
            CustomerDto customer = new CustomerDto(
                    entity.getCustId(),
                    entity.getCustTitle(),
                    entity.getCustName(),
                    entity.getDob(),
                    entity.getSalary(),
                    entity.getCustAddress(),
                    entity.getCity(),
                    entity.getProvince(),
                    entity.getPostalCode());
            customerDtos.add(customer);
        }
        return customerDtos;
    }

    @Override
    public CustomerDto searchCustomer(String custID) throws Exception {
        CustomerEntity entity = customerDao.get(custID);

        if (entity != null) {
            CustomerDto customer = new CustomerDto(
                    entity.getCustId(),
                    entity.getCustTitle(),
                    entity.getCustName(),
                    entity.getDob(),
                    entity.getSalary(),
                    entity.getCustAddress(),
                    entity.getCity(),
                    entity.getProvince(),
                    entity.getPostalCode());

            return customer;
        } else {
            return null;
        }

    }

    @Override
    public String updateCustomer(CustomerDto customer) throws Exception {
        try {
            if (customerDao.update(new CustomerEntity(
                    customer.getCustId(),
                    customer.getCustTitle(),
                    customer.getCustName(),
                    customer.getDob(),
                    customer.getSalary(),
                    customer.getCustAddress(),
                    customer.getCity(),
                    customer.getProvince(),
                    customer.getPostalCode()))) {
                return "Succes";
            } else {
                return "Customer Update Failed";
            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String deleteCustomer(String custId) throws Exception {
        if(customerDao.delete(custId)){
            return "Succes";
        }else{
            return "Customer Delete Failed";
        }
    }

}
