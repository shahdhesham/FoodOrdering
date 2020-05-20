/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import GUI.RestaurantGUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import otlob.Otlob;

/**
 *
 * @author HP
 */
public class EditrestaurantGUI extends JFrame {

    private JLabel idLabel;
    private JTextField idField;

    private JLabel nameLabel;
    private JTextField nameField;

    private JButton saveButton;

    public EditrestaurantGUI(int index, String id, String name) {

        setTitle("Edit Student");
        setSize(600, 400);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int x_cor = 50;
        int y_cor = 50;
        int width = 300;
        int height = 30;

        idLabel = new JLabel("Student Id");
        idField = new JTextField(id);
        nameLabel = new JLabel("Student Name");
        nameField = new JTextField(name);

        saveButton = new JButton("SAVE");
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

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Restaurant updatedrestaurant = new Restaurant();
                updatedrestaurant.load();
               Restaurant.restaurants.set(index, updatedrestaurant);
                RestaurantGUI restGUI = new RestaurantGUI();

                dispose();
            }
        });
    }

    public EditrestaurantGUI(int index, Restaurant restaurant) {

        setTitle("Edit Restaurant");
        setSize(600, 400);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int x_cor = 50;
        int y_cor = 50;
        int width = 300;
        int height = 30;

        idLabel = new JLabel("Student Id");
        idField = new JTextField(restaurant.getId());
        nameLabel = new JLabel("Student Name");
        nameField = new JTextField(restaurant.getName());

        saveButton = new JButton("EDIT");

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

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Restaurant updatedRestaurant = new Restaurant();
              Restaurant.restaurants.set(index, updatedRestaurant);
                RestaurantGUI restGUI = new RestaurantGUI();

                dispose();
            }
        });
    }

}
