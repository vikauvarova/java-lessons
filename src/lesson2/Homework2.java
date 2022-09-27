package lesson2;

public class Homework2 {

    public static void main(String[] args) {

        // Перевести 637 из десятичной в двоичную и обратно
        // 6 * 100+ 3 * 10 * 7 *1
        // 637 / 16 = 39 (13 - D)
        // 39 / 16 = 2 (7)
        // 2 / 16 = 0 (2)
        // 637 -> 27D
        System.out.println(Integer.toHexString(637));

        //27D = 2 * 16^2 + 7 * 16^1 + 13 * 16^0 = 2 * 256 + 7 * 16 + 13 = 512 + 112 + 13 = 637

        // Задание 2
        // Перевести 637 из десятичной в двоичную и обратно
        // 637 / 2 = 318 (1)
        // 318 / 2 = 159 (0)
        // 159 / 2 = 79 (1)
        // 79 / 2 = 39 (1)
        // 39 / 2 = 19 (1)
        // 19 / 2 = 9 (1)
        // 9 / 2 = 4 (1)
        // 4 / 2 = 2 (0)
        // 2 / 2 = 1 (0)
        // 1 / 2 = 0 (1)
         // 637 -> 1001111101

        System.out.println(Integer.toBinaryString(637));
        // 1 * 2^9 + 0 * 2^8 + 0 * 2^7 + 1 * 2^6 + 1 * 2^5 + 1 * 2^4 + 1 * 2^3 + 1 * 2^2 + 0 * 2^1 + 1 * 2^0 =
        // = 512 + 0 + 0 + 64 + 32 + 16 + 8 + 4 + 1 = 637

        System.out.println("Задание 3");
        int n = 5;
        System.out.println(n * n);

        // Задача 4
        System.out.println("Задание 4");
        int productA = 1000;
        int productB = 500;
        int sale = 100;
        int together = productA + productB - sale;
        System.out.println("Скидка " + sale);
        System.out.println("A+B со скидкой " + together);

        // Задание 5
        System.out.println("Задание 5");
        int x = 18;
        int y = 5;
        System.out.println( x + y);
        System.out.println( x - y);




    }



}
