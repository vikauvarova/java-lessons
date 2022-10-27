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


        int firstTemp = 0;
        int time = 0;
        for (int i = 0; i < temperature.length ; i++) {
            if (temperature[i] < 0){
                firstTemp = temperature[i];
                time = i + startMeasuring;
                System.out.println("Впервые температура упала ниже 0 в "+ time + " часов");
                break;
            }
        }
        System.out.println("Температура в " + time + " часов была " + firstTemp + " градусов");


    }
}
