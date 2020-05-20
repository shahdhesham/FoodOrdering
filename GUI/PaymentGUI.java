/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class PaymentGUI extends JFrame implements ActionListener{
    
        private final JFrame PaymentWindow;
        
       public PaymentGUI() {
          PaymentWindow = new JFrame("Payment Form");
          PaymentWindow.setBounds(300, 300, 700, 700);
          PaymentWindow.setLayout(null);
          PaymentWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
          JLabel Paylbl=new JLabel("Choose Payment Method");
          Paylbl.setBounds(100,107,130,70);
          PaymentWindow.add(Paylbl);
          JButton PAYCash=new JButton("Pay Cash");  
          PAYCash.setBounds(200,100,75,20);
          PaymentWindow.add(PAYCash);
          PAYCash.addActionListener(this);
          JButton PAYVisa=new JButton("Pay Visa");  
          PAYVisa.setBounds(300,100,75,20);
          PaymentWindow.add(PAYVisa);
          PAYVisa.addActionListener(this);
         PaymentWindow.setVisible(true);
       }
  

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand().equals("PayVisa"))
       {
        PayVisaGUI payvisa=new PayVisaGUI();
       payvisa.setVisible(true);
       }
           
       else {
       
       PayCashGUI paycash=new PayCashGUI();
       paycash.setVisible(true);
       }
           
    }
}
