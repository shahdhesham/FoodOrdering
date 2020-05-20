/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Dell
 */
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author home
 */
public class PayVisaGUI extends JFrame implements ActionListener {
    
    private JFrame PayVisaWindow;
    private JTextField CreditCard;
    private JTextField BankName;
    private JDialog Dialog;
    public PayVisaGUI()
    {
    PayVisaWindow = new JFrame("PayVisa Form");
    PayVisaWindow.setBounds(300, 300, 700, 700);
    PayVisaWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    PayVisaWindow.getContentPane().setLayout(null);
    JButton Pay = new JButton("Pay");
    Pay.setBounds(111,307,117,29);
    Pay.addActionListener(this);
    PayVisaWindow.add(Pay);
    JLabel BankNlbl=new JLabel("Enter your Bank Name");
    BankNlbl.setBounds(100,107,130,70);
    PayVisaWindow.add(BankNlbl);
    BankName = new JTextField();
    BankName.setText(null);
    BankName.setBounds(294, 107, 130, 26);
    BankName.addActionListener(this);
    PayVisaWindow.add(BankName);
    CreditCard  = new JTextField();
    JLabel Creditlbl=new JLabel("Enter Credit Card Number");
    Creditlbl.setBounds(100,207,130,70);
    CreditCard.setText(null);
    CreditCard.setBounds(294, 207, 130, 29);
    CreditCard.addActionListener(this);
    PayVisaWindow.add(Creditlbl);
    PayVisaWindow.getContentPane().add(CreditCard);
    setVisible(true);
    
    }
    @Override
        public void setVisible(boolean visible) {
        if (PayVisaWindow != null) {
        	PayVisaWindow.setVisible(visible);
        }
}

    @Override
    public void actionPerformed(ActionEvent e) {
              if(!CreditCard.getText().isEmpty() && !BankName.getText().isEmpty())
        {
          if(CreditCard.getText().length()==14)
          {
        JOptionPane.showMessageDialog(Dialog,"Paid Successfully" );
        }
          else
          JOptionPane.showMessageDialog(Dialog,"Invalid Credit Card Number " );    
        }
      else if(CreditCard.getText().isEmpty()&& BankName.getText().isEmpty())
        {
        
        JOptionPane.showMessageDialog(Dialog,"You must enter your Credit Card number and Bank name" );
        }
        else if(CreditCard.getText().isEmpty())
        {
        JOptionPane.showMessageDialog(Dialog,"You must enter your Credit Card number " );
        }

        else
        {
        JOptionPane.showMessageDialog(Dialog,"You must enter your Bank name " );
        }
        
    }
    }