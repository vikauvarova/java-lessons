package classwork7;

public class CW1 {
    public static void main(String[] args) {
//        String str = "someString";
//        if (str.equals("someString")){ // стравнение строк, объектов, не примитивов через .equals
//
//        }

        int month = 10;
        switch (month){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("2й квартал");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("else");
        }

        String weather = "Солнце";
        switch (weather){
            case "Солнце":
                System.out.println("ok");
                break;
            case "Дождь":
                System.out.println("not ok");
                break;
            default:
                System.out.println("не понятно");
        }

        if (month == 1){
            System.out.println("Январь");
        } else if (month == 2) {
            System.out.println("Февраль");
        } else if (month == 3) {
            System.out.println("Март");
        } else if (month == 4) {
            System.out.println("Апрель");
        } else if (month == 5) {
            System.out.println("Май");
        }else if (month == 6) {
            System.out.println("Июнь");
        } else if (month == 7) {
            System.out.println("Июль");
        } else if (month == 8) {
            System.out.println("Август");
        } else if (month == 9) {
            System.out.println("Сент");
        } else if (month == 10) {
            System.out.println("Окт");
        } else if (month == 11) {
            System.out.println("Ноябрь");
        } else if (month == 12) {
            System.out.println("Декабрь");
        } else {
            System.out.println("else");
        }

        String languageCode = "de";
        switch(languageCode){
            case "en":
                System.out.println("Английский");
            break;
            case "de":
                System.out.println("Немецкий");
            break;
            case "jp":
                System.out.println("Япоский");
            break;
            case"tr":
                System.out.println("Турецкий");
            break;
            case"ua":
                System.out.println("Украинский");
            break;
            default:
                System.out.println("Язык не поддердивается");
        }

        if (languageCode.equals("en")){
            System.out.println("Английский");
        } else if (languageCode.equals("de")) {
            System.out.println("Немецкий");
        } else if (languageCode.equals("jp")) {
            System.out.println("Япоский");
        } else if (languageCode.equals("tr")) {
            System.out.println("Турецкий");
        } else if (languageCode.equals("ua")) {
            System.out.println("Украинский");
        }


//        switch (languageCode){
//            case "en" -> 1;
//            case "de" -> 2;
//        };
    }

    public static String isFirst6Month(int month){
        return month > 6
                ? "второе полугодие"
                : "первое полугодие";
        //if (month >6){ return "второе полугодие"} else {return "первое полугодие";}
    }
}
