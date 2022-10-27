package homework10;

public class LetterSubstitution {
    public String changeLetter (String phrase, char changeThis, char toThis){
        int length = phrase.length();
        char letter = ' ';
        for (char i = 0; i < length; i++) {
            letter = phrase.charAt(i);
            if(letter == changeThis){
                letter = toThis;
            }
            System.out.print(letter);
        }
        return phrase;
    }
    public static void main(String[] args) {
        LetterSubstitution letterSubstitution = new LetterSubstitution();
        letterSubstitution.changeLetter("Я всегда делаю домашнее задание", 'е', 'Е');
    }
}
