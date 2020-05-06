import java.util.Scanner;
import java.util.Random;

public class Game {

    public static void main(String[] args) {

        System.out.println("\n\nWelcome to Rock Paper Scissors\n");
        boolean contineGame = true;

        while(contineGame){
            Scanner sc = new Scanner(System.in);
            char userAnswer;
            
            String computerMove = ComputerMove();
            String playerMove = PlayerMove();


            System.out.println("\nComputer Move: " + computerMove);
            System.out.println("Player Move: " + playerMove);

            String winner = CalculateWinner(computerMove, playerMove);
            System.out.println(winner);


            System.out.print("\nWould you like to keep playing? (y/n): ");
            userAnswer = sc.next().charAt(0);

                 
            if(userAnswer == 'y'){
                contineGame = true;
            } else if(userAnswer == 'n') {
                contineGame = false;
            } else {
                while(userAnswer != 'y' && userAnswer != 'n') {
                    System.out.print("Please choose either y or n: ");
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
        String playerMove = sc.nextLine();

        while(!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")){
            System.out.print("ERROR: INVALID MOVE (please select 'rock', 'paper', or 'scissors'): ");
            playerMove = sc.nextLine();
        }


        return playerMove;



    }


    public static String CalculateWinner(String x, String y){

        String computerMove = x;
        String playerMove = y;


        String winner = null;
        
        if(computerMove.equals(playerMove)){
            winner = "Tie!";
        } else if(computerMove.equals("rock") && playerMove.equals("scissors")){
            winner = "You Lose...";
        } else if(computerMove.equals("rock") && playerMove.equals("paper")){
            winner = "You Win!!!";
        } else if(computerMove.equals("scissors") && playerMove.equals("paper")){
            winner = "You Lose...";
        } else if(computerMove.equals("scissors") && playerMove.equals("rock")){
            winner = "You Win!!!";
        } else if(computerMove.equals("paper") && playerMove.equals("rock")){
            winner = "You Lose...";
        } else if(computerMove.equals("paper") && playerMove.equals("scissors")){
            winner = "You Win!!!";
        }
        
        return winner;  
    }

    
}