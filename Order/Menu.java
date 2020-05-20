package Order;



import java.util.ArrayList;
import javax.swing.JFrame;
import otlob.FoodPackage.Appetizers;
import otlob.FoodPackage.Desserts;
import otlob.FoodPackage.FreshSalads;
import otlob.FoodPackage.Drinks;
import otlob.FoodPackage.MainDishes;
import otlob.FoodPackage.Sandwiches;
import otlob.FoodPackage.Soups;



/**
 *
 * @author Dell
 */
public  class Menu extends JFrame implements seriazable{
    public static ArrayList<Appetizers> Appetizer = new ArrayList<Appetizers>();
    public static ArrayList<FreshSalads> FreshSalad = new ArrayList<FreshSalads>();
    public static ArrayList<Soups> Soup = new ArrayList<Soups>();
    public static ArrayList<Desserts> Dessert = new ArrayList<Desserts>();
    public static ArrayList<MainDishes> MainDish = new ArrayList<MainDishes>();
    public static ArrayList<Sandwiches> Sandwich = new ArrayList<Sandwiches>();
    public static ArrayList<Drinks> Drink = new ArrayList<Drinks>();
}
    //private JButton appetizers , dessert, freshsalad,hotdrinks,maindishes,sandwiches,softdrinks,soups;
    //rivate JButton AddFood,RemoveFood,close,show;
    
 //   private final int  numberButtons =8;
//     public void save  ()
//  {
//        try {
//            ObjectOutputStream Bin=new ObjectOutputStream(new FileOutputStream("D:\\MIU\\fall 2018\\OOP\\project.bin"));
//            Bin.writeObject(Menu.Appetizer);
//             Bin.writeObject(Menu.FreshSalad);
//             Bin.writeObject(Menu.Soup);
//             Bin.writeObject(Menu.Dessert);
//             Bin.writeObject(Menu.MainDish);
//             Bin.writeObject(Menu.Sandwich);
//             Bin.writeObject(Menu.SoftDrink);
//             Bin.writeObject(Menu.HotDrink);
//             
//             
//             
//        } catch (IOException ex) {
//            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//  }
//      public void load()
//  {
//      try {
//          ObjectInputStream input=new ObjectInputStream(new FileInputStream("D:\\MIU\\fall 2018\\OOP\\project.bin"));
//        Menu.HotDrink=(ArrayList<Drinks>)input.readObject();
//        Menu.SoftDrink=(ArrayList<SoftDrinks>)input.readObject();
//        Menu.Sandwich=(ArrayList<Sandwiches>)input.readObject();
//        Menu.Dessert=(ArrayList<Desserts>)input.readObject();
//        Menu.FreshSalad=(ArrayList<FreshSalads>)input.readObject();
//        Menu.MainDish=(ArrayList<MainDishes>)input.readObject();
//        Menu.Soup=(ArrayList<Soups>)input.readObject();
//          
//      } catch (IOException | ClassNotFoundException ex) {
//          Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
//      }
//  
//  
//  }
      
     
  
  






      

   

  
