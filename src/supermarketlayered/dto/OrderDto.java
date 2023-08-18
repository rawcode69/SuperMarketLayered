/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.dto;

import java.util.ArrayList;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class OrderDto {
    private String orderId;
    private String custId;
    
    private ArrayList<OrderDetailDto> orderDetails;

    public OrderDto() {
    }

    public OrderDto(String orderId, String custId, ArrayList<OrderDetailDto> orderDetails) {
        this.orderId = orderId;
        this.custId = custId;
        this.orderDetails = orderDetails;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the orderDetails
     */
    public ArrayList<OrderDetailDto> getOrderDetails() {
        return orderDetails;
    }

    /**
     * @param orderDetails the orderDetails to set
     */
    public void setOrderDetails(ArrayList<OrderDetailDto> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "OrderDto{" + "orderId=" + orderId + ", custId=" + custId + ", orderDetails=" + orderDetails + '}';
    }
    
    
}
