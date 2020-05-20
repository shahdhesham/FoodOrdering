/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

/**
 *
 * @author home
 */
public class Issues
{
protected String orderIssues;
protected String PaymentIssues;
protected String otherIssues;

    public String getOrderIssues() {
        return orderIssues;
    }

    public void setOrderIssues(String orderIssues) {
        this.orderIssues = orderIssues;
    }

    public String getPaymentIssues() {
        return PaymentIssues;
    }

    public void setPaymentIssues(String PaymentIssues) {
        this.PaymentIssues = PaymentIssues;
    }

    public String getOtherIssues() {
        return otherIssues;
    }

    public void setOtherIssues (String otherIssues) {
        this.otherIssues = otherIssues;
    }

}
