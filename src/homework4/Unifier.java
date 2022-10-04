package homework4;

public class Unifier {

    public String stringGlued(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        Unifier unifier = new Unifier();
        String strLove = "I love ";
        String strJava = "Java";
        String gluedStr = unifier.stringGlued(strLove, strJava);
        System.out.println(gluedStr);
    }
}
