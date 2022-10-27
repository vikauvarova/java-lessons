package homework8;

public class Bonus {
//    посмотрите презентацию 3 лекции, методы у String (в конце лекции)
//4) Дана строка из 3-х цифр. Найдите сумму этих цифр. То есть сложите как числа первый символ строки, второй и третий.
//    подсказка: используйте for чтобы пройтись по номеру символа, используйте метод length() у строки чтобы пройтись по каждому символу, метод charAt() чтобы достать символ на определенной позиции и метод Integer.parseInt() чтобы перевести в int
//5) Дана строка из 6-ти цифр. Проверьте, что сумма первых трех цифр равняется сумме вторых трех цифр. Если это так - выведите 'да', в противном случае выведите 'нет'.
//    в данной задаче нужно использовать 2 сумматора и дополнительно метод if чтобы проверить когда нам нужно складывать к первому сумматору, а когда ко второму

    public static void main(String[] args) {
        String number = "156";
        int sumFirstThird = 0;
        int sumSecondThird = 0;
        for (int i = 0; i < number.length(); i++) {
//            int num = Integer.parseInt(String.valueOf(number.charAt(i))); - способ 1
            int num = Character.getNumericValue(number.charAt(i)); // способ 2
            if (number.length() / 2 > i){
                sumFirstThird = sumFirstThird + num;
            } else {
                sumSecondThird = sumSecondThird + num;
            }
            if (sumFirstThird == sumSecondThird){
                System.out.println("da");
            } else {
                System.out.println("nope");
            }
        }
    }

}
