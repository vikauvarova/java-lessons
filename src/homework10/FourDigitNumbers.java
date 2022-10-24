package homework10;

public class FourDigitNumbers {
    public static void main(String[] args) {

        for (int i = 1000; i < 10_000 ; i++) {
            int fourNumber = i % 10; // 0
            int thirdNumber = (i / 10) % 10;
            int secondNumber = i / 100 % 10;
            int firstNumber = i / 1000 % 10;
            if (firstNumber == secondNumber || firstNumber == thirdNumber || secondNumber == thirdNumber || firstNumber == fourNumber || secondNumber == fourNumber || thirdNumber == fourNumber){
                continue;
            }
            System.out.println(i);
        }
    }
}

