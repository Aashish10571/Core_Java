// WAP to convert hexadecimal number to decimal number

import java.util.Scanner;

public class hexadecimalToDecimal {
    static int hexadecimalToDecimalNum(String hexadecimal) {
        int decimalNum = 0;
        for (int i = 0; i < hexadecimal.length(); i++) {
            char ch = hexadecimal.charAt(i);
            int digit = Character.digit(ch, 16);
            decimalNum = decimalNum * 16 + digit;
        }
        return decimalNum;
    }

    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number : ");
        String hexadecimal = inp.next();
        System.out.println();

        System.out.println(hexadecimal + " to decimal is : " + hexadecimalToDecimalNum(hexadecimal));
    }
}
