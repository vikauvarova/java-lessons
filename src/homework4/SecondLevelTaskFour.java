package homework4;


public class SecondLevelTaskFour {
    char task(String str, int a, int b){
        String carvedStr = str.substring(a);
        return carvedStr.charAt(b);
    }

    public static void main(String[] args) {
        SecondLevelTaskFour secondLevelTaskFour =new SecondLevelTaskFour();
        System.out.println(secondLevelTaskFour.task("Мама Мыла Раму", 9, 4));
    }
}
