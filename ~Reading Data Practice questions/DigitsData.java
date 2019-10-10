//anthony

import java.util.*; //importing packages
import java.io.*;

public class DigitsData{
  public static void main( String[] args ) throws Exception{
    Scanner in = new Scanner(new File("DATACountData1.txt")); //reading data file
    
    int single = 0, doubl = 0, triple = 0; //declaring variables
    
    for(int j = 0; j < 12; j++){ //looping 12 times, one per number
      int num = in.nextInt();
      
      if(num < 10){ //counting 1 digit numbers
        single++;
      }
      else if(num < 100){ //counting 2 digit numbers
        doubl++;
      }
      
      else if(num < 1000){ //counting 3 digit numbers
        triple++;
      }
    }//end for loop
    
    //print 
    System.out.print("The amount of single digit numbers are: " + single + "\nThe amount of double digit numbers are: " + doubl + "\nThe amount of triple digit numbers are: " + triple);
  }
}