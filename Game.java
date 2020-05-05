import java.util.Scanner;
import java.util.Random;

public class Game {

    public static String ComputerMove(){

        Random rand = new Random();
        String computerMove = null;
        int generatedNumber = rand.nextInt(3);

        switch (generatedNumber) {
            case 0:
                computerMove = "rock";
                break;
            case 1:
                computerMove = "paper";
                break;
            case 2:
                computerMove = "scissors";
                break;
        }

        return computerMove;
    }

    

    public static void main(String[] args) {

        System.out.println("\nWelcome to Rock Paper Scissors\n");

        boolean contineGame = true;

        while(contineGame){

            char userAnswer;
            Scanner sc = new Scanner(System.in);


            //testing to see if ComputerMove method is working
            System.out.println("\nComputer Move: " + ComputerMove());




            System.out.println("\nWould you like to keep playing? (y/n): ");
            userAnswer = sc.next().charAt(0);

            
                 
            if(userAnswer == 'y'){
                contineGame = true;
            } else if(userAnswer == 'n') {
                contineGame = false;
            } else {
                while(userAnswer != 'y' && userAnswer != 'n') {
                    System.out.println("\nPlease choose either y or n");
                    userAnswer = sc.next().charAt(0);

                    if(userAnswer == 'y'){
                        contineGame = true;
                    }
                    if(userAnswer == 'n'){
                        contineGame = false;
                    }
                }
            }



        }


    }
}