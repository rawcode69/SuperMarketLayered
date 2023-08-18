/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.controller;

import supermarketlayered.dto.OrderDto;
import supermarketlayered.service.custom.orderService;
import supermarketlayered.service.ServiceFactory;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class OrderController {
    
    orderService orderService = (orderService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ORDER);
    
    public String placeOrder(OrderDto order) throws Exception{
       return orderService.placeOrder(order);
    }
    
}
