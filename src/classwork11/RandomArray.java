package classwork11;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        int max = 0;

    }
}
