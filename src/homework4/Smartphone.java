package homework4;

import java.util.Scanner;

public class Smartphone {
    static String hello = "Hello ";
    String hello(String hello, String name) {
        return hello + name;
    }

    boolean containsPdf (String folder){
        return folder.contains(".pdf");

    }

    public static void main(String[] args) {
        System.out.println("Enter your name");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Smartphone smartphone = new Smartphone();
        String smartphoneON = smartphone.hello(hello, name);
        System.out.println(smartphoneON);

        String folderDocuments = "Documents.pdf";
        String folderPic = "Pic.jpeg";

        System.out.println(smartphone.containsPdf(folderDocuments));
        System.out.println(smartphone.containsPdf(folderPic));
    }

}
