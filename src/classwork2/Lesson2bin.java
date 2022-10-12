package classwork2;

public class Lesson2bin {
    public static void main(String[] args) {
        int dec = 123;
        // dec 123 -> bin 1111011
        // 123 / 2 = 61 (1)
        // 61 / 2 = 30 (1)
        // 30 / 2 = 15 (0)
        // 15 / 2 = (1)
        // 7 / 2 = 3 (1)
        // 3 / 2 = 1 (1)
        // 1 / 2 = 0 (1)
        System.out.println(Integer.toBinaryString(dec));
        }
}
