package classwork7;

public class CW4 {
    public void testVal(String val) {
        if(val.length() == 0){
           return;
        }
        if(val.contains("туча")){
            System.out.println("нашли тучу");
        }
    }
}
