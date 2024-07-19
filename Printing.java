/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerpurchase;

/**
 *
 * @author 21273747
 */
//Get all the details from CustomerPurchase
public class Printing {
    public void PrintDetails(int customerNumber,String firstName,String surname,String product,Double productPrice,int quantity){
        
        
        System.out.println("CUSTOMER INVOICE");
        System.out.println("*************************");
        System.out.println("CUSTOMER NUMBER:"+customerNumber);
        System.out.println("CUSTOMER FIRST NAME:"+firstName);
        System.out.println("CUSTOMER SURNAME:"+surname);
        System.out.println("PRODUCT PRICE:"+ productPrice);
        System.out.println("PRODUCT QUANTITY:"+quantity);
        System.out.println("**************************");
    }
 public void CustomerPurchaseReport(double productPrice){
     double tax = productPrice *0.15;
     double commission =productPrice * 0.085;
     double discount = productPrice *0.10;
     double total = (productPrice + tax)-(discount+commission);
     
     System.out.println("CUSTOMER PURCHASE REPORT");
     System.out.println("*******************************");
     System.out.println("PRODUCT PRICE:"+productPrice);
     System.out.println("TAX:"+tax);
     System.out.println("COMMISION:"+commission);
     System.out.println("DISCOUNT:"+discount);
     System.out.println("TOTAL:"+total);
     System.out.println("****************************");
     System.out.println("Application Complete");
     
 }   
}
