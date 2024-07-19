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
import java. util.Scanner;
public class CustomerPurchase {
   private float customerNumber;
    private String firstName;
    private String surname;
    private String product;
    private Double productPrice;
    private int quantity;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        String sur;
        String name;
        String product;
        int quantity;
        float number;
        
        
        CustomerPurchase myCustomerPurchase  = new CustomerPurchase  ();
         Printing myPrinting = new  Printing();
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Please enter customer name>>");       
        name =myScanner.nextLine();
        myCustomerPurchase.setFirstName(name);
        myPrinting.toString();
        
       
        
       System.out.println("Please enter product>> ");
        product = myScanner.nextLine();
        myCustomerPurchase.getProduct();
        myPrinting.toString();
        
         System.out.println("Please enter customer surname>>");
        sur = myScanner .nextLine();
        myCustomerPurchase .getSurname();
        
         System.out.println("Please enter customer number>>");
        number = myScanner .nextFloat();
        myCustomerPurchase .getCustomerNumber();
        
                 System.out.println("Please enter quantity>>");
        quantity = myScanner.nextInt();
        myCustomerPurchase.getQuantity();
        
           System.out.println("Please enter product price>>");
        num =myScanner.nextInt();
        myCustomerPurchase.setCustomerNumber(num);
       myPrinting .CustomerPurchaseReport(num);
              
        
     
    }

    /**
     * @return the customerNumber
     */
    
    public float getCustomerNumber() {
        return customerNumber;
    }

    /**
     * @param customerNumber the customerNumber to set
     */
    
   
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the productPrice
     */
    public Double getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice the productPrice to set
     */
    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}