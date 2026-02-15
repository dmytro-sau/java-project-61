package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;
    
    public static void run(String description, String[][] rounds) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.println("Question: " + rounds[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next(); 
            if (userAnswer.equals(rounds[i][1])) {
                System.out.println("Correct!"); 
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                    + rounds[i][1] + "'.\nLet's try again, "
                    + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }   
}
