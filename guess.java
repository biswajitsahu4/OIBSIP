import java.util.Random;
import java.util.Scanner;
public class guess 
{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random random = new Random();
	        int round = 1;
	        int totalAttempts = 0;
	        while (true) {
	            int number = random.nextInt(100) + 1;
	            int attempts = 0;
	            int maxAttempts = 7;
	            boolean correct = false;
	            System.out.println("\n===== Round " + round + " =====");
	            System.out.println("I have selected a number between 1 and 100.");
	            System.out.println("You have " + maxAttempts + " attempts.");
	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int guess = sc.nextInt();
	                attempts++;

	                if (guess > number) {
	                    System.out.println("Too High!");
	                }
	                else if (guess < number) {
	                    System.out.println("Too Low!");
	                }
	                else {
	                    System.out.println("Correct!");
	                    System.out.println("You guessed it in "+ attempts + " attempts.");
	                    correct = true;
	                    break;
	                }
	                System.out.println("Attempts used: " + attempts + "/" + maxAttempts);
	            }
	            if (!correct) {
	                System.out.println("You Lost!");
	                System.out.println("The correct number was: " + number);
	            }
	            totalAttempts += attempts;
	            System.out.println("\nRound " + round + " — guessed in " + attempts + " attempts.");
	            System.out.print("Do you want to Play Again? (yes/no): ");
	            String choice = sc.next();

	            if (choice.equalsIgnoreCase("no")) {
	                break;
	            }
	            round++;
	        }
	        System.out.println("\n===== Game Over =====");
	        System.out.println("Total Rounds Played: " + round);
	        System.out.println("Total Attempts: " + totalAttempts);
	        sc.close();
	    }
	}