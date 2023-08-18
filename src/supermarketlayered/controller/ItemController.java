/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.controller;

import java.util.ArrayList;
import supermarketlayered.dto.ItemDto;
import supermarketlayered.service.ServiceFactory;
import supermarketlayered.service.custom.ItemService;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class ItemController {

    ItemService itemService = (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);

    public String saveItem(ItemDto item) throws Exception {
        return itemService.saveItem(item);
    }

    public ArrayList<ItemDto> getAllItems() throws Exception {
        return itemService.getAllItem();
    }

    public ItemDto searchItem(String custId) throws Exception {
        return itemService.searchItem(custId);
    }

    public String updateItem(ItemDto item) throws Exception {
        return itemService.updateItem(item);
    }

    public String deleteItem(String custId) throws Exception {
        return itemService.deleteItem(custId);
    }

}
