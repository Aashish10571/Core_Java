// WAP to convert double int string

import java.util.Scanner;

public class doubleToString {
    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a double number : ");
        double num = inp.nextDouble();
        System.out.println();

        String str = num + "A";

        System.out.println(str);
    }
}
