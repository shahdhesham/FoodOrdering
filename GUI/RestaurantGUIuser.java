package GUI;

import Order.Restaurant;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListModel;

/**
 *
 * @author HP
 */
public class RestaurantGUIuser extends JFrame{
      int y=50;
    Restaurant rr = new Restaurant();
    public RestaurantGUIuser()  {
          setTitle("Restaurants");
        setSize(650, 700);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton s ;
        s = new JButton("select");
       // add(new JScrollPane(restaurantlist));
        
       // restaurantlist.setVisible(true);
//        for(Restaurant r: rr.restaurants){
//        JCheckBox j =new JCheckBox(r.getId()+" "+r.Name);
//        j.setBackground(Color.white);
//        j.setBounds(100, y, 200, 30);
//        JButton s= new JButton("select");
//        s.setBounds(300,500,300,100);
//        y+=50;
//         add(j);
//         add(s);
        s.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                MenuGUI M = new MenuGUI();
//                dispose();
//                MenuGUI gUI = new MenuGUI();
//                gUI.setVisible(true);
//                setVisible(false);
                SelectRestaurant restaurant = new SelectRestaurant();
                restaurant.setVisible(true);
            }});
    }
        public  class SelectRestaurant extends JFrame
  {
       public SelectRestaurant(){
           setTitle("show  appetizers");
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       int y=50;
       for(Restaurant A: rr.restaurants){
        JCheckBox j =new JCheckBox(A.getId()+" "+A.getName()+" ");
        j.setBackground(Color.white);
        j.setBounds(100, y, 200, 30);
        y+=50;
        add(j);
        
        }
  }
        
    
        
//    private class action implements ActionListener{
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//           Restaurant R = new Restaurant();
//          
//            //restaurantlist.getSelectedValue();
//        }
//    }
      }
}
            
           
           
    