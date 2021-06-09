/*
 *Elvis Princely Ndlangamandla
  Student No: 213063964
  Assignment 3 (adp2)
  Lecture: Mr Burger
 */
package za.ac.cput.assignment3project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class CustomerOutFile {
    
        
     
    


 public static void main(String[] args) {
        try{
        FileWriter fw = new FileWriter("testout.txt");  
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(String.format("%-15s\n","=============================================Customers================================================================"));
        bw.write(String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","ID","Name", "Surname","Qualification", "Date of Birth","Age","Condition"));  
        bw.write(String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "C100", "Mike", "Rohsopht", "Bellville", "27 Jan 1981", 975.0, true));
        bw.write(String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "C130", "Stu", "Padassol", "Sea Point", "18 May 1987", 645.25, true));
        bw.write(String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "C150", "Luke", "Atmyass", "Bellville", "27 Jan 1987", 520.50, false));
        bw.write(String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "C250", "Eileen", "Sideways", "Nyanga", "27 Nov 1999", 190.85, true));
        bw.write(String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "C260", "Ima", "Stewpidas", "Atlantis", "27 Jan 2001", 1890.70, true));
        bw.write(String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "C300", "Ivana.B", "Withew", "Langa", "16 Juy 1998", 1190.50, false));

        bw.close();  
        }
        catch (IOException e)
        {
        System.out.println(e.getMessage());
        }
    System.out.println("Great success");
       
        
       
}
}