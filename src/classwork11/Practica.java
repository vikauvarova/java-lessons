package classwork11;

import java.util.Arrays;

public class Practica {
    public static void main(String[] args) {
        int howManyNumbers = 100;
        int[] array = new int[howManyNumbers / 2];
        int j = 0;
        for (int i = 0; i < howManyNumbers; i++) {
            if (i % 2 == 1) {
                array[j] = i;
                j++;
            }
        }
        int[] array2 = new int[howManyNumbers / 2];

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[array.length - 1 - i];
        }
        System.out.println(Arrays.toString(array2));
    }



}
