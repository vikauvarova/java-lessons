package classwork10;

public class Tringle {
    public static void main(String[] args) {
        int hight = 10;
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < hight - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
