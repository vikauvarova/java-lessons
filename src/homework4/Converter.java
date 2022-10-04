package homework4;

public class Converter {
    double converterToCelsius(int F) {
        return (F - 32) / 1.8;

    }

    double converterToFahrenheit(int c) {
        return c * 1.8 + 32;

    }

    public static void main(String[] args) {
        Converter converter = new Converter();
        System.out.println(converter.converterToFahrenheit(10) + "°C");
        System.out.println(converter.converterToCelsius(50) + "°F");
    }
}
