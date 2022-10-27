package homework10;

import java.util.Scanner;

public class NumberLessThanTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int howMuchEnter = 0;
        do {
            number = scanner.nextInt();
            howMuchEnter++;
        } while (number >= 2);

        System.out.println("Количество простых чисел вводили - " + howMuchEnter);

    }
}
