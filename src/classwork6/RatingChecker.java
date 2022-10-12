package classwork6;

import java.util.Random;

public class RatingChecker {
    public void check (int raiting) {
        System.out.println(raiting);
        if (raiting > 100) {
            System.out.println("неправильные балы");
        } else if (raiting > 86) {
            System.out.println(5);
        } else if (raiting > 72) {
            System.out.println(4);
        } else if (raiting > 56) {
            System.out.println(3);
        } else if (raiting > 0){
            System.out.println(2);
        } else {
            System.out.println("неправильные балы");
        }
    }

    public static void main(String[] args) {
        RatingChecker ratingChecker = new RatingChecker();
        Random random = new Random();
        int raiting = random.nextInt(40) + 60;
        ratingChecker.check(raiting);

    }
}
