package classwork10;

public class CW2 {
    public static void main(String[] args) {
        // Число соввершенно, если оно равно сумме всех своих делителей, кроме самого себя.
        // Пример: 6 = 1 + 2 + 3. Найдите все совершенные числа от 1 до 10 000 и выведите  их на экран.
        for (int i = 1; i < 10_000; i++) {
            if (isNumberExcellent(i)) {
                System.out.println("Совершенное счисло " + i);
            }
        }
    }

    private static boolean isNumberExcellent(int number) {
        int sumOfDividers = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0){
                sumOfDividers += i;
            }
            if (sumOfDividers > number){
                return false;
            }
        }
        return sumOfDividers == number;

    }
}
