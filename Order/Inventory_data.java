/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

/**
 *
 * @author HP
 */
public class Inventory_data {
    protected Menu Item;
    boolean avaialable=true;
    
    public boolean Check_Available(){
        if (avaialable )  
            return false;
        
        else return true;
        
    }
}
