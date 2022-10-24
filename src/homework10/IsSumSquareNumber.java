package homework10;

public class IsSumSquareNumber {
    public static void main(String[] args) {
        for (int i = 10; i < 99; i++) {
            int reversed = i % 10 * 10 + i / 10;
            int sum = i + reversed;
            for (int j = 0; j < sum / 2; j++) {
                if(j * j == sum){
                    System.out.println(i);
                }
            }
        }





     }
}
