package classwork9;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Необходимо вывести на консоль такую последовательности чисел:
        //1 2 4 8 16 32 64 128 256 512
//        int i = 1;
//        int result = 0;
//        while (i < 512){
//            System.out.println(i);
//            i *= 2;
//        }
//        System.out.println(i);

        // простая игра
        Random random = new Random();
        int number = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);

        int secondPlayerNumber;
        int howMuchWeGuess = 0;
        do {
            secondPlayerNumber = scanner.nextInt();
            if (number > secondPlayerNumber){
                System.out.println("нет, ,больше");
            } else if (number < secondPlayerNumber){
                System.out.println("нет, меньше");
            }
            howMuchWeGuess++;
        } while (secondPlayerNumber != number);
        System.out.println("Угадал: " + number + " потратил" + howMuchWeGuess + " попыток");
    }
}
