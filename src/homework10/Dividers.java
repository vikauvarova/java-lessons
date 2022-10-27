package homework10;

import java.util.Scanner;

public class Dividers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число М");
        int from = scanner.nextInt();
        System.out.println("Введите число N");
        int to = scanner.nextInt();
        for (int i = from; i < to; i++) {
            for (int j = 1; j < i; j++) {
                if(i % j == 0){
                    System.out.println("Число " + i + " делится на " + j);
                }
                System.out.println("");
            }
        }
    }
}
