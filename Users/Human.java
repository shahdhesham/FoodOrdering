package Users;

import GUI.OpenningGUI;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s
 */
public class Human extends JFrame {
   protected String firstName;
      protected String lastName;
    protected int id;
  protected String password;
    protected String Email;
    protected String monileNbr;
    
    public Human(){
        OpenningGUI o=new OpenningGUI();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMonileNbr() {
        return monileNbr;
    }

    public void setMonileNbr(String monileNbr) {
        this.monileNbr = monileNbr;
    }
          
    
}
