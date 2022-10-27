package homework11;

import java.util.Arrays;
import java.util.Random;

public class Task1Level1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
        }
        System.out.println(Arrays.toString(array));


        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                int firstPositiveNumber = i;
                System.out.println("Первое положительное число в массиве = " + array[i]);
                System.out.println("Это число " + firstPositiveNumber + "е в массиве");
                break;
            }
        }

    }
}