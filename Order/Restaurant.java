package Order;

import Interfaces.IChange;
import Interfaces.IFile;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import otlob.Otlob;

/**
 *
 * @author HP
 */
public class Restaurant implements IFile,
        Serializable {

    public static ArrayList<Restaurant>restaurants= new ArrayList();

    //protected ArrayList<String> id = new ArrayList<String>();
    protected int Nofrestaurant; // no. of rest.      

    //protected ArrayList<String> Name = new ArrayList<String>();
//    protected Menu menu = new Menu();
    //public static ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>(1000);
    public String Name;
    protected int Id;
    public int mysize;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
//public void showmenu(){
//
//
//}
    public void save() {

        ObjectOutputStream Bin;
        try {
            Bin = new ObjectOutputStream(new FileOutputStream("D:\\MIU\\sophmore year\\fall 2018\\OOP\\project\\Restaurant.bin",true));
            Bin.writeObject(Restaurant.restaurants);
          //  Bin.close();
        } catch (IOException ex) {
            Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void load() {
        try {
            ObjectInputStream Inp = new ObjectInputStream(new FileInputStream("D:\\MIU\\sophmore year\\fall 2018\\OOP\\project\\Restaurant.bin"));
            Restaurant.restaurants = (ArrayList<Restaurant>) Inp.readObject();
           // Inp.close();

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Restaurant.class
                    .getName()).log(Level.SEVERE, null, ex);

        }

    }

    public String getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
