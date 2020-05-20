/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otlob.FoodPackage;

import Order.Menu;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class Sandwiches {
     
     protected int ID ;
     protected String name ;
     protected int price ;

    public Sandwiches(String name, int price) {
        this.name=name;
        this.price=price;
    }

    public Sandwiches() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

public void save  ()
  {
        try {
            ObjectOutputStream Bin=new ObjectOutputStream(new FileOutputStream("D:\\MIU\\sophmore year\\fall 2018\\OOP\\project\\FoodSandWiches.bin"));
            Bin.writeObject(Menu.Sandwich);
            } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

  }
      public void load()
  {
      try {
          ObjectInputStream input=new ObjectInputStream(new FileInputStream("D:\\MIU\\sophmore year\\fall 2018\\OOP\\project\\FoodSandWiches.bin"));
                Menu.Sandwich=(ArrayList<Sandwiches>)input.readObject();
    
      } catch (IOException | ClassNotFoundException ex) {
          Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
      }
  
  }}
