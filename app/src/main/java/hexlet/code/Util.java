package hexlet.code;
import java.util.Random;

public class Util {
    public static int getRandomNumber(int number) {
        Random rand = new Random();
        return rand.nextInt(number) + 1;
    }
}
