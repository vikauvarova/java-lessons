package homework4;

public class CalorieCalculator {
     int kal = 40;

    double calculateCaloriesInPizza(int sizePizza) {
        return kal * Math.PI * sizePizza * sizePizza;
    }

    public static void main(String[] args) {
        CalorieCalculator calorieCalculator = new CalorieCalculator();
        System.out.println("Количество калорий в пицце 14 см - " + calorieCalculator.calculateCaloriesInPizza(14) + " калорий");
        System.out.println("Количество калорий в пицце 12 см - " + calorieCalculator.calculateCaloriesInPizza(12) + " калорий");
    }
}
