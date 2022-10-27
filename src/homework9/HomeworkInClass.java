package homework9;

import java.util.Random;

public class HomeworkInClass {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(900) + 100;
        int max = 0;
        System.out.println(number);
        while (number > 0){
            int currentDigit = number % 10;
             if (currentDigit > max) {
                max = currentDigit;
            }
            number = number / 10;
        }
        System.out.println(max);


//        int h = 100;
//        int n = 50;
//        int m = 1;
//        int count = 0;
//        int current = 1;
//        while (current < h){
//            count++;
//            current += n - m;
//        }
//        System.out.println(current);
    }
}
