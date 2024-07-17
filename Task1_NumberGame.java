package CodSoftInternshipTask;

import java.util.Random;
import java.util.Scanner;

public class Task1_NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalScore = 0;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int numberOfAttempts = 10;
            boolean hasWon = false;
            int attemptsTaken = 0;

            System.out.println("I have generated a random number between 1 and 100. You have " + numberOfAttempts + " attempts to guess it.");

            for (int i = 1; i <= numberOfAttempts; i++) {
                System.out.print("Attempt " + i + ": Enter your guess: ");
                int userGuess = scanner.nextInt();
                attemptsTaken++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    hasWon = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!hasWon) {
                System.out.println("You've used all attempts. The correct number was: " + numberToGuess);
            }

            totalScore += (numberOfAttempts - attemptsTaken + 1);

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Your total score is: " + totalScore);
        scanner.close();
    }
}
