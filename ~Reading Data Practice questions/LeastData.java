//anthony

import java.util.*; //importing packages
import java.io.*;

public class LeastData{
  public static void main( String[] args ) throws Exception{
    Scanner in = new Scanner(new File("DATALeastData.txt")); //reading data file
    //declaring variables
    int num = 1;
    int small = 1000;
    
    while(num > 0){ //while loop until the value is 0
      num = in.nextInt();
      if(num == 0){
        break; //if the number is 0, break it
      }
      if(num < small){
        small = num; //setting the number value to the smallest one
      }
    }
    //print statement
    System.out.print("The lowest number is: " + small);
  }
}
    