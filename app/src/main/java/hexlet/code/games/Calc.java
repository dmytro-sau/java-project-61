package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final int MAX_RANDOM_NUMBER = 20;
    private static final String[] OPERATORS = {"+", "-", "*"};

    public static void play() {
        Engine.run(DESCRIPTION, getGameData());
    }
    private static String[][] getGameData() {
        String[][] rounds = new String[NUMBER_OF_ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            String operator = OPERATORS[random.nextInt(OPERATORS.length)];
            int numberOne = random.nextInt(MAX_RANDOM_NUMBER);
            int numberTwo = random.nextInt(MAX_RANDOM_NUMBER);
            String question = numberOne + " " + operator + " " + numberTwo;
            String correctAnswer = String.valueOf(calculate(numberOne, numberTwo, operator));

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }

        return rounds;

    }
    private static int calculate(int num1, int num2, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
                break;
        }
        return result;
    }
}
