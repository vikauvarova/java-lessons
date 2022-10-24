package homework10;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int high = scanner.nextInt();
        for (int i = 0; i < high; i++) {
            for (int j = 0; j < high - i; j++) {
                System.out.print("   ");
            }

            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(" ^ ");
            }
        System.out.println("");

        }
    }
}
