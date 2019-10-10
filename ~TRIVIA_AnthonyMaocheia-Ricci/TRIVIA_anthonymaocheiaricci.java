//anthony maocheia-ricci
//arraylist trivia

//importing packages
import java.util.*;
import java.io.*;

public class TRIVIA_anthonymaocheiaricci
{
  public static void main(String[] args) throws Exception
  {
    //inputting text files and getting a keyboard input scanner
    Scanner q = new Scanner(new File("DATA_Questions.txt"));
    Scanner a = new Scanner(new File("DATA_Answers.txt"));
    Scanner h = new Scanner(new File("DATA_Hints.txt"));
    Scanner input = new Scanner( System.in );
    
    //declaring + initializing variables
    int count = 1, wrong = 0;
    String inputted = "";
    
    //setting up ArrayLists
    ArrayList<String> questions = new ArrayList<String>();
    ArrayList<String> answers = new ArrayList<String>();
    ArrayList<String> hints = new ArrayList<String>();
    ArrayList<Integer> order = new ArrayList<Integer>();
    
    //inputting questions, answers, hints and random numbers into arraylists
    while(q.hasNext()){
      questions.add(q.nextLine());
    }
    while(a.hasNext()){
      answers.add(a.nextLine());
    }
    while(h.hasNext()){
      hints.add(h.nextLine());
    }
    for(int j = 0; j < questions.size(); j++){
      int r = ((int)(Math.random()*10)); /* try to make this change for .size */
      if(!order.contains(r)){
        order.add(r);
      }
      else {
        j--; 
      }
    }
    
    //asking question
    for(int k = 0; k < questions.size(); k++){
      while(!inputted.equalsIgnoreCase(answers.get(order.get(k)))){
        System.out.println(questions.get(order.get(k)));
        inputted = input.nextLine();
        //answers wrong
        if(!answers.get(order.get(k)).equalsIgnoreCase(inputted)){
          System.out.println("Wrong!, please try again.");
          count++;
        }
        //answers right
        else {
          System.out.println("Correct! The answer was \"" + answers.get(order.get(k)) + "\". You guessed " + count + " times.\n");
          count = 1;
          break;
        }
        if(count == 2){
          System.out.println("\nHint: " + hints.get(order.get(k)));
        }
        else if(count > 5){
          System.out.println("Wrong! The answer was \"" + answers.get(order.get(k)) + "\". You guessed " + (count - 1) + " times.\n");
          count = 1;  
          wrong++;
          break;
        }
      }//end while
    }//end for
    
    System.out.println("\nCongratulations! You got: " + ((10 - wrong) * 10) + " %!");
  }//close main
}//close class