// WAP to convert string into long

import java.util.Scanner;

public class stringToLong {
    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = inp.next();
        System.out.println();

        System.out.println(Long.parseLong(str));
    }
}
