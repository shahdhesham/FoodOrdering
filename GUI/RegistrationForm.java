package GUI;

import GUI.LoginForm;
import GUI.OpenningGUI;
import Exceptions.Verification;
import Users.User;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import otlob.Otlob;

/**
 *
 * @author mennatallah.sayed
 */
public class RegistrationForm extends JFrame {

    JLabel firstNameLabel;
    JTextField firstName;

    JLabel lastNameLabel;
    JTextField lastName;

    JLabel usernameLabel;
    JTextField username;

    JLabel passwordLabel;
    JTextField password;

    JLabel emailLabel;
    JTextField email;

    JLabel phoneNumberLabel;
    JTextField phoneNumber;
JLabel AdressLabel;
    JTextField Adress;
 

   
    JButton submit;
    

    

  public RegistrationForm(){
        setLayout(null);
       
        setSize(700,700);
        setTitle("Registration Form");
       
       
       firstName =new JTextField();
        firstName.setBounds(200,50,300,30);
        firstNameLabel=new JLabel("First Name");
       firstNameLabel.setBounds(50,50,300,30);
       
        
    lastNameLabel=new JLabel("Last Name");
      lastNameLabel.setBounds(50,100,300,30);
      lastName=new JTextField();
      lastName.setBounds(200,100,300,30);
      
      
      usernameLabel=new JLabel("User Name");
      username=new JTextField();
       username.setBounds(200,150,300,30);
       usernameLabel.setBounds(50,150,300,30);
       
         passwordLabel=new JLabel("password");
        passwordLabel.setBounds(50,200,300,30);
         password=new JTextField();
         password.setBounds(200,200,300,30);
          
         
          emailLabel=new JLabel("email");
         emailLabel.setBounds(50,250,300,30);
         email=new JTextField();
          email.setBounds(200,250,300,30);
          
          
          phoneNumberLabel=new JLabel("phone number");
          phoneNumberLabel.setBounds(50,300,300,30);
          phoneNumber=new JTextField();
           phoneNumber.setBounds(200,300,300,30);
           
      AdressLabel=new JLabel("Adress");
      Adress=new JTextField();
      Adress.setBounds(200,350,300,30);
       AdressLabel.setBounds(50,350,300,30);
               setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
              submit=new JButton("submit");
              submit.setBounds(400,550,100,30);
              add(firstNameLabel);
               add(lastNameLabel);
                add(usernameLabel);
                 add(passwordLabel);
                  add(emailLabel);
                   add(phoneNumberLabel);
                     add(firstName);
                     add(lastName);
                     add(username);
                     add(password);
                     add(email);
                     add(phoneNumber);
                     add(submit);
                     add(Adress);
                     add(AdressLabel);
                     Button b1=new Button();
                     submit.addActionListener(b1);
                      setVisible(true);
  }
                      private class Button  implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Verification v1=new Verification();
            if(v1.number2(phoneNumber.getText())==true&&v1.text(firstName.getText())==true&&v1.text(lastName.getText())==true&&v1.text(username.getText())==true&&v1.email(email.getText())==true&&v1.text(password.getText())==true&&Adress.getText().isEmpty()==false){
         User u=new User();
                try {
                    u.load();
                } catch (IOException ex) {
                    Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
                }
        u.setAddress(Adress.getText());
        u.setFirstName(firstName.getText());
        u.setLastName(lastName.getText());
        u.setAddress(Adress.getText());
        u.setAddress(email.getText());
        u.setMonileNbr(phoneNumber.getText());
          Otlob.usersHash.put(username.getText(),password.getText());
        u.setid( Otlob.users.indexOf(u));
          Otlob.users.add(u);
                try {
                    u.save();
                } catch (IOException ex) {
                    Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Your Id is"+ Otlob.users.indexOf(u));
                 
                LoginForm l=new LoginForm();
                l.setVisible(true);
              dispose();
               
            
            }
            else
                   JOptionPane.showMessageDialog(null, "wrong intry try again");
                
                dispose();
                OpenningGUI o=new OpenningGUI();
                
               
        }
                      
                      }
}               

