/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.dao.custom.Impl;

import java.util.ArrayList;
import supermarketlayered.dao.CrudUtil;
import supermarketlayered.dao.custom.OrderDetailDao;
import supermarketlayered.entity.OrderDetailEntity;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class OrderDetailImpl implements OrderDetailDao{

    @Override
    public boolean add(OrderDetailEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO orderdetail VALUES (?,?,?,?)", t.getOrderId(),t.getItemCode(),t.getOrderQty(),t.getDiscount());
    }

    @Override
    public boolean update(OrderDetailEntity t) throws Exception {
         return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public OrderDetailEntity get(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<OrderDetailEntity> getAll() throws Exception {
       return null;
    }


}
