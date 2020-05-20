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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author home
 */
public class PayCashGUI extends JFrame implements ActionListener{
    private JFrame PayCashWindow;
    private JTextField CuponNbr;
    private JTextField AmountM;
    private JDialog Dialog;
    public PayCashGUI()
    {
    PayCashWindow = new JFrame("PayCash Form");
    PayCashWindow.setBounds(300, 300, 700, 700);
    PayCashWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    PayCashWindow.getContentPane().setLayout(null);
    JButton Pay = new JButton("Pay");
    Pay.setBounds(111,307,117,29);
    Pay.addActionListener(this);
    PayCashWindow.add(Pay);
    JLabel Amountlbl=new JLabel("Amount of Money is");
    Amountlbl.setBounds(100,107,130,70);
    PayCashWindow.add(Amountlbl);
    AmountM = new JTextField();
    AmountM.setText(null);
    AmountM.setBounds(294, 107, 130, 26);
    AmountM.addActionListener(this);
    AmountM.setEditable(false);
    PayCashWindow.add(AmountM);
    CuponNbr  = new JTextField();
    JLabel CuponNbrlbl=new JLabel("Enter a cupon ");
    CuponNbrlbl.setBounds(100,207,130,70);
    CuponNbr.setText(null);
    CuponNbr.setBounds(294, 207, 130, 29);
    CuponNbr.addActionListener(this);
    PayCashWindow.add(CuponNbrlbl);
    PayCashWindow.add(CuponNbr);
    setVisible(true);
    }
        public void setVisible(boolean visible) {
        if (PayCashWindow != null) {
        	PayCashWindow.setVisible(visible);
        }
}

    public void actionPerformed(ActionEvent e) {
         if(!CuponNbr.getText().isEmpty())
          {
          //feh cupon yb2a al to do is to get the amount of money then * by the cupon amount ali hoa kan 20% i think 
          JOptionPane.showMessageDialog(Dialog,"Your amount after discount" );
          //show the new amount
          }
          else
          JOptionPane.showMessageDialog(Dialog,"Your amount of money is " );  
           AmountM.setVisible(true);
        }
      
    }
