package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class Progression {
    public static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int MAX_STEP = 10;
    private static final int MAX_START = 100;
    private static final int LENGTH = 10;

    public static void play() {
        Engine.run(DESCRIPTION, getGameData());
    }

    private static String[][] getGameData() {
        String[][] rounds = new String[NUMBER_OF_ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int step = random.nextInt(MAX_STEP) + 1;
            int start = random.nextInt(MAX_START) + 1;
            int hiddenIndex = random.nextInt(LENGTH);

            StringBuilder progression = new StringBuilder();
            int hiddenNumber = 0;

            for (int j = 0; j < LENGTH; j++) {
                int current = start + j * step;
                if (j == hiddenIndex) {
                    progression.append("..");
                    hiddenNumber = current;
                } else {
                    progression.append(current);
                }
                if (j < LENGTH - 1) {
                    progression.append(" ");
                }
            }

            rounds[i][0] = progression.toString();
            rounds[i][1] = String.valueOf(hiddenNumber);
        }

        return rounds;
    }
}
