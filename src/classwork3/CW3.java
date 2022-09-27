package classwork3;

public class CW3 {
    public static void main(String[] args) {
        byte firstValue = 127;
        short secondValue = firstValue;
        int thirdVal = secondValue;
        int downgradeVal = 1245;
       byte downgradedVal = (byte) downgradeVal;
       System.out.println(downgradedVal);
        char c = 'z';
        int i = Character.getNumericValue(c);
        System.out.println(i);
        int z = c;
        System.out.println(z);

        //Example 3
        double divide = 3 / 4.0; // 3/4 -> 0(3). Поєтому 4 меняем на 4.0
        double percent = (100 / 1500.0) * 100; // если (100 / 1500) * 100; - то получим 0. Для это первое действие должно проходить в double
        System.out.println(percent);

        int param1 = 10;
        //param1 = param1 + 1;
        param1++; // 11
        param1++; //12

        //Example 4
        byte byteVal = 127;
        byteVal++;
        System.out.println(byteVal);

        double bigVal = 123.44;
        int roundedRes = (int) Math.round(bigVal);
        System.out.println(roundedRes);

        String val = "123";
        String val2 = "444";
        int intVal = Integer.parseInt(val);
        int intVal2 = Integer.parseInt(val2);
        System.out.println(intVal + intVal2);

        String helloWorldStr = "    Hello World   ";
        System.out.println(helloWorldStr);
        System.out.println(helloWorldStr.charAt(0));
        System.out.println(helloWorldStr.length());
        System.out.println(helloWorldStr.toLowerCase());
        System.out.println(helloWorldStr.toUpperCase());
        System.out.println(helloWorldStr.indexOf('l'));
        System.out.println(helloWorldStr.lastIndexOf('l'));
        System.out.println(helloWorldStr.indexOf('s'));
        System.out.println(helloWorldStr.indexOf("llo"));
        System.out.println("Длина равна " + helloWorldStr.length());
        String trimmedStr = helloWorldStr.trim();
        System.out.println(trimmedStr.length());
        System.out.println(trimmedStr);
        System.out.println(trimmedStr.repeat(3));
     System.out.println(trimmedStr.replace('l', 'p'));
     System.out.println(trimmedStr.replace("llo", "y"));
     System.out.println(trimmedStr.replace("l", "yu"));
     System.out.println(trimmedStr.substring(6));
     System.out.println(trimmedStr.substring(0,5));

     char upToCut = 'o';
     int indexOfCutSymbol = trimmedStr.indexOf(upToCut);
     System.out.println(trimmedStr.substring(0, indexOfCutSymbol+1));

     System.out.println(trimmedStr.startsWith("Hello"));
     System.out.println(trimmedStr.endsWith("rld"));




    }
}
