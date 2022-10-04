package homework4;

public class CalculatorLevelTwo {
    static double add(double valueOne, double valueTwo){
        return valueOne + valueTwo;
    }

    static double minus(double valueOne, double valueTwo){
        return valueOne - valueTwo;
    }

    static double multiply(double valueOne, double valueTwo){
        return valueOne * valueTwo;
    }

    static double divide(double valueOne, double valueTwo){
        return valueOne / valueTwo;
    }

    public static void main(String[] args) {
        CalculatorLevelTwo calculatorLevelTwo = new CalculatorLevelTwo();
        System.out.println(CalculatorLevelTwo.add(10.5, 2));
        System.out.println(CalculatorLevelTwo.minus(10.5,2));
        System.out.println(CalculatorLevelTwo.multiply(10.5,2));
        System.out.println(CalculatorLevelTwo.divide(10.5,2));
    }

}
