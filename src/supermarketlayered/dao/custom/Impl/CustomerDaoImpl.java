/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.dao.custom.Impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import supermarketlayered.dao.CrudUtil;
import supermarketlayered.dao.custom.CustomerDao;
import supermarketlayered.entity.CustomerEntity;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class CustomerDaoImpl implements CustomerDao {

    @Override
    public boolean add(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO customer VALUES (?,?,?,?,?,?,?,?,?)", t.getCustId(), t.getCustTitle(), t.getCustName(), t.getDob(), t.getSalary(), t.getCustAddress(), t.getCity(), t.getProvince(), t.getPostalCode());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE customer SET CustTitle = ?, CustName = ?, DOB = ?, salary = ?, CustAddress = ?, City = ?, Province = ?, PostalCode = ? WHERE CustID = ?"
                , t.getCustTitle(),t.getCustName(),t.getDob(),t.getSalary(),t.getCustAddress(),t.getCity(),t.getProvince(),t.getPostalCode(),t.getCustId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM customer WHERE CustId = ?", id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM customer WHERE CustID = ?", id);

        while (rst.next()) {
            CustomerEntity customer = new CustomerEntity(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));
            
            return customer;
        }
        return null;
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM customer");

        ArrayList<CustomerEntity> customers = new ArrayList<>();

        while (rst.next()) {
            CustomerEntity customer = new CustomerEntity(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));
            customers.add(customer);
        }
        return customers;
    }

}
