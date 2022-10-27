package classwork8;

import java.util.Random;

public class ForExample {
    public static void main(String[] args) {

        for (int i = 1; i > 0; i++){
            System.out.println(i);
            Random random = new Random();
            int r = random.nextInt(1000);
            if (r <= 50){
                break;
            }
        }
        // Єта же програма в расписаном виде.
//        int i = 1;
//        if (i <= 5 ){
//            System.out.println(i);
//        }
//        i++;
//        if (i <= 5 ){
//            System.out.println(i);
//        }
//        i++;
//        if (i <= 5 ){
//            System.out.println(i);
//        }
//        i++;
//        if (i <= 5 ){
//            System.out.println(i);
//        }
//        i++;
//        if (i <= 5 ){
//            System.out.println(i);
//        }
    }
}
