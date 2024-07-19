package phonenumber;

import java.util.Random;
import javax.swing.JOptionPane;

public class PhoneNumber {
  public static void main (String[] args) {
    Random rand = new Random();
   
    int num1;
    int num2;
    int num3;

    num1 = rand.nextInt (072) + 100;
    num2 = rand.nextInt (643) + 100;
    num3 = rand.nextInt(567) +100;
    

    
    String result;
    String result2;
    String result3;
    
    
  result=JOptionPane.showInputDialog(null,"please enter the first  employee name ");
  result2=JOptionPane.showInputDialog(null,"please enter the second  employee name ");
  result3=JOptionPane.showInputDialog(null,"please enter the third employee name ");
  
  
  JOptionPane.showMessageDialog(null,"CELL PHONE NUMBER GENERATOR\n********************************************* \n"+result+" will be on vodacom with phone number:072-"+num3+"-"+num2+"\n"+result2+" will be on MTN with phone number:083-"+num1+"-"+num2+"\n"
  +result3+" will be on vodacom with phone number:084-"+num1+"-"+num3);
  
  
  
  
  
  
  }
  
  
}