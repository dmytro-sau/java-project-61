package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;
import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class Progression {

    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int MAX_STEP = 10;
    private static final int MAX_START = 100;
    private static final int PROGRESSION_LENGTH = 8;

    public static void play() {
        Engine.run(DESCRIPTION, generateGameData());
    }

    private static String[][] generateGameData() {
        String[][] rounds = new String[NUMBER_OF_ROUNDS][2];

        for (int round = 0; round < NUMBER_OF_ROUNDS; round++) {
            int step = Util.getRandomNumber(MAX_STEP);
            int hiddenIndex = Util.getRandomNumber(PROGRESSION_LENGTH - 1);
            int start = Util.getRandomNumber(MAX_START);

            String[] progression = buildProgression(start, step, PROGRESSION_LENGTH);

            String correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";

            rounds[round][0] = String.join(" ", progression);
            rounds[round][1] = correctAnswer;
        }

        return rounds;
    }

    private static String[] buildProgression(int startValue, int step, int length) {
        String[] progression = new String[length];

        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(startValue + step * i);
        }

        return progression;
    }
}
