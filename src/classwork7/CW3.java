package classwork7;

import java.util.Scanner;

public class CW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер пальца");
        int finger = scanner.nextInt();
        switch (finger){
            case 1:
                System.out.println("большой");
                break;
            case 2:
                System.out.println("указательный");
                break;
            case 3:
                System.out.println("средний");
                break;
            case 4:
                System.out.println("безымянный");
                break;
            case 5:
                System.out.println("мизинец");
                break;
            default:
                System.out.println("такого пальца нет");
        }
    }
}
