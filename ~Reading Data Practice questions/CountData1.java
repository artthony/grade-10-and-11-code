//anthony

import java.util.*; //importing packages
import java.io.*;

public class CountData1{
  public static void main( String[] args ) throws Exception{
    Scanner in = new Scanner(new File("DATACountData1.txt")); //reading data file
    
    int even = 0, odd = 0, under50 = 0; //declaring variables
    
    for(int j = 0; j < 12; j++){ //looping 12 times, one per number
      int num = in.nextInt();
      
      if( num % 2 == 0 ){ //counting even numbers
        even++;
      }
      else { //counting odd numbers
        odd++;
      }
      
      if( num >= 50){ //counting numbers >=50
        under50++;
      }
    }//end for loop
    
    //print 
    System.out.print("The amount of even numbers is: " + even + "\nThe amount of odd number is: " + odd + "\nThe amount of numbers over or equal to 50 is: " + under50);
  }
}