/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursereport;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author20122304Craig   
 */
public class CourseReport {

    public static int Assign_Venue(){
    Random random = new Random();
    int x = random.nextInt(3) + 1;
    return x;
    
}
    /**
     * @param args the command line arguments
     */
    
    private String courseName;
    private int studentNumber;
    private String Lecturer;
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        String courseCode;
        String courseCode1 ="DISD";
        String courseCode2 ="DIWD";
        String courseCode3 ="DIDM";
        
        courseCode=JOptionPane.showInputDialog("Select from the folwing to view the course details:" +
        "\n1)" + courseCode1 +
        "\n2)" + courseCode2 +
        "\n3)" + courseCode3);
      
       int i = Integer.parseInt(courseCode);
       switch(i){
           case 1:
       System.out.println("COUTSE REPORT");
       System.out.println("****************************");
       System.out.println("COURSE:  Diploma in Data Matrics");
       System.out.println("STUDENT NUMBER: 35");
       System.out.println("LECTURER:  Mr Ntsinga");
       System.out.println("VENUE:Venue "+ Assign_Venue()+"\n");
       System.out.println("*****************************");
       break;
        
           case 2:
       System.out.println("COUTSE REPORT");
       System.out.println("****************************");
       System.out.println("COURSE:  Diploma in Web Development");
       System.out.println("STUDENT NUMBER: 28");
       System.out.println("LECTURER:  Mr Jones");
       System.out.println("VENUE:Venue "+ Assign_Venue()+"\n");
       System.out.println("*****************************");
       break; 
       
           case 3:
       System.out.println("COUTSE REPORT");
       System.out.println("****************************");
       System.out.println("COURSE:  Diploma in Software Develpment");
       System.out.println("STUDENT NUMBER: 39");
       System.out.println("LECTURER:  Mr Smith");
       System.out.println("VENUE:Venue "+ Assign_Venue()+"\n");
       System.out.println("*****************************");
       break;
       
              
         
       } else {
               
        System.out.println("Enter a value from 1 to 3 ");
               }
       String userinput2 = JOptionPane.showInputDialog(null, "Would you like to exit the application? Enter(y)to use exit or any another key to continue.");
       
       if( userinput2.equals("y")){
           System.out.println("Application complete");
           
           break;
           
       }       
       
         
    
   

    
}

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return the studentNumber
     */
    public int getStudentNumber() {
        return studentNumber;
    }

    /**
     * @param studentNumber the studentNumber to set
     */
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    /**
     * @return the Lecturer
     */
    public String getLecturer() {
        return Lecturer;
    }

    /**
     * @param Lecturer the Lecturer to set
     */
    public void setLecturer(String Lecturer) {
        this.Lecturer = Lecturer;
    }
    
    
        
    
}
