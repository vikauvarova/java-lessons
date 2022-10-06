package homework5;

import com.sun.jdi.IntegerValue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HW5 {
    boolean isDividedFor7And5(int val){
        return val % 7 == 0 & val % 5 == 0;
    }
    boolean lengthMoreTen(String str){
        return str.length() > 10;
    }

    boolean canBuy ( int time){
        boolean isEdekaOpen = time > 8 & time < 19;
        boolean isReweOpen = time > 9 & time < 22;
        return  isReweOpen == true | isEdekaOpen == true;
    }


    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = isWeekend == true & isRain == false;
        System.out.println(canWalk);

        HW5 hw5 = new HW5();
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("HH");
        int timeNow = Integer.valueOf(formatForDateNow.format(dateNow));
        boolean canBuy = hw5.canBuy(timeNow);
        if (canBuy == true){
            System.out.println("Я могу купить еду, это " + canBuy);
        }


        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        System.out.println(hw5.isDividedFor7And5(val));

        System.out.println("Введите строку");
        Scanner scanner2 = new Scanner(System.in);
        String str = scanner2.nextLine();
        System.out.println(hw5.lengthMoreTen(str));

    }

}