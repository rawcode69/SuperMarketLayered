/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.service.custom.Impl;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import supermarketlayered.dao.DaoFactory;
import supermarketlayered.dao.custom.ItemDao;
import supermarketlayered.dto.ItemDto;
import supermarketlayered.entity.ItemEntity;
import supermarketlayered.service.custom.ItemService;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class ItermServiceImpl implements ItemService {

    ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String saveItem(ItemDto item) throws Exception {

        try {
            if (itemDao.add(new ItemEntity(
                    item.getItemCode(),
                    item.getDescripiton(),
                    item.getPackSize(),
                    item.getUnitPrice(),
                    item.getQoh()))) {

                return "Succes";
            } else {
                return "Item save failed";
            }
        } catch (Exception e) {

        }
        return null;

    }

    @Override
    public ArrayList<ItemDto> getAllItem() {
        try {
            ArrayList<ItemDto> itemDtos = new ArrayList<>();

            ArrayList<ItemEntity> entitys = itemDao.getAll();

            for (ItemEntity entity : entitys) {
                ItemDto itemdto = new ItemDto(
                        entity.getItemCode(),
                        entity.getDescripiton(),
                        entity.getPackSize(),
                        entity.getUnitPrice(),
                        entity.getQoh());

                itemDtos.add(itemdto);
            }

            return itemDtos;
        } catch (Exception ex) {
            Logger.getLogger(ItermServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ItemDto searchItem(String custId) {
        try {
            ItemEntity entity = itemDao.get(custId);

            ItemDto itemDto = new ItemDto(
                    entity.getItemCode(),
                    entity.getDescripiton(),
                    entity.getPackSize(),
                    entity.getUnitPrice(),
                    entity.getQoh());

            return itemDto;

        } catch (Exception ex) {
            Logger.getLogger(ItermServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String updateItem(ItemDto item) {
        try {
            if (itemDao.update(new ItemEntity(
                    item.getItemCode(),
                    item.getDescripiton(),
                    item.getPackSize(),
                    item.getUnitPrice(),
                    item.getQoh()))) {
                return "Succes";
            }else{
                return "Item Update Failed";
            }
        } catch (Exception ex) {
            Logger.getLogger(ItermServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String deleteItem(String custId) {
        try {
            if(itemDao.delete(custId)){
                return "Succes";
            }else{
                return "Item Delete failed";
            }
        } catch (Exception ex) {
            Logger.getLogger(ItermServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
