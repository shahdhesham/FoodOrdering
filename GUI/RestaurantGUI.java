/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Order.EditrestaurantGUI;
import Order.Restaurant;
import static Order.Restaurant.restaurants;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import otlob.Otlob;
import static sun.swing.SwingUtilities2.submit;

/**
 *
 * @author HP
 */
public class RestaurantGUI extends JFrame implements Serializable
    {
    private JLabel idTagLabel;
   private JLabel nameTagLabel;

    private JLabel actionsTagLabel;

   // private JLabel idLabel;
    private JLabel nameLabel;

    public JLabel Cheke;
    
    private JButton addButton;
    private JButton saveButton;

//    public static ArrayList<Restaurant>restaurants= new ArrayList();

    int x_cor = 50;
    int y_cor = 80;
    Restaurant rest = new Restaurant();
        
    public RestaurantGUI() 
    {
        rest.load();
        
        if(Restaurant.restaurants.size()== 0) {
            
            Cheke=new JLabel();
            JOptionPane.showMessageDialog(null, "ArrayList is empty and there is no restaurants");
            Cheke.setText("ArrayList is empty and there is no restaurants");
            Cheke.setBounds(50,50,300,200);
            add(Cheke);
            
                        

            setTitle("Restaurants List");
            setSize(650, 700);
            setLayout(null);
            setVisible(true);
            getContentPane().setBackground(Color.white);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            addButton = new JButton("Add");
            addButton.setBounds(400, 600, 80, 30);
            add(addButton);
            addButton.setVisible(true);
                    

            addButton.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent e) {
                    AddrestaurantGUI add  = new AddrestaurantGUI();
                    add.setVisible(true);
                    setVisible(false);
                    MenuGUI gUI = new MenuGUI();
                    gUI.setVisible(true);
                    setVisible(false);
                }
            });
            
        }
        


            
      
                 
        
else {
            
            idTagLabel = new JLabel("RESTAURANT ID");
            nameTagLabel = new JLabel(" RESTAURANT NAME");

            actionsTagLabel = new JLabel("Actions");

            idTagLabel.setBounds(x_cor, y_cor - 50, 100, 30);
            nameTagLabel.setBounds(x_cor + 150, y_cor - 50, 100, 30);
            
            actionsTagLabel.setBounds(x_cor + 400, y_cor - 50, 100, 30);

            idTagLabel.setForeground(Color.red);
            nameTagLabel.setForeground(Color.red);
            
            actionsTagLabel.setForeground(Color.red);

            add(idTagLabel);
            add(nameTagLabel);
           
            add(actionsTagLabel);
            rest.load();
            for (int i = 0; i < restaurants.size(); i++)
            {
                
                nameLabel = new JLabel(restaurants.get(i).getName());
                idTagLabel=new JLabel(""+restaurants.get(i).getId());
                
                
                nameLabel.setBounds(x_cor +150,y_cor , 100, 30);
                
                add(nameLabel);
                
                
                
                
                
                
                

               
                
               
                JButton deleteButton = new JButton("Delete");
                deleteButton.setBounds(x_cor + 450, y_cor, 70, 30);
                add(deleteButton);
                deleteButton.setActionCommand(""+i);
                            rest.load();

                deleteButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to delete this Restaurant");
                        
                        int index = Integer.parseInt(e.getActionCommand());
                     Restaurant.restaurants.remove(index);
                        RestaurantGUI gui = new RestaurantGUI();
                        dispose(); }
                });
                y_cor += 40;
                
            }
            addButton = new JButton("Add");
            addButton.setBounds(400, 600, 80, 30);
            add(addButton);
            addButton.setVisible(true);
                        rest.load();

            addButton.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent e) {
                    AddrestaurantGUI add  = new AddrestaurantGUI();
                    
                    add.setVisible(true);
                    
                    dispose(); }
            });
            
            
            
            
            
            saveButton = new JButton("SAVE");
            saveButton.setBounds(500, 600, 80, 30);
            add(saveButton);
                        rest.load();

            saveButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Restaurant rest = new Restaurant();
                    //rest.load();
                    rest.save();
                    
                    JOptionPane.showMessageDialog(rootPane,"Saved ");
                    
                    
                    
                    
                    
                }
                
            });
            
            setTitle("Restaurant List");
            setSize(650, 700);
            setLayout(null);
            setVisible(true);
            getContentPane().setBackground(Color.white);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}