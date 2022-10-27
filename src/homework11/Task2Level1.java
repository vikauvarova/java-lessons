package homework11;

import java.util.Arrays;
import java.util.Random;

public class Task2Level1 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 100;
        int bound = 100;
        int[] arrayA = new int[size];
        for (int i = 0; i < arrayA.length; i++) {
                arrayA[i] = random.nextInt(bound);
        }

        int[] arrayAMultiplied = new int[100];
        for (int i = 0; i < arrayAMultiplied.length; i++) {
            arrayAMultiplied[i] = arrayA[i] * 2;
        }

        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayAMultiplied));


    }
}
