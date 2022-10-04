package classwork4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Table bigTable = new Table(10,1,2,1,"Red"); // в скобках указываем параметры в таком порядке как в конструкторе)
        // класс Table экземппляр = создался єкземпляр класса
        bigTable.color = "RED";
        Table smallTable = new Table(2,1,1,1, "Green");
        smallTable.color = "Green";
        smallTable.seatCount = 2;
        smallTable.length = 1;
        smallTable.width = 1;

        Scanner scanner = new Scanner(System.in);
        classwork3.CW3 cw3 = new classwork3.CW3();

        System.out.println(bigTable);

    }


}
