import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String playAgain="";

        do {
            System.out.print("""
                    Welcome to "Rock Paper Scissors
                    Do u want to play (y/n) """);
            String play = scanner.nextLine();
            if(play.equals("n")){
                break;
            }

            System.out.print("Enter Rock,Paper,Scissors: ");
            String userchoice = scanner.nextLine().toLowerCase();

            String[] choices = {"rock", "paper", "scissor"};

            int luck = rand.nextInt(0, choices.length);
            String computerchoice = choices[luck].toLowerCase();

            //condition ? true : false

            String result = "";


            result = (computerchoice.equals(userchoice)) ? "Tie" : ((computerchoice.equals("rock")) && (userchoice.equals("paper"))) ? "User Wins" : ((computerchoice.equals("paper")) && (userchoice.equals("scissor"))) ? "User Wins" : ((computerchoice.equals("scissor")) && (userchoice.equals("rock"))) ? "User Wins" : "Computer Wins";
            System.out.println("User Choice: " + userchoice);
            System.out.println("Computer Choice: " + computerchoice);
            System.out.println("Result: " + result);

            System.out.print("Do u wish to play again:y/n ");
            playAgain = scanner.nextLine().toLowerCase();

            if(playAgain.equals("n")){
                System.out.println("Thanks for playing");
            }

             }while(playAgain.equals("y"));

    }
}