package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        String choice = scanner.next();

        switch (choice) {
            case "1" -> Cli.welcome();
            case "2" -> Even.play();
            case "3" -> Calc.play();
            case "0" -> {return;}
            default -> System.out.println("Invalid input");
        }
    }

}
