package homework11;

import java.util.Arrays;
import java.util.Random;

public class Task3Level1 {
    public static void main(String[] args) {
        int startMeasuring = 8;
        int finishMeasuring = 20;
        Random random = new Random();
        int[] temperature = new int[12];
        for (int i = 0; i < temperature.length; i++) {
            temperature[i] = random.nextInt(10) - 5; // диапазон температуры от -5 до +5
        }
        System.out.println(Arrays.toString(temperature));

        int minTemp = 0;
        for (int i = 0; i < temperature.length ; i++) {
            if (minTemp > temperature[i]){
                minTemp = temperature[i];
            }
        }
        for (int i = 0; i < temperature.length; i++) {
            if(minTemp == temperature[i]){
                System.out.println("Минимальная температура была в "+ (i + startMeasuring) + " часов");
            }

        }


    }
}
