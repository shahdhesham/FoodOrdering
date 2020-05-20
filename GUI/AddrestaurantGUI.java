/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.RestaurantGUI;
import Order.Restaurant;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import otlob.Otlob;

/**
 *
 * @author HP
 */
public class AddrestaurantGUI extends JFrame {

    private JLabel idLabel;
    private JTextField idField;

    private JLabel nameLabel;
    private JTextField nameField;

    private JButton saveButton;

    int x_cor = 50;
    int y_cor = 50;
    int width = 300;
    int height = 30;

    public AddrestaurantGUI() {

        setTitle("Add Restaurant");
        setSize(600, 400);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        idLabel = new JLabel("Restaurant Id");
        idField = new JTextField();
        nameLabel = new JLabel("Restaurant Name");
        nameField = new JTextField();

        saveButton = new JButton("ADD");
        saveButton.addActionListener(e -> this.dispose());

        idLabel.setBounds(50, 50, width, height);
        idField.setBounds(200, 50, width, height);
        nameLabel.setBounds(50, 100, width, height);
        nameField.setBounds(200, 100, width, height);

        saveButton.setBounds(200, 200, 100, height);

        add(idLabel);
        add(idField);
        add(nameLabel);
        add(nameField);

        add(saveButton);
        saveButton.addActionListener(new Action());

    }

    private class Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Restaurant restaurant = new Restaurant();
             restaurant.load();
          
           
            restaurant.setName(nameField.getText());

           
            restaurant.setId(Restaurant.restaurants.size());
            
         Restaurant.restaurants.add(restaurant);
        
            RestaurantGUI fr = new RestaurantGUI();
            
            fr.setVisible(true);
        }
    }

}
