package lesson2;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class lesson2 {
    public static void main(String[ ] args) {
        int dec = 365; // 3 * 100 + 6 * 10 +5 * 1
        int  oct;
        oct = dec % 8; // 5
        dec = dec / 8; // 45
        oct = oct * 10 + dec % 8; // 5*10 + 5 = 55
        dec = dec / 8; // 5
        oct = oct * 10 + dec % 8; // 55 * 10 + 5 = 555
        System.out.println("dec -> oct for 365: " + oct);
        System.out.println(Integer.toOctalString(365));
        int decAfter; //oct 555 -> dec 365
        // 555 -> 5 * 8 * 8 + 5 * 8 + 5 * 1
        decAfter = (oct / 100) * 8 * 8;
        oct = oct % 100;
        decAfter = decAfter + (oct / 10) * 8;
        oct = oct % 10;
        decAfter = decAfter + oct;
        System.out.println(decAfter);
    }

}
