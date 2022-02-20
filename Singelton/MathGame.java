import java.util.Random;
import java.util.random.*;
import java.io.*;
import java.util.Scanner;
public class MathGame {
    private static MathGame mathgame;
    private int score;
    private Random rand;
    private Scanner reader;
    private String [] operands;
/**
 * Sets the values and creates the instance of the differnt parts of the class
 */
    private MathGame(){
       this.score = 0;
       this.rand = new Random();
       this.reader = new Scanner(System.in);
       this.operands = new String [4];
       operands[0] = "+";
       operands[1] = "-";
       operands[2] = "/";
       operands[3] = "*";
       System.out.println("Let's have fun with Math!");

    }

    /**
     * Makes the single instace of the mathgame and always returns same one
     * @return returns the mathgame
     */
    public static MathGame getInstance() {
        if(mathgame == null) {
            mathgame = new MathGame();
        }
        return mathgame;
    }
/**
 * the method to enter the play of the game over all
 */
    public void play() {
      
        
       while(true){
        boolean  tracescore= false;
        String keepPlay = "P" ; 
        System.out.print("(P)lay or (Q)uit: ");
        keepPlay = reader.next();
        if(keepPlay.equalsIgnoreCase("P")){
            tracescore = playRound();
        }
        else if(keepPlay.equalsIgnoreCase("Q")){
            System.out.println("you won "+score+" games!\nGoodbye");
            break;
        }
        else{
            System.out.println("enter either p or q");
        }
        if(tracescore){
            score++;
        }
        }

    }
/**
 * lets one play a single round of the math game and stores the score
 * @return returns a true false value that goes to keepPlay
 */
    private boolean playRound(){
       System.out.println("\nRound anwser to 1 decimal place");
       double num1 = rand.nextInt(101);
       double num2 = rand.nextInt(101);
       int index = rand.nextInt(4);
       double Canwser = -1; 
       double inputAnwere = -2;
       System.out.print(num1+" "+ operands[index]+ " "+ num2+ " = ");
       
       if(index == 0){
           Canwser = num1+num2;
        // addion
       } else if(index == 1){
        Canwser = num1-num2;  
        // substaction
       }else if(index == 2) {
       Canwser = num1/num2;
        Canwser = Math.round((num1/num2)*10);
        Canwser/=10;
        // divistion
       }else if(index == 3) {
        Canwser = num1*num2;
        // multipcation
       }
       inputAnwere = reader.nextDouble();
       
       if((Canwser)==(inputAnwere) ){
        System.out.println("You got it");
        return true;
       }
       System.out.println("The correct anwaser is "+ Canwser);
        return false;
    }

}


