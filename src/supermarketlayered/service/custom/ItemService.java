/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarketlayered.service.custom;

import java.util.ArrayList;
import supermarketlayered.dto.ItemDto;
import supermarketlayered.service.SuperService;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public interface ItemService extends SuperService{

    public String saveItem (ItemDto item) throws Exception;

    public ArrayList<ItemDto> getAllItem();

    public ItemDto searchItem(String custId);

    public String updateItem(ItemDto item);

    public String deleteItem(String custId);
    
}
