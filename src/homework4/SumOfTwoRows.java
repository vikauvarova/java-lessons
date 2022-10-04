package homework4;

public class SumOfTwoRows {
    String valueOne = "123";
    String valueTwo = "124";


    int returnSumOfTwoRows(){
        return Integer.valueOf(valueOne ) + Integer.valueOf(valueTwo);
    }

    public static void main(String[] args) {
        SumOfTwoRows sumOfTwoRows = new SumOfTwoRows();
        System.out.println(sumOfTwoRows.returnSumOfTwoRows());
    }
}
