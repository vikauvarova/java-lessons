package homework7;


import java.util.Random;

public class SecondLevel {

    public static void main(String[] args) {
        Random random = new Random();
        int money = 4511;
        int lastDigit = money % 10;
        int thousand = money / 1000;
        int hundreds = (money % 1000) / 100;
        int decades = (money % 1000) % 100 / 10;

        switch (lastDigit){
            case 1:
                if (decades == 1){
                    System.out.println(money + " долларов");
                } else {
                System.out.println(money + " доллар");}
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(money + " доллара");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                System.out.println(money + " долларов");
                break;
        }

        switch (thousand){
            case 1:
                System.out.println("одна тысяча");
                break;
            case 2:
                System.out.println("две тысячи");
                break;
            case 3:
                System.out.println("три тысячи");
                break;
            case 4:
                System.out.println("четыре тысячи");
                break;
            case 5:
                System.out.println("пять тысяч");
                break;
            case 6:
                System.out.println("шесть тысяч");
                break;
            case 7:
                System.out.println("семь тысяч");
                break;
            case 8:
                System.out.println("восемь тысяч");
                break;
            case 9:
                System.out.println("девять тысяч");
                break;
            case 0:

                break;
        }
        switch (hundreds){
            case 1:
                System.out.println("сто");
                break;
            case 2:
                System.out.println("двести");
                break;
            case 3:
                System.out.println("триста");
                break;
            case 4:
                System.out.println("четыреста");
                break;
            case 5:
                System.out.println("пятьсот");
                break;
            case 6:
                System.out.println("шестьсот");
                break;
            case 7:
                System.out.println("семьсот");
                break;
            case 8:
                System.out.println("восемьсот");
                break;
            case 9:
                System.out.println("девятьсот");
                break;
            case 0:

                break;
        }
        switch (decades){
            case 1:

                break;
            case 2:
                System.out.println("двадцать");
                break;
            case 3:
                System.out.println("тридцать");
                break;
            case 4:
                System.out.println("сорок");
                break;
            case 5:
                System.out.println("пятьдесять");
                break;
            case 6:
                System.out.println("шестьдесят");
                break;
            case 7:
                System.out.println("семьдесять");
                break;
            case 8:
                System.out.println("восемьдесять");
                break;
            case 9:
                System.out.println("девяносто");
                break;
            case 0:

                break;
        }
        switch (lastDigit){
            case 1:
                if (decades == 1 && lastDigit == 0){
                    System.out.println("десять");
                } else if (decades == 1 && lastDigit == 1){
                    System.out.println("одинатьсять");
                } else {
                System.out.println("один");}

                break;
            case 2:
                System.out.println("два");
                break;
            case 3:
                System.out.println("три");
                break;
            case 4:
                System.out.println("четыре");
                break;
            case 5:
                System.out.println("пять");
                break;
            case 6:
                System.out.println("шесть");
                break;
            case 7:
                System.out.println("семь");
                break;
            case 8:
                System.out.println("восемь");
                break;
            case 9:
                System.out.println("девять");
                break;
            case 0:

                break;
        }

    }
}
