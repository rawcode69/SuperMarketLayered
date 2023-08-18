/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.service.custom.Impl;

import supermarketlayered.dao.DaoFactory;
import supermarketlayered.dao.custom.OrderDao;
import supermarketlayered.dto.OrderDto;
import supermarketlayered.service.custom.orderService;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import supermarketlayered.dao.custom.ItemDao;
import supermarketlayered.dao.custom.OrderDetailDao;
import supermarketlayered.db.DBConnection;
import supermarketlayered.dto.OrderDetailDto;
import supermarketlayered.entity.ItemEntity;
import supermarketlayered.entity.OrderDetailEntity;
import supermarketlayered.entity.OrderEntity;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class OrderServiceImpl implements orderService {

    private OrderDetailDao orderDetailDao = (OrderDetailDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDERDETAIL);
    private OrderDao orderDao = (OrderDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDER);
    private ItemDao ItemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String placeOrder(OrderDto order) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        connection.setAutoCommit(false);

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            if (orderDao.add(new OrderEntity(
                    order.getOrderId(),
                    order.getCustId(),
                    sdf.format(new Date())))) {

                boolean isOrderdetailSaved = true;

                for (OrderDetailDto orderDetail : order.getOrderDetails()) {
                    if (!orderDetailDao.add(new OrderDetailEntity(
                            order.getOrderId(),
                            orderDetail.getItemCode(),
                            orderDetail.getOrderQty(),
                            orderDetail.getDiscount()))) {
                        isOrderdetailSaved = false;
                    }
                }

                if (isOrderdetailSaved) {

                    boolean isItemUpdated = true;

                    for (OrderDetailDto orderDetail : order.getOrderDetails()) {

                        ItemEntity entity = ItemDao.get(orderDetail.getItemCode());
                        entity.setQoh(entity.getQoh() - orderDetail.getOrderQty());
                        if (!ItemDao.update(entity)) {
                            isItemUpdated = false;
                        }
                    }

                    if (isItemUpdated) {
                        connection.commit();
                        return "Succes";
                    } else {
                        return "Item Saved Error";

                    }
                } else {
                    connection.rollback();
                    return "OrderDetail Save Error";
                }

            } else {
                connection.rollback();
                return "Order Save Error";
            }

        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }
}
