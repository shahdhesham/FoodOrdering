
package Order;

import Order.Menu;
import Order.Restaurant;
import Order.Order;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class RestaurantControl extends Restaurant {

    protected ArrayList <Restaurant> restaurants = new ArrayList <Restaurant>(1000);
    protected Order order;
    protected ArrayList <Menu> menu = new ArrayList <Menu>(1000);
    public int Mysize;

    public void Add(Restaurant restaurant,int i) {           //ADD RESTAURANT
        restaurants.add(i,restaurant);
         Mysize++;
    }
    
    public void Update(int pos, Restaurant r) {     
       restaurants.set(pos,r);
} 
      
   
    public void delete(int i) {    //Delete restaurant
      restaurants.remove(i);
    }

    public boolean Approve_Delivery() {
        
        if (order != null) 
            return true;
        else 
            return false;
        

    }
}
