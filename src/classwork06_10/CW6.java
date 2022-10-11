package classwork06_10;

public class CW6 {

    public static boolean accepted(boolean hasRoof, boolean hasWall, int high) {
        return hasRoof && hasWall && high == 14;
    }

//    static boolean accepted(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Есть ли крыша?");
//        boolean hasRoof = scanner.nextBoolean();
//        System.out.println("Есть ли стена?");
//        boolean hasWall = scanner.nextBoolean();
//        System.out.println("Какая высота дома?");
//        int high = scanner.nextInt();
//        return hasRoof && hasWall && high == 14;
//    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Есть ли крыша?");
//        boolean hasRoof = scanner.nextBoolean();
//        System.out.println("Есть ли стена?");
//        boolean hasWall = scanner.nextBoolean();
//        System.out.println("Какая высота дома?");
//        int high = scanner.nextInt();4

        boolean hasRoof = true;
        boolean hasWall = false;
        int high = 1;

        if (accepted(hasRoof, hasWall, high)) {
            System.out.println("Можно сдавать дом");
        } else if (!hasRoof) {
            System.out.println("доложи крышу");
        } else if (!hasWall) {
            System.out.println("возведи стену");
        } else if (high != 14) {
            System.out.println("высота не соответствует");
        }

        if (hasRoof) { //крыша есть
            if (hasWall) {
                System.out.println("высота не ок");
            } else {
                System.out.println("стены нет");
            }
        } else {
            if (hasWall) {
                System.out.println("крыша не ок");
            } else {
                System.out.println("стены и крыши нет");
            }

//        if(accepted(hasRoof, hasWall, high)){
//            System.out.println("Можно сдавать дом");
//        } else {
//            System.out.println("Нельзя здавать");
//        }
//

//        if (!hasRoof){
//            System.out.println("доложи крышу");
//        }
//        if (!hasWall){
//            System.out.println("возведи стену");
//        }
//        if (high !=14){
//            System.out.println("высота не соответствует");
//        }


        }

    }
}