package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_ROUNDS;


public class Even {
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int MAX_RANDOM_NUMBER = 20;
    
    public static void play() {
        Engine.run(DESCRIPTION, getGameData());
    }
    private static String[][] getGameData() {
        String[][] rounds = new String[NUMBER_OF_ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int  number = random.nextInt(MAX_RANDOM_NUMBER) + 1;
            rounds[i][0] = Integer.toString(number);
            rounds[i][1] = isEven(number) ? "yes" : "no";
        }
        return rounds;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}