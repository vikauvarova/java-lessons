package classwork9;

import java.util.Random;

public class NumbersCals {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10_000);
        int sumOfDigits = 0;
        System.out.println(number);
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }
        System.out.println(sumOfDigits);
    }
}
