// WAP to convert decimal number to octal number

import java.util.Scanner;

public class decimalToOctal {
    static int reverseNum(int num) {
        int newNum = 0;
        while (num > 0) {
            int last = num % 10;
            newNum = newNum * 10 + last;
            num = num / 10;
        }
        return newNum;
    }

    static int decimalToOctalNum(int decimalNum) {
        int octalNum = 0;
        while (decimalNum > 0) {
            int rem = decimalNum % 8;
            octalNum = octalNum * 10 + rem;
            decimalNum = decimalNum / 8;
        }
        octalNum = reverseNum(octalNum);
        return octalNum;
    }

    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a decimal number : ");
        int decimalNum = inp.nextInt();
        System.out.println();

        System.out.println(decimalNum + " to octal is : " + decimalToOctalNum(decimalNum));
    }
}
