package lesson2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  //      String str = scanner.nextLine();
  //      System.out.println(str);
        //       System.out.println("Введите число для подсчета формулы:");
      //  int x = scanner.nextInt();
       // int formula = x * x + 3 * x - 5;
       // System.out.println(formula);

 //       int radius = scanner.nextInt();
//        System.out.println("площадь круга:" + Math.PI * radius * radius);
//        System.out.println("периметр круга:" + 2 * Math.PI * radius);

        int money = scanner.nextInt();
        int pizzaPrice = 230;
        int gymPrice = 26;
        int candyPrice = 2;
        int pizzaCount = money / pizzaPrice;
        int moneyAfterPizza = money % pizzaPrice;
        int gymCount = moneyAfterPizza / gymPrice;
        int moneyAfterGym = moneyAfterPizza % gymPrice;
        int candyCount = moneyAfterGym / candyPrice;
        int moneyAfterAll = moneyAfterGym % candyPrice;
        System.out.println("pizza " + pizzaCount);
        System.out.println("gym " + gymCount);
        System.out.println("candy " + candyCount);
        System.out.println("money after " + moneyAfterAll);
    }
}

