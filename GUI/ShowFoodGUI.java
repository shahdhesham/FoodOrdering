/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Order.Menu;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javafx.scene.control.CheckBox;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import otlob.FoodPackage.Appetizers;
import otlob.FoodPackage.*;

/**
 *
 * @author Dell
 */
public class ShowFoodGUI extends JFrame 
{
    JButton a,b,c,d,e,f,g;
    public ShowFoodGUI()  {
        
       setTitle("show  appetizers");
        setSize(600, 600);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
    
        JButton a = new JButton("appetizers");
        JButton b = new JButton("dessert");
        JButton c = new JButton("drinks");
        JButton d= new JButton("fresh salad");
        JButton e= new JButton("maindish");
        JButton f = new JButton("sandwich");
        JButton g = new JButton("soup");
        
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
        add(g);
        
        a.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               SelectAppetizers appetizers = new SelectAppetizers();
               appetizers.setVisible(true);
               
            }
       });
        b.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               SelectDessert dessert = new SelectDessert();
               dessert.setVisible(true);
               
           }
       });
        c.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               SelectDrink drink = new SelectDrink();
               drink.setVisible(true);
           }
       });
        d.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               SelectFreshsalad freshsalad = new SelectFreshsalad();
               freshsalad.setVisible(true);
           }
       });
        e.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               SelectMaindish maindish = new SelectMaindish();
               maindish.setVisible(true);
           }
       });
        f.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               SelectSandwiches sandwiches = new SelectSandwiches();
               sandwiches.setVisible(true);
           }
       });
        g.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               SelectSoups soups = new SelectSoups();
               soups.setVisible(true);
           }
       });
    }
  public  class SelectAppetizers extends JFrame
  {
       public SelectAppetizers(){
           setTitle("show  appetizers");
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       int y=50;
       for(Appetizers A:Menu.Appetizer){
        JCheckBox j =new JCheckBox(A.getID()+" "+A.getName()+" "+" "+A.getPrice());
        j.setBackground(Color.white);
        j.setBounds(100, y, 200, 30);
        y+=50;
        add(j);
        
        }
  }
    }
  public  class SelectSandwiches extends JFrame
  {
       public SelectSandwiches(){
           setTitle("show  sandwich");
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       int y=50;
       for(Sandwiches A:Menu.Sandwich){
        JCheckBox j =new JCheckBox(A.getID()+" "+A.getName()+" "+" "+A.getPrice());
        j.setBackground(Color.white);
        j.setBounds(100, y, 200, 30);
        y+=50;
        add(j);
        
        }
  }
    }
public  class SelectDessert extends JFrame
  {
       public SelectDessert(){
           setTitle("show  dessert");
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       int y=50;
       for(Desserts A:Menu.Dessert){
        JCheckBox j =new JCheckBox(A.getID()+" "+A.getName()+" "+" "+A.getPrice());
        j.setBackground(Color.white);
        j.setBounds(100, y, 200, 30);
        y+=50;
        add(j);
        
        }
  }
    }
public  class SelectDrink extends JFrame
  {
       public SelectDrink(){
           setTitle("show  dessert");
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       int y=50;
       for(Drinks A:Menu.Drink){
        JCheckBox j =new JCheckBox(A.getID()+" "+A.getName()+" "+" "+A.getPrice());
        j.setBackground(Color.white);
        j.setBounds(100, y, 200, 30);
        y+=50;
        add(j);
        
        }
  }
}
public  class SelectFreshsalad extends JFrame
  {
       public SelectFreshsalad(){
           setTitle("show  dessert");
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       int y=50;
       for(FreshSalads A:Menu.FreshSalad){
        JCheckBox j =new JCheckBox(A.getID()+" "+A.getName()+" "+" "+A.getPrice());
        j.setBackground(Color.white);
        j.setBounds(100, y, 200, 30);
        y+=50;
        add(j);
        
        }
  }
}
public  class SelectMaindish extends JFrame
  {
       public SelectMaindish(){
           setTitle("show  dessert");
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       int y=50;
       for(MainDishes A:Menu.MainDish){
        JCheckBox j =new JCheckBox(A.getID()+" "+A.getName()+" "+" "+A.getPrice());
        j.setBackground(Color.white);
        j.setBounds(100, y, 200, 30);
        y+=50;
        add(j);
        
        }
  }
}
public  class SelectSoups extends JFrame
  {
       public SelectSoups(){
           setTitle("show  dessert");
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       int y=50;
       for(Soups A:Menu.Soup){
        JCheckBox j =new JCheckBox(A.getID()+" "+A.getName()+" "+" "+A.getPrice());
        j.setBackground(Color.white);
        j.setBounds(100, y, 200, 30);
        y+=50;
        add(j);
        
        }
  }
}

}