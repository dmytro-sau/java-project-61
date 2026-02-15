package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;


public class Even {
    public static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_RANDOM_NUMBER = 20;
    private static final int ROUNDS_COUNT = 3;

    public static void playEven(Scanner scanner) {
        Random random = new Random();

        System.out.println(GAME_RULE);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number = random.nextInt(MAX_RANDOM_NUMBER) + 1;
            String correctAnswer = isEven(number) ? "yes" : "no";

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (!userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations!");
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}