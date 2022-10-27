package classwork10;

import java.util.Random;
import java.util.Scanner;

public class CW1 {
    public static void main(String[] args) {
        Random random = new Random();
        int currVal;
        int sum = 0;
        boolean humanDecision = true;
        Scanner scanner = new Scanner(System.in);
        do {
            currVal = random.nextInt(11) + 1;
            System.out.println(currVal);
            sum += currVal;
            if (sum > 11){
                System.out.println("Сумма " + sum);
                System.out.println("Надо еще?");
                humanDecision = scanner.nextBoolean();
            }
        } while (sum < 21 && humanDecision);
        System.out.println(sum);
        System.out.println(sum > 21 ? "проиграл" : "выиграл" );
    }
}
