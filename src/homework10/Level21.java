package homework10;

public class Level21 {
    private static final int MONTH_IN_YEAR = 12;
    public static void main(String[] args) {
        double percent = 4.7;
        int deposit = 500;
        int periodInYear = 30;
        double depositWithoutCap = deposit;
        double depositWithYearCap = deposit;
        double depositWithMonthCap = deposit;
        for (int i = 0; i < periodInYear; i++) {
            depositWithoutCap += (deposit * percent / 100);
        }
        for (int i = 0; i < periodInYear; i++) {
            depositWithYearCap += (depositWithYearCap * percent / 100);
        }
        for (int year = 0; year < periodInYear; year++) {
            for (int month = 0; month < MONTH_IN_YEAR; month++) {
                depositWithMonthCap += (depositWithMonthCap * percent / MONTH_IN_YEAR / 100);
            }
        }
        System.out.println(depositWithoutCap);
        System.out.println(depositWithYearCap);
        System.out.println(depositWithMonthCap);
    }
}
