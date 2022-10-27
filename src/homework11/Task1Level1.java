package homework11;

import java.util.Arrays;
import java.util.Random;

public class Task1Level1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Максимально число в массиве = " + max);

        for (int i = 0; i < array.length; i++) {
            if(max == array[i]){
                System.out.println("Это " + (i + 1) + "е число в массиве");
            }
        }

    }
}
