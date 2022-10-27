package homework11;

import java.util.Arrays;

public class Task4Level1 {
    public static void main(String[] args) {
        String[] surname = {"Депп", "Питт", "Дикаприо", "Дауни", "Смит"};
        System.out.println(surname[surname.length - 5]);
        System.out.println(surname[surname.length - 4]);
        System.out.println(surname[surname.length - 3]);
        System.out.println(surname[surname.length - 2]);
        System.out.println(surname[surname.length - 1]);
// второй вариант
        for (int i = 0; i < surname.length; i++) {
            String surnames = surname[i];
            System.out.println(surnames);
        }
    }
}
