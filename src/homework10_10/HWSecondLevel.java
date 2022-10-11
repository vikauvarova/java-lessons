package homework10_10;

import java.util.Random;
import java.util.Scanner;

public class HWSecondLevel {
    static void canDriveIntoTownB(int numberCar, boolean isLorry, boolean isWeekend){
        if (numberCar % 2 == 0 && !isLorry && isWeekend){
            System.out.println("Это выходной " + isWeekend);
            System.out.println("Номер машины " + numberCar);
            System.out.println("Это грузовик? " + isLorry);
            System.out.println("Можно заезжать");
        } else if (isLorry && isWeekend){
            System.out.println("Это выходной " + isWeekend);
            System.out.println("Это грузовик? " + isLorry);
            System.out.println("Грузовикам въезд запрещен. Дождитесь понедельника");
        } else if (numberCar % 2 != 0 && !isLorry && isWeekend){
            System.out.println("Это выходной " + isWeekend);
            System.out.println("Номер машины " + numberCar);
            System.out.println("У Вас не четный номер. Дождитесь понедельника для въезда");
        } else if (numberCar % 2 != 0 && !isLorry && !isWeekend){
            System.out.println("Это выходной " + isWeekend);
            System.out.println("Номер машины " + numberCar);
            System.out.println("Можно заезжать");
        } else if (isLorry && !isWeekend){
            System.out.println("Это выходной " + isWeekend);
            System.out.println("Можно заезжать");
        } else {
            System.out.println("Это выходной? " + isWeekend);
            System.out.println("Номер машины " + numberCar);
            System.out.println("Это грузовик? " + isLorry);
            System.out.println("Въезд запрещен. Дождидесь выходных");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1");
        int numberOne = scanner.nextInt();
        System.out.println("Введите число 2");
        int numberTwo = scanner.nextInt();
        System.out.println("Введите число 3");
        int numberThree = scanner.nextInt();
        if (numberOne > numberTwo && numberOne > numberThree || numberOne == numberTwo & numberOne >numberThree){
            System.out.println("Максимальное число " + numberOne);
        } else if (numberTwo > numberOne && numberTwo > numberThree || numberTwo == numberThree & numberTwo >numberThree) {
            System.out.println("Максимальное число " + numberTwo);
        } else {
            System.out.println("Максимальное число " + numberThree);
        }


        Random random = new Random();
        int n = random.nextInt(28800)+1;
        System.out.println("До конца рабочего дня осталось " + n + " сек");
        if (n / 3600 > 4 ) {
            System.out.println("До конца рабочего дня осталось " + n / 3600 + " часов");
        } else if (n / 3600 > 1) {
            System.out.println("До конца рабочего дня осталось " + n / 3600 + " часа");
        } else if (n / 3600 == 1) {
            System.out.println("До конца рабочего дня остался " + n / 3600 + " час");
        } else {
            System.out.println("До конца рабочего дня осталось меньше часа");
        }

        HWSecondLevel hwSecondLevel = new HWSecondLevel();
        int numberCar = random.nextInt(10000)+1;
        boolean isLorry = random.nextBoolean();
        boolean isWeekend = random.nextBoolean();
        HWSecondLevel.canDriveIntoTownB(numberCar,isLorry,isWeekend);

    }
}
