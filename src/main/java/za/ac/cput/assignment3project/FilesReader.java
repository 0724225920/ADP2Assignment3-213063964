/*
 *Elvis Princely Ndlangamandla
  Student No: 213063964
  Assignment 3 (adp2)
  Lecture: Mr Burger
 */
package za.ac.cput.assignment3project;

import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;


public class FilesReader {
    //Reading files from Customer and Supplier classes
    ObjectInputStream output;
    ArrayList<Customer> custArray = new ArrayList<Customer>();
    ArrayList<Supplier> supArray = new ArrayList<Supplier>();
    PrintWriter writerObject;

public void openFile()
    {
try{
output = new ObjectInputStream(new FileInputStream("stakeholder.ser"));
}catch(IOException ioException){
System.out.println("Fails to open the ser file: " + ioException.getMessage());
        }
        }

public void readFile() {
for(int o = 0; o < 11; ++o)
{
        try{
        Object object = output.readObject();
        if (object.getClass().equals(Customer.class)){
        custArray.add((Customer) object);
}
        else {
supArray.add((Supplier) object);
}
}
        catch (IOException t)
{
        System.out.println("Fails to read from file: " + t.getMessage());
}
        catch(ClassNotFoundException e)
{
        System.out.println("An Error Occurred: " + e.getMessage());
}
}
     
sort();
    System.out.println("============================================ CUSTOMERS =================================================");
    System.out.println("ID              NAME            SURNAME           PLACE         DATE OF BIRTH   CREDIT        CODITIONS");
    System.out.println("========================================================================================================");
    System.out.println(" ");

    for (Customer customer : custArray) {
           
    System.out.println(customer);
    System.out.println("");
       }
    System.out.println("===================================== END LIST OF CUSTOMERS =============================================");
    System.out.println("");
    System.out.println("=======================================SUPPLIERS=========================================================");
    System.out.println("ID        COMPANY NAME          CAR TYPE       CAR DESCRIPTION");
    System.out.println("=========================================================================================================");
    System.out.println("");
    
    for (Supplier supplier : supArray) {
    System.out.println(supplier);
    System.out.println("");
        }
    System.out.println("===================================== END OF SUPPLIERS ==================================================");
    System.out.println("");
    System.out.println("Below is a list of customers sorted date of birth and their ages calculated correclty");
    System.out.println("Customer " + custArray.get(0).getFirstName() + "'s age is: " + getCustomerAge(custArray.get(0)));
    System.out.println("Customer " + custArray.get(0).getFirstName() + "'s Date of birth: " + formatDOB(custArray.get(0)));
         
    System.out.println("Customer " + custArray.get(1).getFirstName() + "'s age is: " + getCustomerAge(custArray.get(1)));
    System.out.println("Customer " + custArray.get(1).getFirstName() + "'s Date of birth: " + formatDOB(custArray.get(1)));
          
    System.out.println("Customer " + custArray.get(2).getFirstName() + "'s age is: " + getCustomerAge(custArray.get(2)));
    System.out.println("Customer " + custArray.get(2).getFirstName() + "'s Date of birth: " + formatDOB(custArray.get(2)));
          
    System.out.println("Customer " + custArray.get(3).getFirstName() + "'s age is: " + getCustomerAge(custArray.get(3)));
    System.out.println("Customer " + custArray.get(3).getFirstName() + "'s Date of birth: " + formatDOB(custArray.get(3)));
          
    System.out.println("Customer " + custArray.get(4).getFirstName() + "'s age is: " + getCustomerAge(custArray.get(4)));
    System.out.println("Customer " + custArray.get(4).getFirstName() + "'s Date of birth: " + formatDOB(custArray.get(4)));
           
    System.out.println("Customer " + custArray.get(5).getFirstName() + "'s age is: " + getCustomerAge(custArray.get(5)));
    System.out.println("Customer " + custArray.get(5).getFirstName() + "'s Date of birth: " + formatDOB(custArray.get(5)));
    System.out.println("");
        
    }

    public void sort()
    {
    Customer tempCust;
    Customer[] customers = new Customer[custArray.size()];
    for (int p = 0; p < custArray.size(); p++)
    {
    customers[p] = custArray.get(p);
    }
    for (int i = 0; i < customers.length - 1; i++)
    {
    for (int e = i + 1; e < customers.length; e++)
    {
    if (customers[i].getStHolderId().compareTo(customers[e].getStHolderId()) > 0)
    { 
    tempCust = customers[i];
    customers[i] = customers[e];
    customers[e] = tempCust;
    }
    }
    }
    custArray.clear();
    custArray.addAll(Arrays.asList(customers));
    }

    public int getCustomerAge (Customer customer)
    {
    LocalDate dateOfBirth = LocalDate.parse(customer.getDateOfBirth());
    LocalDate currDate = LocalDate.now();
    int custAge = Period.between(dateOfBirth, currDate).getYears();
    return custAge;

    }

    public String formatDOB(Customer customer){
    LocalDate localDate = LocalDate.parse(customer.getDateOfBirth());
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
    String stringDate = localDate.format(formatter);
    return stringDate;
    }

    public void closeFile()
    {
    try{
    output.close();
    }catch(IOException ioException){
    System.out.println("Fails to close the file: " + ioException.getMessage());
    }
    }
    
    public void FileWrite()
    {
    try{
    writerObject = new PrintWriter( new FileOutputStream("customerOutFile.txt"));
    }
    catch (FileNotFoundException e){
    System.out.println("Failes to write to the file: " + e.getMessage());
    }
    }
    
    public void writeCustToThisFile()
    {
    int canRent = 0;
    int cannotRent = 0;
        
       
    for(int i = 0; i < custArray.size(); ++i)
    {
    writerObject.print(
    custArray.get(i).getStHolderId() +
    custArray.get(i).getFirstName()  +
    custArray.get(i).getSurName() +
    formatDOB(custArray.get(i))+
    getCustomerAge(custArray.get(i)));          
                
                        
    if (custArray.get(i).getCanRent()){
    canRent  = canRent + 1;
    }
    else {
           cannotRent = cannotRent + 1; 
    }
                
    }
        System.out.println("Customers who can rent and who cannot rent");
        System.out.println("Number of Custmers that can rent is: " + canRent);
        System.out.println("Number of Customers that cannot rent is " + cannotRent);
        
    }
    
    public void closeWriter(){
        
    writerObject.close();
}
    
}

    

