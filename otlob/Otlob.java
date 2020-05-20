
package otlob;
import GUI.AddFoodGUI;
import GUI.MenuGUI;
import GUI.OpenningGUI;
import GUI.RestaurantGUI;
import GUI.RestaurantGUIuser;
import GUI.ShowFoodGUI;
import Order.*;
import static Order.Menu.Appetizer;
import Users.*;
import java.io.IOException;
import java.util.*;
import otlob.FoodPackage.Appetizers;
import otlob.FoodPackage.Desserts;


public class Otlob {

    public static ArrayList<Restaurant> restaurants=new ArrayList<Restaurant>();
    public static ArrayList<User> users=new ArrayList<User>();
    public static ArrayList<Admin> admins=new ArrayList<Admin>();
    public static HashMap< String, String> usersHash = new HashMap<String, String>();
    public static HashMap< String, String> adminsHash = new HashMap<String, String>();
    
    
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
  Appetizers ap = new  Appetizers();
ap.load();
        Desserts d = new Desserts();
        d.load();
        Restaurant r = new Restaurant();
        r.load();
     
 Restaurant n=  new Restaurant();
 n.load();
 
 //ShowFoodGUI foodGUI =  new ShowFoodGUI();
 //foodGUI.setVisible(true);
  
  MenuGUI  x = new MenuGUI();
  x.setVisible(true);
// OpenningGUI g=new OpenningGUI();
//g.setVisible(true);

   //RestaurantGUI ss = new RestaurantGUI();
    
    }
}