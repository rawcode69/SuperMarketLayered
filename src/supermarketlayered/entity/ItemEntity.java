/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.entity;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class ItemEntity {

    private String itemCode;
    private String descripiton;
    private String packSize;
    private Double unitPrice;
    private Integer qoh;

    public ItemEntity() {
    }

    public ItemEntity(String itemCode, String descripiton, String packSize, Double unitPrice, Integer qoh) {
        this.itemCode = itemCode;
        this.descripiton = descripiton;
        this.packSize = packSize;
        this.unitPrice = unitPrice;
        this.qoh = qoh;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the descripiton
     */
    public String getDescripiton() {
        return descripiton;
    }

    /**
     * @param descripiton the descripiton to set
     */
    public void setDescripiton(String descripiton) {
        this.descripiton = descripiton;
    }

    /**
     * @return the packSize
     */
    public String getPackSize() {
        return packSize;
    }

    /**
     * @param packSize the packSize to set
     */
    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    /**
     * @return the unitPrice
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the qoh
     */
    public Integer getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(Integer qoh) {
        this.qoh = qoh;
    }

    @Override
    public String toString() {
        return "ItemEntity{" + "itemCode=" + itemCode + ", descripiton=" + descripiton + ", packSize=" + packSize + ", unitPrice=" + unitPrice + ", qoh=" + qoh + '}';
    }
    
    
}
