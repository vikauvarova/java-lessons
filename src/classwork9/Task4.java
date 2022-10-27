package classwork9;

public class Task4 {
    public static void main(String[] args) {
        // int число -> 1234
        // 4321

        int num = 1234;
        int reversed = 0;
        while (num > 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println(reversed);
    }
}
