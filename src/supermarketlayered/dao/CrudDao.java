/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarketlayered.dao;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public interface CrudDao <T, ID>extends SuperDao{
    
    public boolean add (T t) throws Exception;
    
    public boolean update(T t) throws Exception;
    
    public boolean delete(ID id) throws Exception;
    
    public T get (ID id) throws Exception;
    
    public ArrayList<T> getAll ()  throws  Exception;
    
}
