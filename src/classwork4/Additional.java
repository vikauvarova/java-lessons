package classwork4;

public class Additional {
    int add(int first, int second) {
        return first + second;
    }

    int add(int first, short second) {
        return first + second;
    }

    int add(short first, int second) {
        return first + second;
    }

    public static void main(String[] args) {
        Additional additional = new Additional();
        System.out.println(additional.add(2,3));
        System.out.println(additional.add(3,4));
        System.out.println(additional.add(4,5));

//        String[] val = new String[];

    }
}