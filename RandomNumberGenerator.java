import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Random random = new Random();

        // The list of possible starting digits
        String[] prefixes = {"071", "072", "077", "075"};

        while (true) {
            // user to press Enter
            System.out.println("Press Enter to generate a random number...");
            scanner.nextLine();  // Wait for Enter key press
            
            // Choose a random prefix from the list
            String prefix = prefixes[random.nextInt(prefixes.length)];

            
            StringBuilder randomNumber = new StringBuilder(prefix);
            for (int i = 0; i < 8; i++) {
                randomNumber.append(random.nextInt(10));  // Append a random digit (0-9)
            }

            System.out.println("Random Number: " + randomNumber.toString());
        }
    }
}

