package classwork11;

public class Classwork11 {
    public static void main(String[] args) {
        int[] array = new  int [10];
        int[] documents = {12, 34, 65, 22};
        for (int i = 0; i < documents.length; i++) {
            System.out.println(documents[i]);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("index: " + i + ", val: " + array[i]);
        }

        String[] pocketThings  = new String[3];
        pocketThings[2] = "печенье";
        for (int i = 0; i < pocketThings.length; i++) {
            System.out.println(pocketThings[i]);
        }

    }
}
