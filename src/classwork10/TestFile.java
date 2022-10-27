package classwork10;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Path.of("D:\\Курсы\\java-lessons\\src\\classwork10\\testdata.txt"));
        int firstVal = scanner.nextInt();
        int secondVal = scanner.nextInt();
        int maxSumVal = scanner.nextInt();
        int sum = 0;
        for (int i = firstVal; i < secondVal; i++) {
            sum += i;
            if (sum > maxSumVal) {
                System.out.println(sum);
                return;
            }
        }
    }
}
