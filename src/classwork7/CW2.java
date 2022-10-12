package classwork7;

import java.util.Random;

public class CW2 {
    public static void main(String[] args) {
        Random random = new Random();
        int day = random.nextInt(31) + 1; // от 1 до 31
        System.out.println(day);
        if (day <= 10){
            System.out.println("Первая декада");
        } else if(day <=20){
            System.out.println("Вторая декада");
        } else if (day <= 30){
            System.out.println("Третья декада");
        } else {
            System.out.println("Четвертая декада");
        }
    }
}
