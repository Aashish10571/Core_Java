// WAP to convert binary number to octal number

import java.util.Scanner;

public class binaryToOctal {
    static int reverse(int n) {
        int newNum = 0;
        while (n > 0) {
            int last = n % 10;
            newNum = newNum * 10 + last;
            n = n / 10;
        }
        return newNum;
    }

    static int binaryToDecimal(int binaryNum) {
        int decimalNum = 0;
        int i = 0;
        while (binaryNum > 0) {
            int last = binaryNum % 10;
            decimalNum = (int) ((last * (Math.pow(2, i))) + decimalNum);
            binaryNum = binaryNum / 10;
            i++;
        }
        return decimalNum;
    }

    static int decimalToOctal(int n) {
        int decimalNum = binaryToDecimal(n);
        int octalNum = 0;
        while (decimalNum > 0) {
            int remainder = decimalNum % 8;
            octalNum = octalNum * 10 + remainder;
            decimalNum = decimalNum / 8;
        }
        octalNum = reverse(octalNum);
        return octalNum;
    }

    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter binary number : ");
        int binaryNum = inp.nextInt();
        System.out.println();

        System.out.println(binaryNum + " in octal is : " + decimalToOctal(binaryNum));
    }
}
