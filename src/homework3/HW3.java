package homework3;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        String basicJavaStr= "I study Basic Java!";
        System.out.println(basicJavaStr.charAt(basicJavaStr.length() -1));
        System.out.println(basicJavaStr.contains("Java"));
        System.out.println(basicJavaStr.replace('a', 'o'));
        System.out.println(basicJavaStr.toUpperCase());
        System.out.println(basicJavaStr.toLowerCase());
        System.out.println(basicJavaStr.substring(basicJavaStr.indexOf("Java")));

        int a = 470;
        int b = 200;
        double percent = b * 100.0 / a;
        System.out.println(percent + "%");

        char g = 'g';
        int askIndex = (int) g;
        System.out.println(askIndex);

        Scanner name = new Scanner(System.in);
        System.out.println("Введите имя ");
        String myName = name.next();
        System.out.println("Hello " + myName + "!");
        System.out.println("Ваше имя начинается с буквы " + myName.charAt(0));

        String val = "59.976";
        String valInt = val.substring(0,2);
        int intVal = Integer.parseInt(valInt);
        System.out.println(intVal);

        //Способ 2
        double number = 59.976;
        int numberInt = (int) Math.floor(number);
        System.out.println(numberInt);

        int x = 475;
        short downX = (short) x;
        System.out.println(downX);
    }
}
