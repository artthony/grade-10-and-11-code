// anthony maocheia-ricci
// Arrays assignment for marks
// November 14, 2018

import java.util.*; //importing the util package - for use with the Arrays class

public class MarksStats_AnthonyMaocheiaRicci{
  public static void main( String[] args){
    int[] marks = new int[20]; // initializing Array "marks"
    
    for(int j = 0; j < marks.length; j++){ // inputting 20 random numbers from 30 - 100 into the array
      marks[j] = (int)(Math.random()*70) + 31;
    } // close for
    
    //print statements
    System.out.println("There are " + passing(marks) + " students passing with a 50 or higher.");
    highest(marks); // ### This helper method needs to return multiple types, so "void" was needed instead of double or int. ###
    System.out.println("The range of marks for the class is: " + range(marks) + ".");
    System.out.printf("The average for the class is: %.1f" , average(marks));
    System.out.println(".");
    
  } // close main
  
  //first helper method
  public static int passing( int[] a ){
    int pass = 0;
    for(int k = 0; k < a.length; k++){ // looping for length of Array
      if(a[k] >= 50){
        pass++; // adding to counter of how many students passed
      }
    } // close for
    
    return pass;
  } // close helper #1
  
  //second helper method
  public static void highest( int[] a ){
    int high = 0;
    String doubles = "";
    
    for(int l = 0; l < a.length; l++){ // looping for length of Array
      if(a[l] > high){
        high = a[l]; // finding highest marker
      }
    } // close for
    for(int l = 0; 0l < a.length; l++){ // looping for length of Array
      if(a[l] == high){ // if there are 2 of the same mark, the String will be filled with the sentence below
        doubles = "There are at least 2 people with the top mark.";
      } 
    }
    System.out.println("The highest mark in the class is a " + high + ". " + doubles);
  }// close helper #2
  
  //third helper method
  public static int range( int[] a ){
    int max = 0, min = 101, range = 0;
    
    for(int p = 0; p < a.length; p++){ // looping for length of Array
      max = Math.max(max, a[p]); // finding out max
      min = Math.min(min, a[p]); // finding out min
    } // close for
    range = max - min; // calculating range
    return range;
  } // close helper #3
  
  //fourth helper method
  public static double average( int[] a ){  
    double avg = 0;
    
    for(int p = 0; p < a.length; p++){ // looping for length of Array
      avg += a[p]; // adding the numbers to the average
    } // close for
    
    avg /= a.length; // calculating by dividing
    
    return avg;
  } // close helper #4

} // close class