package project1;

public class jump_eg {

    public static void main(String[] args) {
        System.out.println("Break Example");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("The End");

        System.out.println("Break Example");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("The End");

//        System.out.println("Break Example");
//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                return;
//            }
//            System.out.println(i);
//        }
//        System.out.println("The End");

        System.out.println("Labeled break");
        lbl:
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 5; j++) {
                if (i == 5 && j == 3) {
                    break lbl;
                }
                System.out.print(j);
            }
            System.out.println();
        }
       
        System.out.println("Labeled continue");
        
        for (int i = 1; i < 10; i++) {
            lbl:
            for (int j = 1; j < 5; j++) {
                if (i == 5 && j == 3) {
                    continue lbl;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
