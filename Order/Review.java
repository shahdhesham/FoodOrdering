/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

/**
 *
 * @author s
 */
public class Review {
    int rating;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if(rating==5||rating==4||rating==3||rating==2||rating==1)
        this.rating = rating;
        else return;
    }
    
    
    public void addReview(String st){
    
    }
    
}
