package homework8;

import java.util.Scanner;
import java.util.SortedMap;

public class FirstLevel {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите с какого года начать проверку");
//        int yearFrom = scanner.nextInt();
//        System.out.println("Введите до какого года проверять");
//        int yearTo = scanner.nextInt();
//        int count = 0;
//        for (int i = yearFrom; i < yearTo; i++) {
//           if (i % 4 == 0){
//               count++;
//           };
//        }
//        System.out.println(count + " високосных лет");
        long before = System.currentTimeMillis();
        long num = 5;
        int amountOfNumbers = 0;
        for (int i = 1; i < num / 2; i++) {
              if (num % i == 0) {
                  amountOfNumbers++;
              }
        }
        if (amountOfNumbers == 1){
            System.out.println(num + " - простое число");
        } else {
            System.out.println(num + " - не простое число");
        }
        long after = System.currentTimeMillis();
        System.out.println(after-before);
//        for (int i = 10; i < 100; i++) {
//            if (i % 2 == 0 && i % 6 != 0) {
//                System.out.println(i);
//            }
//        }
//        int sum = 0;
//        for (int i = 0; i <= 100; i++) {
//            sum = i + sum;
//        }
//        System.out.println(sum);
//
//        for (int i = -10; i > -41; i--) {
//            System.out.println(i);
//        }
//
//        long result = 1;
//        for (int i = 1; i < 100; i++) {
//            if (i % 13 == 0){
//                result = i * result;
//            }
//        }
//        System.out.println(result);
//
//        System.out.println("Введите множитель");
//        int factorOne = scanner.nextInt();
//        System.out.println("Введите сомножитель");
//        int factorTwo = scanner.nextByte();
//        System.out.println("Результат умножения первого числа на второе ");
//        int product = scanner.nextInt();
//        if (factorOne * factorTwo == product){
//            System.out.println("Это правильно");
//        } else {
//            System.out.println("Это не правильно");
//            System.out.println("Правильный ответ " + factorOne * factorTwo);
//        }
    }
}
