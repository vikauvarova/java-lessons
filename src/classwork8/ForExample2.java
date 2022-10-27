package classwork8;

import java.util.Scanner;

public class ForExample2 {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++){
//            System.out.println(10 - i);
//        }
        //вівести на консоль сумму четніх чисел от 20 до 40
        int sum = 0;
        for (int i = 20; i < 40; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);

//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int to = scanner.nextInt();
//        for (int i = 0; i <= to; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);
    }
}
