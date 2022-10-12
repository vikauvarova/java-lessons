package homework7;

import java.util.Random;

public class Seasons {
    public static void whatSeason (int num){
        switch (num){
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Весна");
                break;
            case 3:
                System.out.println("Лето");
                break;
            case 4:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Не верное значение");
        }

    }


    public static void whatSeasonMonth (int month){
        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("Это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

    public static void whatSeasonMonthIf (int month){
        if (month <= 2 || month == 12){
                System.out.println("Это зима");
        } else if (month <= 5 ) {
            System.out.println("Это весна");
        } else if (month <= 8) {
            System.out.println("Это лето");
        } else if (month <= 11) {
            System.out.println("Это Осень");
        } else {
                System.out.println("Такого месяца не существует");
        }
    }


    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(4)+1;
        System.out.println("Какой по счету сезон? - " + num);
        whatSeason(num);

        int month = random.nextInt(12)+1;
        System.out.println("Какой по счету месяц? - " + month);
        whatSeasonMonth(month);
        whatSeasonMonthIf(month);
    }
}
