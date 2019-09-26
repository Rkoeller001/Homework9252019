package Stuf;

import java.util.Random;
import java.util.Scanner;

public class guessingGame2 {
    public static void main(String[] args) {
        Random random = new Random();
        int userGuess = random.nextInt(15);
        int numberGuess = 0;
        Scanner scanner = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (!win) {
            System.out.printf("start guessing");
            guess = scanner.nextInt();


            if (guess == userGuess) {
                System.out.printf("it took you");
            }
        }
    }
}
