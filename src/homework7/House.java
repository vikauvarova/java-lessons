package homework7;

import java.util.Scanner;

public class House {
    public static void whichEntrance (int apartmentNumber ){
        if (apartmentNumber <= 20){
            System.out.println("Первый подъезд");
        } else if (apartmentNumber <= 48) {
            System.out.println("Второй подъезд");
        } else if (apartmentNumber <= 90) {
            System.out.println("Третий подъезд");
        } else {
            System.out.println("Такой квартиры в этом доме нет");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер квартиры");
        int apartmentNumber = scanner.nextInt();
        whichEntrance(apartmentNumber);
    }
}
