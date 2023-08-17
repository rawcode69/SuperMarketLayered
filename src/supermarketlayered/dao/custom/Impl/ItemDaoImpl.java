/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.dao.custom.Impl;

import java.util.ArrayList;
import supermarketlayered.dao.CrudUtil;
import supermarketlayered.dao.custom.ItemDao;
import supermarketlayered.entity.ItemEntity;
import java.sql.ResultSet;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class ItemDaoImpl implements ItemDao {

    @Override
    public boolean add(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO item VALUES (?,?,?,?,?)",
                t.getItemCode(), t.getDescripiton(), t.getPackSize(), t.getUnitPrice(), t.getQoh());
    }

    @Override
    public boolean update(ItemEntity t) throws Exception {
       return CrudUtil.executeUpdate("UPDATE item SET Description = ?, PackSize = ?, UnitPrice = ?, QtyOnHand = ? WHERE ItemCode = ?"
               , t.getDescripiton(),t.getPackSize(),t.getUnitPrice(),t.getQoh(),t.getItemCode());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM item WHERE ItemCode = ?", id);
    }

    @Override
    public ItemEntity get(String id) throws Exception {

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM item WHERE ItemCode = ?", id);

        while (rst.next()) {
            ItemEntity ie = new ItemEntity(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getInt(5));
            return  ie;
        }
        return null;
    }

    @Override
    public ArrayList<ItemEntity> getAll() throws Exception {

        ArrayList<ItemEntity> entitys = new ArrayList<>();

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM item");

        while (rst.next()) {
            ItemEntity entity = new ItemEntity(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getInt(5));
            entitys.add(entity);
        }
        return entitys;
    }

}
