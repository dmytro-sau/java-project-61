package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class GCD {
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void play() {
        Engine.run(DESCRIPTION, getGameData());
    }

    private static String[][] getGameData() {
        String[][] rounds = new String[NUMBER_OF_ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int numberOne = random.nextInt(MAX_RANDOM_NUMBER) + 1;           
            int numberTwo = random.nextInt(MAX_RANDOM_NUMBER) + 1;

            rounds[i][0] = numberOne + " " + numberTwo;
            rounds[i][1] = String.valueOf(calculateGCD(numberOne, numberTwo));
        }

        return rounds;
    }

    
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
