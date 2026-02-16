package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;
import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class GCD {
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MAX_RANDOM_NUMBER = 20;

    public static void play() {
        Engine.run(DESCRIPTION, getGameData());
    }

    private static String[][] getGameData() {
        String[][] rounds = new String[NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int numberOne = Util.getRandomNumber(MAX_RANDOM_NUMBER);
            int numberTwo = Util.getRandomNumber(MAX_RANDOM_NUMBER);

            rounds[i][0] = numberOne + " " + numberTwo;
            rounds[i][1] = Integer.toString(calculateGCD(numberOne, numberTwo));
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
