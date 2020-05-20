/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

/**
 *
 * @author HP
 */
public class Order {

    protected String OrderNbr;
    protected String Customer;

   
    protected String Cashier;
    protected Restaurant Resturant;
    protected int size = 0;

    protected float price;
 public void setSize(int size) {
      //  this.size = size + 1;
    }
    public String getOrderNbr() {
        return OrderNbr;
    }

    public void setOrderNbr(String OrderNbr) {
        this.OrderNbr = OrderNbr;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String Customer) {
        this.Customer = Customer;
    }

    public String getCashier() {
        return Cashier;
    }

    public void setCashier(String Cashier) {
        this.Cashier = Cashier;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Restaurant getResturant() {
        return Resturant;
    }

    public void setResturant(Restaurant Resturant) {
        this.Resturant = Resturant;
    }

}
