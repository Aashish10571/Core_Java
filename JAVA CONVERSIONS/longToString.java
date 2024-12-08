// WAP to convert long to string

import java.util.Scanner;

public class longToString {
    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a long number : ");
        long num = inp.nextLong();
        System.out.println();

        String str = num + "ABC";

        System.out.println(str);
    }
}
