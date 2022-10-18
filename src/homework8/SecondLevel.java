package homework8;

public class SecondLevel {
    public static void main(String[] args) {
        int factorOne = 6;
        int factorTwo = 2;
        int product = 0;
        for (int i = 0; i < factorTwo ; i++) {
            product = product + factorOne;
        }
        System.out.println(product);

        int result = 0;
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0){
                result = i + result;
                count++;
            }
        }
        System.out.println(result/count);

        int n = 3;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);

    }
}
