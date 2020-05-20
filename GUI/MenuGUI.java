/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Dell
 */
public class MenuGUI extends JFrame{
    
  private JButton Add,Remove,Show,edit; 
  {
        
         Add = new JButton("add food");
         Remove = new JButton("remove food");
         Show= new JButton("show");
        edit= new JButton("edit");
       
           setSize(400, 400);
         setTitle("Menu");   
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        add(Add);
        add(Remove);
         add(edit);
        add(Show);
       
        
        Abutton a = new Abutton();
        Rbutton r = new Rbutton();
        Ebutton e = new Ebutton();
        Sbutton s = new Sbutton();
        
        Add.addActionListener(a);
        Remove.addActionListener(r);
        edit.addActionListener(e);
        Show.addActionListener(s);
    }
    class Abutton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            AddFoodGUI food = new AddFoodGUI();
            food.setVisible(true);
            setVisible(false);

        }
    }
   class Rbutton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e)
        {
       RemoveFoodGUI removeFoodGUI = new RemoveFoodGUI();
       removeFoodGUI.setVisible(true);
            setVisible(false);
        }
    }
     class Ebutton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            EditFoodGUI editFoodGUI = new EditFoodGUI();
            editFoodGUI.setVisible(true);
            setVisible(false);
        }
    }
     class Sbutton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
ShowFoodGUI foodGUI = new ShowFoodGUI();
foodGUI.setVisible(true);
            setVisible(false);
        }
    }
}
