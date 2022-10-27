package classwork9;

public class Task5 {
    //  яка цифра  у числі більше всіх
    public static void main(String[] args) {
        int myNum = 1234;
        int max = 0;
        while (myNum > 0){
            int un = myNum % 10;
            if (max <= un){
                max = un;
            }
            myNum /= 10;
        }
        System.out.println(max);
    }


}
