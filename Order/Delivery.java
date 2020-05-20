/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import Order.DateTime;

/**
 *
 * @author s
 */
public class Delivery {
    protected long DeliveryId;
    protected boolean orderDelivered=true;
   protected String DeliveryBoy;
public DateTime date;

public boolean Delivered(){
    if(orderDelivered)
        return true;
    else
        return false;

}

    public long getDeliveryId() {
        return DeliveryId;
    }

    public void setDeliveryId(long DeliveryId) {
        this.DeliveryId = DeliveryId;
    }

    public String getDeliveryBoy() {
        return DeliveryBoy;
    }

    public void setDeliveryBoy(String DeliveryBoy) {
        this.DeliveryBoy = DeliveryBoy;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public boolean isOrderDelivered() {
        return orderDelivered;
    }

    public void setOrderDelivered(boolean orderDelivered) {
        this.orderDelivered = orderDelivered;
    }

    
}
