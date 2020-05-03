import java.util.Scanner;


public class Game {

    public static void main(String[] args) {

        System.out.println("\nWelcome to Rock Paper Scissors\n");

        boolean contineGame = true;

        while(contineGame){

            char userAnswer;
            Scanner sc = new Scanner(System.in);


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