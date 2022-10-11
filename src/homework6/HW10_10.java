package homework6;

import java.util.Random;
import java.util.Scanner;

public class HW10_10 {
    public boolean canWatchTheMovie(int age){
        return age >= 18;
    }

    void canDriveIntoTown (int numberCar, boolean isLorry){
        if (numberCar % 2 == 0 && !isLorry){
            System.out.println("Можно заезжать");
        } else if (isLorry){
            System.out.println("Грузовикам въезд запрещен. Дождитесь понедельника");
        } else {
            System.out.println("У Вас не четный номер. Дождитесь понедельника для въезда");
        }
    }

    public static void main(String[] args) {

        HW10_10 hw10_10 = new HW10_10();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш возраст");
        int age = scanner.nextInt();
        if (hw10_10.canWatchTheMovie(age)){
            System.out.println("Можно идти смотреть кино");
        } else {
            System.out.println("Нельзя идти смотреть кино");
        }

        Random random = new Random();
        int year = random.nextInt(300)+1800;
        System.out.println(year);
        boolean isLeapYear = year % 4 == 0;
        if (isLeapYear){
            System.out.println("Это високосный год");
        } else {
            System.out.println("Это не високосный год");
        }

        double cookiePrice = 0.5;
        System.out.println("Сколько Вы хотите купить печенья?");
        int amount = scanner.nextInt();
        System.out.println("Сколько у Вас есть денег?");
        double money = scanner.nextDouble();
        if (money >= amount * cookiePrice) {
            System.out.println("Можно");
        } else {
            System.out.println("Нельзя");
        }

        boolean isEagle = random.nextBoolean();
        if(isEagle){
            System.out.println("орел");
        } else {
            System.out.println("решка");
        }

        int numberCar = random.nextInt(10_000) + 1;
        boolean isLorry = random.nextBoolean();
        System.out.println("Номер машины " + numberCar);
        System.out.println("Это грузовик? " + isLorry);
        hw10_10.canDriveIntoTown(numberCar,isLorry);


    }







}
