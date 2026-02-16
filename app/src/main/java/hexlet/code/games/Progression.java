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

        for (int roundIndex = 0; roundIndex < NUMBER_OF_ROUNDS; roundIndex++) {

            int step = Util.getRandomNumber(MAX_STEP) + 1;
            int startValue = Util.getRandomNumber(MAX_START);
            int hiddenIndex = Util.getRandomNumber(PROGRESSION_LENGTH);

            String[] progression = buildProgression(startValue, step, PROGRESSION_LENGTH);

            String correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";

            rounds[roundIndex][0] = String.join(" ", progression);
            rounds[roundIndex][1] = correctAnswer;
        }

        return rounds;
    }

    private static String[] buildProgression(int startValue, int step, int length) {
        String[] progression = new String[length];

        for (int index = 0; index < length; index++) {
            int currentValue = startValue + index * step;
            progression[index] = Integer.toString(currentValue);
        }

        return progression;
    }
}
