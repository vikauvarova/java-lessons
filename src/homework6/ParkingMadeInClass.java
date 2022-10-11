package homework6;

public class ParkingMadeInClass {

    private static void chechWeekDaySystem(boolean isLorry, int carNumber) {
        if (isLorry) {
            System.out.println("Yes");
        } else if (carNumber % 2 != 0) {
            System.out.println("yes");
        } else {
            System.out.println("У Вас не четный номер. Дождитесь понедельника для въезда");
        }
    }

    private static void checkWeekendSystem (boolean isLorry, int carNumber){

    }

    public static void main(String[] args) {
        boolean isWeekend = false;
        boolean isLorry = true;
        int carNumber = 1;


        if (isWeekend){
            if (!isLorry){
                if (carNumber % 2 == 0) {
                    System.out.println("yes");
                } else {
                    System.out.println("Ne chetnoe");
                }
            } else {
                System.out.println("Lorry not");
            }
        } else {
            if (isLorry) {
                System.out.println("yes");
            } else if (carNumber % 2 != 0) {
                System.out.println("yes");
            } else {
                System.out.println("legkovaya s chetnuny");
            }
        }
    }
}
