// WAP to convert a character into integer

import java.util.Scanner;

public class characterIntoInteger {
    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a character : ");
        char ch = inp.next().charAt(0);
        System.out.println();

        int n;
        n = (int) ch;

        System.out.println(n);
    }
}
