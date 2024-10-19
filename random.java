import java.util.*;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int totalRounds = 0;  
        int totalScore = 0;   
        boolean playAgain;

        do {
            int myNumber = (int)(Math.random()*100); 
            int userNumber;
            int maxAttempts = 5; 
            int attempts = 0;      

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Guess a number between 1 and 100. You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                userNumber = scanner.nextInt();
                attempts++;

                if (userNumber == myNumber) {
                    System.out.println("Correct Number! You've guessed it in " + attempts + " attempts.");
                    totalRounds++;
                    totalScore += (maxAttempts - attempts + 1);
                    break; 
                } else if (userNumber > myNumber) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }

                if (attempts >= maxAttempts) {
                    System.out.println("Sorry, you've used all your attempts. The correct number was " + myNumber + ".");
                }
            }

           
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        } while (playAgain);

      
        System.out.println("Thank you for playing!");
        System.out.println("Total rounds played: " + totalRounds);
        System.out.println("Your final score: " + totalScore);
        scanner.close();
    }
}
