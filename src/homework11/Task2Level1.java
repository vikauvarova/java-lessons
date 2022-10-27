package homework11;

import java.util.Arrays;
import java.util.Random;

public class Task2Level1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayA = new int[100];
        for (int i = 0; i < arrayA.length; i++) {
                arrayA[i] = random.nextInt(100) + 1;
        }

        int[] arrayAMultiplied = new int[100];
        for (int i = 0; i < arrayAMultiplied.length; i++) {
            arrayAMultiplied[i] = arrayA[i] * 2;
        }

        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayAMultiplied));


    }
}
