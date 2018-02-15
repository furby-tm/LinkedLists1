import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkList singlyLinkList = new SinglyLinkList();
        System.out.print("Pick a list type:\n" +
                "1. singly-linked, no tail reference, non-circular, Integers\n" +
                "2. doubly-linked, tail reference, non-circular, Doubles\n" +
                "3. singly-linked, circular  (add tail or not, depending on what you implement), Strings\n" +
                "4. exit the program\n\n");
        String input = null;
        outerLoop:
        while (!(input = sc.nextLine()).isEmpty()) {

            if (Integer.valueOf(input) == 1) {
                System.out.print("\n1. build a list\n" +
                        "2. clear the list\n" +
                        "3. check if the list is sorted\n" +
                        "4. insert at head\n" +
                        "5. insert at tail\n" +
                        "6. or return to previous menu by hitting return\n\n");
                String input1 = null;

                while (!(input1 = sc.nextLine()).isEmpty()) {
                    int listSpecificMenuAnswer = Integer.valueOf(input1);
                    if (listSpecificMenuAnswer == 1) {
                        System.out.print("\nType a number followed by the return key. Hit return again to finish building.\n");
                        String input2 = null;
                        while (!(input2 = sc.nextLine()).isEmpty()) {
                            singlyLinkList.insertFirstLink(Integer.valueOf(input2));
                        }
                        singlyLinkList.display();
                        System.out.println("\n");
                    } else if (listSpecificMenuAnswer == 2) {
                        singlyLinkList.clear();
                    } else if (listSpecificMenuAnswer==3) {
                        
                    } else {
                        main(args);
                    }
                    System.out.print("1. build a list\n" +
                            "2. clear the list\n" +
                            "3. check if the list is sorted\n" +
                            "4. insert at head\n" +
                            "5. insert at tail\n" +
                            "6. return to previous menu\n\n");
                }
            }
        }
    }
}
