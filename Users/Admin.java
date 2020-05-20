package Users;


import Order.Order;
import Order.Restaurant;
import com.sun.org.apache.xml.internal.security.encryption.Serializer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import otlob.Otlob;
//import pay.Cupon;

/**
 *
 * @author s
 */
public  class Admin extends Human implements Serializable{

    
    
    Restaurant restaurant;
    
    
    String Username;
    public void setDIscount(float x){
       x=(float) (x*0.2);
    
    } 

    public void RecieveOrder(Order[]o){
    
    }
    
    
    
  

  
  
        
        public Admin(){
        this.Username="admin";
        this.password="admin";
        this.id=0;
        }
   public boolean login(String s1,String s2) {
      for(int i=0;i<Otlob.adminsHash.size();i++){
      if (Otlob.adminsHash.get(s1).equals(s2))
          return true;
      
      }
         return false;
    }

    public void logout() {
       System.exit(0);
    }
     
     public void add(){
        Otlob.admins.add(this);
        Otlob.adminsHash.put(this.Username,this.password);

}
    public void delete(){
    Otlob.admins.remove(this);
    }
    public void Update(int i) {
        
                   Otlob.admins.set(i, this);
    }
    public void save() throws FileNotFoundException, IOException{
String path="D:\\MIU\\sophmore year\\fall 2018\\OOP\\Admins.bin";
String path2="D:\\MIU\\sophmore year\\fall 2018\\OOP\\AdminsHash.bin";
ObjectOutputStream Bin=new ObjectOutputStream(new FileOutputStream(path));
ObjectOutputStream Bin2=new ObjectOutputStream(new FileOutputStream(path2));
Bin.writeObject(Otlob.admins);
Bin2.writeObject(Otlob.adminsHash);

    }

    public void load() throws IOException, ClassNotFoundException {
    String path="D:\\MIU\\sophmore year\\fall 2018\\OOP\\Admins.bin";
    String path2="D:\\MIU\\sophmore year\\fall 2018\\OOP\\AdminsHash.bin";
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(path));
            Otlob.admins = (ArrayList<Admin>)in.readObject();
             ObjectInputStream in2 = new ObjectInputStream(new FileInputStream(path2));
            Otlob.adminsHash = (HashMap<String,String>)in2.readObject();

        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
  in.close();
       
            


}

   
   public void setFirstName(String n){
if(n.equals(null))
return;
else
this.firstName=n;
}
 public String getFullName() {
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

public void setpassword(String n){
if(n.equals(null))
return;
else
this.password=n;
}
public void setMobilr(String n){
if(n.equals(null))
return;
else
this.monileNbr=n;
}

public void setid(int n){
if(n==0)
return;
else
this.id=n;
}

   
    
}

