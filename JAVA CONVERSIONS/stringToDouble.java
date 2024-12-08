// WAP to convert a string into double

import java.util.Scanner;

public class stringToDouble {
    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = inp.next();
        System.out.println();

        System.out.println(Double.parseDouble(str));
    }
}
