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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class SupplierOutFile {

   
public static void main(String[] args) {
       
        try{
        FileWriter fw = new FileWriter("supplierOutFile.txt");  
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(String.format("%-15s\n","=============================================Suppliers================================================================"));
        bw.write(String.format("%-15s%-15s%-15s%-15s\n","ID","Name", "Product Type","Description"));  
        bw.write(String.format("%-15s%-15s%-15s%-15s\n", "S270", "Grand Theft Auto", "Toyota", "Mid-size sedan"));
        bw.write(String.format("%-15s%-15s%-15s%-15s\n", "S400", "Prime Motors", "Lexus", "Luxury sedan"));
        bw.write(String.format("%-15s%-15s%-15s%-15s\n", "S300", "We got Cars", "Toyota", "10-seater minibus"));
        bw.write(String.format("%-15s%-15s%-15s%-15s\n", "S350", "Auto Delight", "BMW", "Luxury SUV"));
        bw.write(String.format("%-15s%-15s%-15s%-15s\n", "S290", "MotorMania", "Hyundai", "compact budget"));

        bw.close();  
        }
        catch (IOException e)
        {
        System.out.println(e.getMessage());
        }
        System.out.println("Great success");
 
    
    
       }
       }
