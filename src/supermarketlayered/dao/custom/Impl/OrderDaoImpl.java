/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.dao.custom.Impl;

import java.util.ArrayList;
import supermarketlayered.dao.CrudUtil;
import supermarketlayered.dao.custom.OrderDao;
import supermarketlayered.entity.OrderEntity;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class OrderDaoImpl implements OrderDao{

    
    
    @Override
    public boolean add(OrderEntity t) throws Exception {
        
        return CrudUtil.executeUpdate("INSERT INTO orders VALUES (?,?,?)",t.getOrderId() ,t.getDate(),t.getCustiId());
    }

    @Override
    public boolean update(OrderEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public OrderEntity get(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<OrderEntity> getAll() throws Exception {
         return null;
    }
    
}
