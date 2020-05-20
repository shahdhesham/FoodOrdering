package Users;


import GUI.PaymentGUI;
import Order.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import otlob.Otlob;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s
 */
public class User extends Human implements Serializable{
    Review r;

    public User(String creditCard, String address, PaymentGUI payment) {
        this.creditCard = creditCard;
        this.address = address;
        this.payment = payment;
        
    }
    
   
String creditCard;
 protected String address;
 protected ArrayList<Order> o=new ArrayList<>();
  protected PaymentGUI payment;
  protected Bill bill;
  protected String UserName;

    public User() {
     
    }
 
 

  
 public String getFirstlName() {
        return firstName;
    }

  
    public int getId() {
        return id;
    }

   

    public String getPassword() {
        return password;
    }

   

    public String getEmail() {
        return Email;
    }

   

    public String getMonileNbr() {
        return monileNbr;
    }

   
   
 

    

    public boolean login(String s1,String s2) {
      for(int i=0;i<Otlob.usersHash.size();i++){
      if (Otlob.usersHash.get(s1).equals(s2))
          return true;
      
      }
         return false;
    }

  
    public void load() throws IOException, ClassNotFoundException {
    String path="D:\\MIU\\sophmore year\\fall 2018\\OOP\\project\\User.bin";
    String path2="D:\\MIU\\sophmore year\\fall 2018\\OOP\\project\\HashUser.bin";
    ObjectInputStream in;
    ObjectInputStream in2;
        try {
             in = new ObjectInputStream(new FileInputStream(path));
             in2=new ObjectInputStream(new FileInputStream(path2));
 Otlob.users = (ArrayList<User>)in.readObject();
 Otlob.usersHash =(HashMap<String,String>)in2.readObject();
 in.close();
 
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

            


}



public void save() throws FileNotFoundException, IOException{
      String path="D:\\MIU\\sophmore year\\fall 2018\\OOP\\project\\User.bin";
    String path2="D:\\MIU\\sophmore year\\fall 2018\\OOP\\project\\HashUser.bin";
   

ObjectOutputStream Bin=new ObjectOutputStream(new FileOutputStream(path));
ObjectOutputStream Bin2=new ObjectOutputStream(new FileOutputStream(path2));
Bin.writeObject(Otlob.users);
Bin2.writeObject(Otlob.usersHash);

    }
    public void selectorder(int i,Order or,Restaurant r){
        o.set(i, or);
}
   
          
     

    public void setPayment(PaymentGUI payment) {
        this.payment = payment;
    }

    public PaymentGUI getPayment() {
        return payment;
    }
      
          public Bill Getbill(){
              return bill;
          } 
   
  
    public void add(){
        Otlob.users.add(this);
        Otlob.usersHash.put(this.UserName,this.password);

}

    public void delete(int i) {
       Otlob.users.remove(i);
        
    }

    public void Update(int i) {
        
                   Otlob.users.set(i, this);
    }


   
public void setFirstName(String n){
if(n.equals(""))
return;
else
this.firstName=n;
}

public void setPassword(String n){
if(n.equals(""))
return;
else
this.password=n;
}
public void setMobilr(String n){
if(n.equals(""))
return;
else
this.monileNbr=n;
}
public void setadd(String n){
if(n.equals(""))
return;
else
this.address=n;
}
public void setid(int n){
if(n==0)
return;
else
this.id=n;
}
public void setCredit(String n){
if(n.equals(""))
return;
else
this.creditCard=n;
}

    public void setAddress(String address) {
        this.address = address;
    }

   
    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setMonileNbr(String monileNbr) {
        this.monileNbr = monileNbr;
    }

        }