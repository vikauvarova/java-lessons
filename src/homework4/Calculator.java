package homework4;

public class Calculator {
    int add (int numberOne, int numberTwo, int numberThree){
        return numberOne + numberTwo + numberThree;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5,7,8));
    }
}
