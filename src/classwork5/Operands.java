package classwork5;

public class Operands {
    public static void main(String[] args) {
        int i = 10;
        i = i + 1;
        i++;
        i--;
        i = i / 2;
        i = i * 4;

        //побитовый сдвиг
        int val = 256; // ... 0000 0001 0000 0000
        val = val >> 2; // 000 0001 0000 00
        System.out.println(val);

        int val1 = 567;
        int val2 = 456;

        boolean inEquals = val1 == val2; // реалиционнный оператор true or false
        boolean isGreatThan = val1 > val2;
        boolean isGreatOrEquals = val1 >= val2;
        boolean inNotEquals = val1 != val2;
        // == >= <= < !=

        String str = "красный кирпиич";
        boolean isCorrectWord = str.endsWith("кирпич") && str.charAt(2) == 'a'; // | - или, & - и
        boolean orCorrectWord = str.endsWith("кирпич") || str.charAt(2) == 'a';
        boolean notEqualSecondMethod = !(val1 == val2);

        int byteTheiseSum = 10 & 9; //битовое сложение
        System.out.println(byteTheiseSum);

        System.out.println(str.length() >= 1);

        System.out.println(isDividedFor2And3(6));
        System.out.println(isDividedFor2And3(3));

        System.out.println(isNotDividedFor2And3(6));
        System.out.println(isNotDividedFor2And3(5));

    }

    static boolean isDividedFor2And3(int val){
        return val % 2 == 0 && val % 3 == 0;  // число делится на 2 и на 3
    }
    static boolean isNotDividedFor2And3(int val){
        return val % 2 == 0 && val % 3 == 0;  // число делится на 2 и на 3
    }
}
