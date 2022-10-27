package homework11;

import java.util.Scanner;

public class Task5Level1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int arrayModule = Math.abs(array[i]);
            if(arrayModule > max){
                max = arrayModule;
            }
        }
        System.out.println(max);
    }
}
