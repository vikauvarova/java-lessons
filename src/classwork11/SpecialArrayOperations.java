package classwork11;

import java.util.Arrays;

public class SpecialArrayOperations {
    public static void main(String[] args) {
        int[] arrayOne = new int[5];
        arrayOne[0] = 1;
        arrayOne[1] = 45;
        arrayOne[2] = 46;
        arrayOne[3] = 46;
        arrayOne[4] = 47;

        int[] arrayTwo = new int[5];
        for (int i = 0; i < arrayOne.length; i++) {
            arrayTwo[i] = arrayOne[i];
        }

        int[] arrayThree = Arrays.copyOf(arrayOne, 6);
        int[] arrayFour = Arrays.copyOfRange(arrayOne, 2, 3);

        int[] arrayFour1 = new int[3];
        int j = 0;
        for (int i = 2; i < 5; i++) {
            arrayFour1[j] = arrayOne[i];
            j++;
        }
        System.out.println(arrayOne);

        int[] arrayFive = arrayOne.clone();

        System.out.println(Arrays.toString(arrayOne));
        arrayFive[2] = 1;
        System.out.println(Arrays.toString(arrayFive));
        Arrays.sort(arrayOne);
    }
}
