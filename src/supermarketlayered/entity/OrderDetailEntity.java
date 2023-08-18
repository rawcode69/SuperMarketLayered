/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.entity;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class OrderDetailEntity {
    private String OrderId;
    private String ItemCode;
    private Integer OrderQty;
    private Double Discount;

    public OrderDetailEntity() {
    }

    public OrderDetailEntity(String OrderId, String ItemCode, Integer OrderQty, Double Discount) {
        this.OrderId = OrderId;
        this.ItemCode = ItemCode;
        this.OrderQty = OrderQty;
        this.Discount = Discount;
    }

    /**
     * @return the OrderId
     */
    public String getOrderId() {
        return OrderId;
    }

    /**
     * @param OrderId the OrderId to set
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * @return the ItemCode
     */
    public String getItemCode() {
        return ItemCode;
    }

    /**
     * @param ItemCode the ItemCode to set
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * @return the OrderQty
     */
    public Integer getOrderQty() {
        return OrderQty;
    }

    /**
     * @param OrderQty the OrderQty to set
     */
    public void setOrderQty(Integer OrderQty) {
        this.OrderQty = OrderQty;
    }

    /**
     * @return the Discount
     */
    public Double getDiscount() {
        return Discount;
    }

    /**
     * @param Discount the Discount to set
     */
    public void setDiscount(Double Discount) {
        this.Discount = Discount;
    }

    @Override
    public String toString() {
        return "OrderDetailEntity{" + "OrderId=" + OrderId + ", ItemCode=" + ItemCode + ", OrderQty=" + OrderQty + ", Discount=" + Discount + '}';
    }
    
    
}
