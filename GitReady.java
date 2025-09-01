import java.util.Scanner;
import java.util.Random;

public class GitReady {
    public static void main(String[] args) {
        // creates a scanner
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // 1 to 100
        int guess = 0;
        int attempts = 0;

        // asks the user to guess
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next(); // discard invalid input
            }
        }

        scanner.close();
    }
}
