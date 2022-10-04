package classwork4;

import java.util.Scanner;

public class Finder {
    static String storage = "Мама Мыла Раму";

    public int findIndexForString(String input) {
        return storage.indexOf(input);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchPhrase = scanner.next();

        Finder finder = new Finder();
        int index = finder.findIndexForString(searchPhrase);

        System.out.println(index);

    }

//    String storage;
//
//    public Finder(String storageString) {
//        this.storage = storageString;
//    }
//
//    public int findIndexForString(String input) {
//        return storage.indexOf(input);
//    }
//    public static void main(String[] args) {
//        Finder finder = new Finder("Мама Мыла Раму");
//        Finder secondFinder = new Finder("Мама Мыла Раму");
//
//        Scanner scanner = new Scanner(System.in);
//        String searchPhrase = scanner.next();
//
//        int index = finder.findIndexForString(searchPhrase);
//        System.out.println("Индекс в 1 строке: " + index);
//        int indexSecondFinder = secondFinder.findIndexForString(searchPhrase);
//        System.out.println("Индекс в 2 строке: " + indexSecondFinder);
//
//   }

}
