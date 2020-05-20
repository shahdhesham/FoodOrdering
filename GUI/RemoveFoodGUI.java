/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Order.Menu;
import Exceptions.AlertRemove;
import Exceptions.Verification;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import otlob.FoodPackage.Appetizers;
import otlob.FoodPackage.Desserts;
import otlob.FoodPackage.FreshSalads;
import  otlob.FoodPackage.MainDishes;
import otlob.FoodPackage.Sandwiches;
import otlob.FoodPackage.Drinks;
import otlob.FoodPackage.Soups;
/**
 *
 * @author Dell
 */
public class RemoveFoodGUI  extends JFrame{
     private JRadioButton appetizers , dessert, freshsalad,drinks,maindishes,sandwiches,soups;
    private JButton Button;
   private JLabel idLabel;
  private JTextField idField;

    public RemoveFoodGUI() 
    {
          idLabel = new JLabel(" Id");
        idField = new JTextField();
       
        
         appetizers = new JRadioButton("appetizers");
        dessert = new JRadioButton("dessert");
         freshsalad=new JRadioButton("freshsalad");
         maindishes=new JRadioButton("main dish");
         sandwiches= new JRadioButton("sandwich");
         drinks= new JRadioButton("Drinks");
          soups= new JRadioButton("soup");
          
          Button = new JButton("Remove");
          
        ButtonGroup BG =new ButtonGroup();
BG.add(appetizers);
BG.add(freshsalad);
BG.add(maindishes);
BG.add(sandwiches);
BG.add(drinks);
BG.add(soups);

 appetizers.setBounds(10, 10, 90, 50);
        freshsalad.setBounds(100, 10, 90,50);
        maindishes.setBounds(200, 10, 90,50);
        sandwiches.setBounds(300, 10, 90,50);
        soups.setBounds(400, 10,90,50);
        drinks.setBounds(500, 10, 90,50);
        dessert.setBounds(600, 10, 90,50);
        Button.setBounds(200, 200, 100, 100);
 idLabel.setBounds(50, 100, 80, 30);
        idField.setBounds(200, 100, 80, 30);
      
        add(Button);
add(appetizers);
add(freshsalad);
add(maindishes);
add(sandwiches);
add(drinks);
add(soups);
add(dessert);
 add(idLabel);
 add(idField);
 
 setTitle("Delete food");
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
 Button.addActionListener(new BUtton());
        
                       

   
    }
    
 class BUtton implements ActionListener{

                  @Override
                  public void actionPerformed(ActionEvent e) {
 Verification v = new Verification();
                boolean y = v.number(idField.getText());
              if (appetizers.isSelected())
                {
                    if ( y==true)
                    {
                     Appetizers ap=new Appetizers();
                     ap.load();
                    Menu.Appetizer.remove(idField.getText());
                   
                    ap.save();
                
                  }
                    else 
                    {
                        AlertRemove a = new AlertRemove();
                        a.setVisible(true);
                        setVisible(false);
                   }
                }
            else if (freshsalad.isSelected())
                
            {     if (y==true){
               FreshSalads fs = new FreshSalads();
                fs.load();
              
                 Menu.FreshSalad.remove(idField.getText());
           JOptionPane.showMessageDialog(null, "Item is deleted");
                   
                    fs.save();
                     }
            else 
                    {
                        AlertRemove a = new AlertRemove();
                        a.setVisible(true);
                        setVisible(false);
                   }
            }
            else if (maindishes.isSelected())
                { if ( y==true )
                {
                  MainDishes md = new MainDishes();
                    md.load();
              
                 Menu.MainDish.remove(idField.getText());
           JOptionPane.showMessageDialog(null, "Item is deleted");
                   
                    md.save();
                     }
                   else 
                    {
                        AlertRemove a = new AlertRemove();
                        a.setVisible(true);
                        setVisible(false);
                   }
                }    
            else if (sandwiches.isSelected())
            {if ( y==true )
                {
                  Sandwiches s = new Sandwiches();
                    s.load();
              
                 Menu.Sandwich.remove(idField.getText());
           JOptionPane.showMessageDialog(null, "Item is deleted");
                   
                    s.save();
                     }
                   else 
                    {
                        AlertRemove a = new AlertRemove();
                        a.setVisible(true);
                        setVisible(false);
                   }
            }    
            else if (soups.isSelected())
            {
                if ( y==true )
                {
                  Soups so = new Soups();
                    so.load();
              
                 Menu.Soup.remove(idField.getText());
           JOptionPane.showMessageDialog(null, "Item is deleted");
                   
                    so.save();
                     }
                   else 
                    {
                        AlertRemove a = new AlertRemove();
                        a.setVisible(true);
                        setVisible(false);
                   }
            }    
             else if (dessert.isSelected())
            {
                if ( y==true )
                {
                  Desserts d = new Desserts();
                    d.load();
              
                 Menu.Dessert.remove(idField.getText());
           JOptionPane.showMessageDialog(null, "Item is deleted");
                   
                    d.save();
                     }
                   else 
                    {
                        AlertRemove a = new AlertRemove();
                        a.setVisible(true);
                        setVisible(false);
                   }
            }    
               else if (drinks.isSelected())
            {
                if ( y==true )
                {
                  Drinks dr = new Drinks();
                    dr.load();
              
                 Menu.Drink.remove(idField.getText());
                              JOptionPane.showMessageDialog(null, "Item is deleted");

                    dr.save();
                     }
                   else 
                    {
                        AlertRemove a = new AlertRemove();
                        a.setVisible(true);
                        setVisible(false);
                   }
            }    
        dispose();
               RemoveFoodGUI  removeFoodGUI = new RemoveFoodGUI();
               removeFoodGUI.setVisible(true); }
    }


}




