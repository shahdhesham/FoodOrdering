/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

//import Exceptions.Verification;
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
import Exceptions.Verification;
import javafx.scene.control.ButtonType;
import javax.swing.JOptionPane;
import Exceptions.AlertAdd;
import java.io.Serializable;
/**
 *
 * @author Dell
 */
public class AddFoodGUI extends JFrame implements Serializable{

  //  private JLabel idLabel;
    //private JTextField idField;

    private JLabel nameLabel;
    private JTextField nameField;

    private JLabel priceLabel;
    private JTextField priceField;

    private JButton addButton;
    
     private JRadioButton appetizers , dessert, freshsalad,drinks,maindishes,sandwiches,soups;
 
       
      private final int width = 80;
    private final int height = 30;

    public AddFoodGUI()
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
               
       // idLabel = new JLabel(" Id");
        //idField = new JTextField();
        nameLabel = new JLabel("Name");
        nameField = new JTextField();
        priceLabel = new JLabel("price");
        priceField = new JTextField();

        addButton = new JButton("ADD");
        
        appetizers.setBounds(10, 10, 90, 50);
        freshsalad.setBounds(100, 10, 90,50);
        maindishes.setBounds(200, 10, 90,50);
        sandwiches.setBounds(300, 10, 90,50);
        soups.setBounds(400, 10,90,50);
        drinks.setBounds(500, 10, 90,50);
        dessert.setBounds(600, 10, 90,50);
        
       // idLabel.setBounds(50, 100, width, height);
        //idField.setBounds(200, 100, width, height);
        nameLabel.setBounds(50, 150, width, height);
        nameField.setBounds(200, 150, width, height);
        priceLabel.setBounds(50, 200, width, height);
        priceField.setBounds(200, 200, width, height);
       addButton.setBounds(400, 400, 100, height);

        //add(idLabel);
        //add(idField);
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

 setTitle("Add food");
        setSize(700, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Verification v = new Verification();
               
               boolean y = v.number(priceField.getText());
               boolean z =v.text(nameField.getText());
               
                if (appetizers.isSelected())
                {
                    if ( y==true && z==true)
                {
                
                   Appetizers ap=new Appetizers( nameField.getText(),Integer.parseInt( priceField.getText()));
                     ap.load();
                    Menu.Appetizer.add(ap);
                    ap.setID(Menu.Appetizer.indexOf(ap));
                   
                    JOptionPane.showMessageDialog(null, " Id is"+ap.getID());
                
                    ap.save();
                }
                else if ( y==false || z==false)
                    {
                       AlertAdd a = new AlertAdd();
                       a.setVisible(true);
                        setVisible(false);
                         dispose();

                    }
               
                }
                else if(freshsalad.isSelected())
                {
                     if (y==true && z==true)
                     {
                FreshSalads fs = new FreshSalads( nameField.getText(), Integer.parseInt( priceField.getText()));
                fs.load();
                  Menu.FreshSalad.add(fs);
                   fs.setID(Menu.FreshSalad.indexOf(fs));
                   JOptionPane.showMessageDialog(null, " Id is"+fs.getID());

                  fs.save();
                     }
                      else if ( y==false ||z==false)
                    {
                       AlertAdd a = new AlertAdd();
                       a.setVisible(true);
                        setVisible(false);
                    }

                }
                else if(maindishes.isSelected())
                { if ( y==true && z==true)
                     {
                      MainDishes m= new MainDishes( nameField.getText(), Integer.parseInt( priceField.getText()));
                 m.load();
                      Menu.MainDish.add(m);   
                  JOptionPane.showMessageDialog(null, " Id is"+m.getID());
                  m.save();
                     }
                else if ( y==false || z==false)
                    {
                       AlertAdd a = new AlertAdd();
                       a.setVisible(true);
                        setVisible(false);
                    }
                }
                else if(sandwiches.isSelected())
                {
                    if ( y==true && z==true)
                     {
                      Sandwiches s= new Sandwiches( nameField.getText(), Integer.parseInt( priceField.getText()));
                    s.load();
                      JOptionPane.showMessageDialog(null, " Id is"+s.getID());
                  Menu.Sandwich.add(s);    
                  s.save();

                     }
                      else if ( y==false || z==false)
                    {
                       AlertAdd a = new AlertAdd();
                       a.setVisible(true);
                        setVisible(false);
                    }
                }
                else if(drinks.isSelected())
                {
                    if ( y==true && z==true)
                     {
                    Drinks hd = new Drinks(nameField.getText(), Integer.parseInt( priceField.getText()));
                    hd.load();
                    JOptionPane.showMessageDialog(null, " Id is"+hd.getID());
                  Menu.Drink.add(hd);
                  hd.save();
                }
                 else if ( y==false || z==false)
                    {
                       AlertAdd a = new AlertAdd();
                       a.setVisible(true);
                        setVisible(false);
                    }
                }
                else if(dessert.isSelected())
                {
                    if ( y==true && z==true)
                     {
                    Desserts des = new Desserts( nameField.getText(), Integer.parseInt( priceField.getText()));
                    des.load();
                    JOptionPane.showMessageDialog(null, " Id is"+des.getID());
                    Menu.Dessert.add(des);
                  des.save();
                }
                else if (y==false ||z==false)
                    {
                       AlertAdd a = new AlertAdd();
                       a.setVisible(true);
                        setVisible(false);
                    }
                }
                else if(soups.isSelected())
                {
                    if (y==true && z==true)
                     {
                    Soups so = new Soups( nameField.getText(), Integer.parseInt( priceField.getText()));
                    so.load();
                    Menu.Soup.add(so);
                    JOptionPane.showMessageDialog(null, " Id is"+so.getID());
                  so.save();
                     }
                     else if (y==false || z==false)
                    {
                       AlertAdd a = new AlertAdd();
                       a.setVisible(true);
                        setVisible(false);
                      dispose();

                    }
                }
                 dispose();
               AddFoodGUI  addFoodGUI = new AddFoodGUI();
               addFoodGUI.setVisible(true);
                }
            
        });
        
                       

    }
 


}
