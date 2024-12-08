// WAP to convert decimal number to hexadecimal number

import java.util.Scanner;

public class decimalToHexadecimal {
    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a decimal number : ");
        int decimalNum = inp.nextInt();
        System.out.println();

        System.out.println(decimalNum + " in hexadecimal is : " + Integer.toHexString(decimalNum));
    }
}
