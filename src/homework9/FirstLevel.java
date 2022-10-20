package homework9;

import java.util.Random;
import java.util.Scanner;

public class FirstLevel {
    public static void main(String[] args) {
        int i = 7;
        while (i<100){
            System.out.println(i);
            i += 7;
        }

        Scanner scanner = new Scanner(System.in);
        int j =0;
        int numberFor = scanner.nextInt();
        int sum = 0;
        while (j < numberFor){
            j++;
            if ( j % 2 == 0){
                sum = sum + j;
            }
        }
        System.out.println("Сумма нечетных чисел в этом диапазне = " + sum);


        Random random = new Random();
        int number = random.nextInt(900) + 99;
        System.out.println("Случайное число" + number);
        int thirdNumber = number % 10; // 3
        int secondNumber = (number / 10) % 10;
        int firstNumber = number / 100 % 10;
        if (firstNumber > secondNumber && firstNumber >thirdNumber){
            System.out.println("Наибольшая цифра " + firstNumber);
        } else if (secondNumber > thirdNumber ) {
            System.out.println("Наибольшая цифра " + secondNumber);
        } else {
            System.out.println("Наибольшая цифра " + thirdNumber);
        }

        int naturalNum = scanner.nextInt();
        int sumAllNumbers = 0;
        int valOfNumber = 0;
        for (int k = 1; k < naturalNum; k*=10) {
            valOfNumber = naturalNum / k % 10;
            sumAllNumbers = valOfNumber + sumAllNumbers;
        }
        System.out.println(sumAllNumbers);



    }
}
