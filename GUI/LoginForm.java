package GUI;

import Users.Admin;
import Users.User;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import otlob.Otlob;

public class LoginForm extends JFrame {

    JLabel usernameLabel;
    JTextField usernameField;
    JLabel usernameRequired;
 
    JLabel passwordLabel;
    JTextField IDField;
    //todo: Define the password text field as a password field not a normal text field 
    JPasswordField Password ;
    
    JLabel passwordfRequired;

    JButton login;
    JComboBox c;

    public LoginForm() {
IDField=new JTextField("ID");
IDField.setBounds(200,300 , 300, 30);

      c= new JComboBox(new String[]{"user", "admin"});
        usernameLabel = new JLabel("Username");
        usernameField = new JTextField();
        usernameRequired = new JLabel("*Username is required");

        passwordLabel = new JLabel("Password");
        /* todo : Initialize the password field and put the character to "*" */
        Password=new JPasswordField("Password");
        
        passwordfRequired = new JLabel("*Password is required");
        
        login = new JButton("Login");
      
        setLayout(null);
        usernameLabel.setBounds(50, 150, 300, 30);//the text field is placed with change in x but with the same y
        usernameField.setBounds(200, 150, 300, 30);//(x,y,width,height)
        usernameRequired.setBounds(200, 180, 300, 30);
        usernameRequired.setForeground(Color.red);
        usernameRequired.setOpaque(true);

      /*todo : Set bounds of the password label and password field and the password label*/
        usernameLabel.setBounds(50, 150, 300, 30);
        add(usernameLabel);
        usernameField.setBounds(200, 150, 300, 30);
        add(usernameField);
        passwordLabel.setBounds(50, 200, 300, 30);
        add(passwordLabel);
        Password.setBounds(200, 200, 300, 30);
        add(Password);
        Password.setEchoChar('*');
        login.setBounds(250, 350, 100, 30);
        add(login);
c.setBounds(200, 250, 300, 30);
add(c);
add(IDField);
      /*todo : Add the components to the layout*/

        setSize(600, 700);
        setVisible(true);
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


         Button b=new Button();
 login.addActionListener(b); 
    setVisible(true);
    }
    private class Button implements ActionListener{
        
        public void actionPerformed(ActionEvent e) {
            boolean x2=false;
            boolean x=false;
            if(c.getSelectedItem()=="user"){
            User u1=new User();
                try {
                    u1.load();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
             x= u1.login(usernameField.getText(), Password.getText());
            if(x==true){
         
             u1=Otlob.users.get( Integer.parseInt(IDField.getText()));
             JOptionPane.showMessageDialog(null, "You are logged in as client");
                 dispose();
                RestaurantGUIuser gUIuser = new RestaurantGUIuser();
                gUIuser.setVisible(true);
                setVisible(false);
         
            
            }
              else if(x==false){
                JOptionPane.showMessageDialog(null, "wrong intry try again");
                 dispose();
                
              
            }
            }
            if(c.getSelectedItem()=="admin"){
            Admin u2=new Admin() {};
             try {
                    u2.load();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
           for(int i=0;i<Otlob.admins.size();i++)
            if(IDField.getText().equals(0)){
             u2=Otlob.admins.get( Integer.parseInt(IDField.getText()));
             JOptionPane.showMessageDialog(null, "You are logged in as admin");
                 dispose();
                 RestaurantGUI gUI = new RestaurantGUI();
                 gUI.setVisible(true);
                 setVisible(false);
            }
              else if(x2==false){
                JOptionPane.showMessageDialog(null, "wrong intry try again");
                
                
            }
            }
          
           
      
        }

    }
    }
