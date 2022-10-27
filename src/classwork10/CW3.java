package classwork10;


public class CW3 {
    public static void main(String[] args) {
        int sumOfEvenNumbers = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0){
                System.out.println("no");
                continue;
            }

            sumOfEvenNumbers += i;
            if (true){
                System.out.println("yes");
            }
        }
    }
}
