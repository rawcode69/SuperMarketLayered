/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.entity;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class OrderEntity {
    private String OrderId;
    private String CustiId;
    private String Date;

    public OrderEntity() {
    }

    public OrderEntity(String OrderId, String CustiId, String Date) {
        this.OrderId = OrderId;
        this.CustiId = CustiId;
        this.Date = Date;
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
     * @return the CustiId
     */
    public String getCustiId() {
        return CustiId;
    }

    /**
     * @param CustiId the CustiId to set
     */
    public void setCustiId(String CustiId) {
        this.CustiId = CustiId;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "OrderEntity{" + "OrderId=" + OrderId + ", CustiId=" + CustiId + ", Date=" + Date + '}';
    }
    
    
}
