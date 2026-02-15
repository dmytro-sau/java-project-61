package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class Prime {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_RANDOM_NUMBER = 20;

    public static void play() {
        Engine.run(DESCRIPTION, getGameData());
    }

    private static String[][] getGameData() {
        String[][] rounds = new String[NUMBER_OF_ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int number = random.nextInt(MAX_RANDOM_NUMBER) + 1;
            rounds[i][0] = Integer.toString(number);
            rounds[i][1] = isPrime(number) ? "yes" : "no";
        }

        return rounds;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
