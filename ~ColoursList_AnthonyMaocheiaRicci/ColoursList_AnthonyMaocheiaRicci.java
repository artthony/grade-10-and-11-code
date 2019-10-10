/* Anthony Maocheia-Ricci - ArrayList Quiz Assignment
   Date: November 1st, 2018
  
   Note: all the \"'s and \n's are just for formatting, as I like the look of it. It functionally does nothing to the code.
 */  

//importing packages
import java.util.*;
import java.io.*;
  
public class ColoursList_AnthonyMaocheiaRicci{
  public static void main( String[] args ) throws Exception {
    //declaring and initializing scanner from file
    Scanner file = new Scanner(new File("DATA_ColoursList.txt"));
    
    //declaring and initializing ArrayList of Strings
    ArrayList<String> colours = new ArrayList<String>();
    
    //adding all colours into an ArrayList
    while(file.hasNext()){
      colours.add(file.next());
    }// close while
    
    //removing the 2nd colour
    colours.remove(1);
    
    //sorting alphabetically and displaying in a single line
    Collections.sort(colours);
    for(int j = 0; j < colours.size(); j++){ //running for size of colours
      System.out.print(colours.get(j) + " "); //printing colour at index j, which is incrementing up one until the max
    }// close for
    System.out.println("");
    
    //displaying a message if the list contains "yellow"
    if(colours.contains("yellow")){
      System.out.println("\nThe ArrayList \"colours\" contains the String \"yellow\".\n");
    }// close if
    
    //displaying a message if the list contains "white"
    if(colours.contains("white")){
      System.out.println("\nThe ArrayList \"colours\" contains the String \"white\"\n");
    }// close if
    
    //adding "turquoise" and "purple to the end of the list
    colours.add("turquoise");
    colours.add("purple");
    
    //setting index 3 to "pink"
    colours.set(3, "pink");
    
    //sorting alphabetically and displaying once more
    Collections.sort(colours);
    for(int k = 0; k < colours.size(); k++){ //running for size of colours
      System.out.print(colours.get(k) + " "); //printing colour at index k, which is incrementing up one until the max
    }// close for
    System.out.println("");    
    
    //displaying the final colour and printing message
    System.out.println("\nThe last colour is: " + colours.get(colours.size() - 1) + "\n");
    
  } // close main
} // close class 