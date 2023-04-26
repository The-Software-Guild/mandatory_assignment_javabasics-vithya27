import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numRounds;
        int userWins = 0;
        int computerWins = 0;
        int ties = 0;

        System.out.println("Let's play a game of Rock Paper Scissors!");

        // Determine number of rounds user wants to play
        while (true) {
            System.out.print("Enter the number of rounds you would like to play: ");
            numRounds = scanner.nextInt();

            if(numRounds < 1 || numRounds > 10) {
                System.out.println("You have entered an invalid number of rounds. Please enter an integer between 1 and 10.");
            } else {
                break;
            }
        }

        // Play the game
        for (int i = 1; i <= numRounds ; i++) {
            int userChoice = 0;
            while (true) {
                System.out.println("Round " + i + ": Enter a number as your choice (Rock = 1, Paper = 2, Scissors = 3): " );
                userChoice = scanner.nextInt();

                if(userChoice < 1 || userChoice > 3) {
                    System.out.println("You have entered an invalid option. Please enter an integer for your choice (Rock = 1, Paper = 2, Scissors = 3).");
                } else {
                    break;
                }
            }

            int computerChoice = random.nextInt(3) + 1;

            // Game Logic
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
                ties++;
            } else if (userChoice == 1 && computerChoice == 3 || userChoice == 2 && computerChoice == 1 || userChoice == 3 && computerChoice == 2) {
                System.out.println("You win!");
                userWins++;
            } else {
                System.out.println("Computer wins!");
                computerWins++;
            }
        }

        // Results
        System.out.println("Results: " + "Ties: " + ties + " User wins: " + userWins + " Computer wins: " + computerWins);

        // Overall Winner declaration
        if (userWins > computerWins) {
            System.out.println("Congratulations, you are the winner!");
        } else if (userWins < computerWins) {
            System.out.println("Computer wins, better luck next time!");
        } else {
            System.out.println("It's a tie!");
        }

        // Play again
        System.out.println("Would you like to play again? (Y/N)");
        String playAgain = scanner.next();

        if (playAgain.equalsIgnoreCase("N")) {
            System.out.println("Thanks for playing!");
        } else {
            main(null);
        }


    }
}
