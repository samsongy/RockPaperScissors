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

    public static String PlayerMove(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nSelect a move (rock, paper, scissors): ");
        String playerMove = sc.next();

        while(!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")){
            System.out.print("ERROR: INVALID MOVE (please select 'rock', 'paper', or 'scissors'): ");
            playerMove = sc.next();
        }

        return playerMove;

    }


    public static String CalculateWinner(String x, String y){
        String computerMove = x;
        String playerMove = y;

        String winner = null;

        if(computerMove == "rock" && playerMove == "rock"){
            winner = "Tie!";
        } else if(computerMove == "paper" && playerMove == "paper"){
            winner = "Tie!";
        } else if(computerMove == "scissors" && playerMove == "scissors"){
            winner = "Tie!";
        } else if(computerMove == "rock" && playerMove == "scissors"){
            winner = "You Lose...";
        } else if(computerMove == "rock" && playerMove == "paper"){
            winner = "You Win!!!";
        } else if(computerMove == "scissors" && playerMove == "paper"){
            winner = "You Lose...";
        } else if(computerMove == "scissors" && playerMove == "rock"){
            winner = "You Win!!!";
        } else if(computerMove == "paper" && playerMove == "rock"){
            winner = "You Lose...";
        } else if(computerMove == "paper" && playerMove == "scissors"){
            winner = "You Win!!!";
        }

        
        return winner;  
    }

    public static void main(String[] args) {

        System.out.println("\nWelcome to Rock Paper Scissors\n");
        // boolean contineGame = true;


        //testing the CalculateWinner method
        String computerMove = "rock";
        String playerMove = "scissors";

        String winner = CalculateWinner(computerMove, playerMove);

        System.out.println(winner);

        


        // while(contineGame){

        //     char userAnswer;
        //     Scanner sc = new Scanner(System.in);


        //     System.out.print("\nWould you like to keep playing? (y/n): ");
        //     userAnswer = sc.next().charAt(0);




            


            
                 
        //     if(userAnswer == 'y'){
        //         contineGame = true;
        //     } else if(userAnswer == 'n') {
        //         contineGame = false;
        //     } else {
        //         while(userAnswer != 'y' && userAnswer != 'n') {
        //             System.out.print("\nPlease choose either y or n: ");
        //             userAnswer = sc.next().charAt(0);

        //             if(userAnswer == 'y'){
        //                 contineGame = true;
        //             }
        //             if(userAnswer == 'n'){
        //                 contineGame = false;
        //             }
        //         }
        //     }



        // }


    }
}