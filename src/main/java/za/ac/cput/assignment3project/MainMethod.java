/*
 *Elvis Princely Ndlangamandla
  Student No: 213063964
  Assignment 3 (adp2)
  Lecture: Mr Burger
 */
package za.ac.cput.assignment3project;


public class MainMethod {

   
public static void main(String[] args) {
       
FilesReader bn = new FilesReader();
        //My main method and displaying all the details of my classes
        bn.openFile();
        bn.readFile();
        bn.sort();
        bn.closeFile();
        bn.FileWrite();
        bn.writeCustToThisFile();
        bn.closeWriter();
        
}
    
}
