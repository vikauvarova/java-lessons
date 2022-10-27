package classwork8;

import java.util.Random;
import java.util.Scanner;

public class ForExample3 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n =scanner.nextInt();
//        double sum = 1;
//        double sum2 = 0;
//        for (int i = 1; i <= n; i++, sum = sum / 2){
//            sum2 = sum2 + sum;
//
//        }
//        System.out.println(sum2);


        //Задача 2 (Вывести таблицу умножения на 3)

//        int num = 3;
//        for (int i = 1; i < 10; i++){
//            int result = num * i;
//            System.out.println(num + " * " + i + " = " +  result);
//        }

        //Задача 4
        // если температура больше 20 градутов - кондиционер включается, если <20, то нет. Если температра на улице < чем в доме, то открыть окно
        // дописать
//        Random random = new Random();
//        int t = random.nextInt(40);
//        System.out.println("Температура в доме " + t);
//        int tOutDoor = random.nextInt(40);
//        System.out.println("Температура на улице " + tOutDoor);
//
//        if (t > 20) {
//            if (tOutDoor < t) {
//                System.out.println("Открыть окно ");
//            } else {
//                System.out.println("on");
//            }
//        } else {
//            System.out.println("off");
//        }
// Двухначные числа и найти все такие пары чисел, у которых одно число делиться на другие
        for (int i = 10; i < 99; i++) {
            for (int j = 10; j < 99; j++) {
                if (i % j == 0 && i != j){
                    System.out.println(i + ":" + j);
            }

        }

      }
    }

}
