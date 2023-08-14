/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarketlayered.dao;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public interface CrudDao <T, ID>extends SuperDao{
    
    public boolean add(T t);
    
    public boolean update(T t);
    
    public boolean delete(ID id);
    
}
