package homework4;

public class CurrencyConverter {
    static double euro = 1.02;
    static double dollar = 0.98;

    static double convertToEuro(double dollar){
        return  dollar * euro;
    }

    static double convertToDollar(double euro){
        return euro * dollar;
    }

    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        System.out.println(CurrencyConverter.convertToEuro(125.0));
        System.out.println(CurrencyConverter.convertToDollar(127.5));
    }
}
