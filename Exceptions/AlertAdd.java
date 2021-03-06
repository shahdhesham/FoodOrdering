/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import GUI.AddFoodGUI;

/**
 *
 * @author Dell
 */
public class AlertAdd extends JFrame{
    
    private JLabel message =  new JLabel("Invalid Retry");
    private JButton ok = new JButton("Retry");
    private JButton exit =  new JButton("Exit");
    
    public AlertAdd() 
    {
    setTitle("Alert");
    setSize(400, 200);
    setLayout(null);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
   message.setBounds(150, 0, 100, 100);
   ok.setBounds(20, 100, 100, 30);
   exit.setBounds(250, 100, 100, 30);

        add(message);
        add(ok);
        add(exit);
        
        exit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    });
        ok.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            AddFoodGUI food = new AddFoodGUI();
            food.setVisible(true);
            setVisible(false);
        }
    });
    }
    
    
}
