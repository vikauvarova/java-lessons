package homework10;

import java.util.Random;

public class Level23 {
    public static void main(String[] args) {
        int number = new Random().nextInt(100);
        System.out.println(number);
        int howMuchTried = 0;
        while (number !=1){
            howMuchTried++;
            if(number % 2 == 0){
                number /= 2;
            } else {
                number = (number * 3 + 1) / 2;
            }
        }
        System.out.println("теорема доказана " + howMuchTried);
    }
}
