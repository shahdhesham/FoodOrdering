/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Exceptions.Verification;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import Order.Menu;
import otlob.FoodPackage.Appetizers;
import otlob.FoodPackage.Desserts;
import otlob.FoodPackage.FreshSalads;
import  otlob.FoodPackage.MainDishes;
import otlob.FoodPackage.Sandwiches;
import otlob.FoodPackage.Drinks;
import otlob.FoodPackage.Soups;
//import exceptions.Verification;
import javafx.scene.control.ButtonType;
import javax.swing.JOptionPane;
import Exceptions.AlertAdd;
import Exceptions.AlertEdit;
/**
 *
 * @author Dell
 */
public class EditFoodGUI extends JFrame {

   private JLabel idLabel;
   private JTextField idField;

    private JLabel nameLabel;
    private JTextField nameField;

    private JLabel priceLabel;
    private JTextField priceField;

    private JButton addButton;
    
     private JRadioButton appetizers , dessert, freshsalad,drinks,maindishes,sandwiches,soups;
 
       
      private final int width = 80;
    private final int height = 30;

    public EditFoodGUI()
    {    
   
        appetizers = new JRadioButton("appetizers");
        dessert = new JRadioButton("dessert");
         freshsalad=new JRadioButton("freshsalad");
         maindishes=new JRadioButton("main dish");
         sandwiches= new JRadioButton("sandwich");
         drinks= new JRadioButton("Drinks");
          soups= new JRadioButton("soup");
          
        ButtonGroup BG =new ButtonGroup();
BG.add(appetizers);
BG.add(freshsalad);
BG.add(maindishes);
BG.add(sandwiches);
BG.add(drinks);
BG.add(soups);
               
        idLabel = new JLabel(" Id");
        idField = new JTextField();
        nameLabel = new JLabel("Name");
        nameField = new JTextField();
        priceLabel = new JLabel("price");
        priceField = new JTextField();

        addButton = new JButton("Edit");
        
        appetizers.setBounds(10, 10, 90, 50);
        freshsalad.setBounds(100, 10, 90,50);
        maindishes.setBounds(200, 10, 90,50);
        sandwiches.setBounds(300, 10, 90,50);
        soups.setBounds(400, 10,90,50);
        drinks.setBounds(500, 10, 90,50);
        dessert.setBounds(600, 10, 90,50);
        
       idLabel.setBounds(50, 100, width, height);
       idField.setBounds(200, 100, width, height);
        nameLabel.setBounds(50, 150, width, height);
        nameField.setBounds(200, 150, width, height);
        priceLabel.setBounds(50, 200, width, height);
        priceField.setBounds(200, 200, width, height);
       addButton.setBounds(400, 400, 100, height);

        add(idLabel);
        add(idField);
        add(nameLabel);
        add(nameField);
        add(priceLabel);
        add(priceField);
        add(addButton);
add(appetizers);
add(freshsalad);
add(maindishes);
add(sandwiches);
add(drinks);
add(soups);
add(dessert);

 setTitle("Edit food");
        setSize(700, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Verification v = new Verification();
               Boolean x = v.number(idField.getText());
               boolean y = v.number(priceField.getText());
               boolean z =v.text(nameField.getText());
               
                if (appetizers.isSelected())
                {
                    
                    if ( y==true && z==true && x==true)
                {
                
                   Appetizers ap=new Appetizers( nameField.getText(),Integer.parseInt( priceField.getText()));
                     ap.load();
                 
                     Menu.Appetizer.set(Integer.parseInt(idField.getText()), ap);
                    ap.save();
                }
                else if ( y==false || z==false || z==false)
                    {
                       AlertEdit a = new AlertEdit();
                       a.setVisible(true);
                        setVisible(false);
                    }
                    
                     }
                
                else if(freshsalad.isSelected())
                {
                     if (y==true && z==true && x==true)
                     {
                FreshSalads fs = new FreshSalads( nameField.getText(), Integer.parseInt( priceField.getText()));
                fs.load();
                  Menu.FreshSalad.set(Integer.parseInt(idField.getText()),fs);
                   
                  fs.save();
                     }
                      else if ( y==false ||z==false ||x==false)
                    {
                       AlertEdit a = new AlertEdit();
                       a.setVisible(true);
                        setVisible(false);
                    }

                }
                
                else if(maindishes.isSelected())
                {
                    if ( y==true && z==true && x==true)
                     {
                      MainDishes m= new MainDishes( nameField.getText(), Integer.parseInt( priceField.getText()));
                 m.load();
                      Menu.MainDish.set(Integer.parseInt(idField.getText()),m);   
                  m.save();
                     }
                else if ( y==false || z==false ||x==false)
                    {
                     AlertEdit a = new AlertEdit();
                       a.setVisible(true);
                        setVisible(false);
                    }
                  }
                
                else if(sandwiches.isSelected())
                {
                  
                   
                    if ( y==true && z==true && x==true)
                     {
                      Sandwiches s= new Sandwiches( nameField.getText(), Integer.parseInt( priceField.getText()));
                    s.load();
                  Menu.Sandwich.set(Integer.parseInt(idField.getText()),s);    
                  s.save();

                     }
                      else if ( y==false || z==false ||x==false)
                    {
                      AlertEdit a = new AlertEdit();
                       a.setVisible(true);
                        setVisible(false);
                    }
                
                    }
                
                else if(drinks.isSelected())
                {  if ( y==true && z==true &&x==true)
                     {
                    Drinks hd = new Drinks(nameField.getText(), Integer.parseInt( priceField.getText()));
                    hd.load();
                  Menu.Drink.set(Integer.parseInt(idField.getText()),hd);
                  hd.save();
                }
                 else if ( y==false || z==false ||x==false)
                    {
                    AlertEdit a = new AlertEdit();
                       a.setVisible(true);
                        setVisible(false);
                    }
                }
                
                else if(dessert.isSelected())
                {
                    if ( y==true && z==true && x==true)
                     {
                    Desserts des = new Desserts( nameField.getText(), Integer.parseInt( priceField.getText()));
                    des.load();
                    Menu.Dessert.set(Integer.parseInt(idField.getText()),des);
                  des.save();
                }
                else if (y==false ||z==false || x==false)
                    {
                      AlertEdit a = new AlertEdit();
                       a.setVisible(true);
                        setVisible(false);
                    }
                }
                
                else if(soups.isSelected())
                {
                    if (y==true && z==true &&x==true)
                     {
                    Soups so = new Soups( nameField.getText(), Integer.parseInt( priceField.getText()));
                    so.load();
                    Menu.Soup.set(Integer.parseInt(idField.getText()),so);
                  so.save();
                     }
                     else if (y==false || z==false || x==false)
                    {
                      AlertEdit a = new AlertEdit();
                       a.setVisible(true);
                        setVisible(false);
                    }
                }
                 dispose();
               AddFoodGUI  addFoodGUI = new AddFoodGUI();
               addFoodGUI.setVisible(true);
                }
            
        });
        
                       

    }
 


}
