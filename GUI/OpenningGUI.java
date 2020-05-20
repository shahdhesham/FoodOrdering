/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Order.Menu;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author s
 */
public class OpenningGUI extends JFrame {
      public static JButton button1;
    public static  JButton button2;
    public OpenningGUI(){
        setTitle("Welcom");
        setLayout(null);
    setSize(500,500);
    JButton button1=new JButton("SIGN IN");
     JButton button2=new JButton("SIGN UP");
      button1.setBounds(100,150,100,30);
       button2.setBounds(250,150,100,30);
       add(button1);
       add(button2);
       setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttons b=new buttons();
        buttons2 b2=new buttons2();
       button1.addActionListener(b2);
       button2.addActionListener(b);
          
       
    }

   
 
    private  class buttons  implements ActionListener {
        public void actionPerformed(ActionEvent e) {
          
           RegistrationForm r=new RegistrationForm();
           r.setVisible(true);
       setVisible(false);
           
           
        
       dispose();
        }

    }
     private  class buttons2  implements ActionListener{
      public void actionPerformed(ActionEvent e) {
     
      LoginForm l=new LoginForm();
         l.setVisible(true);
         setVisible(false);
       
     dispose();
     }
      
     }
}
