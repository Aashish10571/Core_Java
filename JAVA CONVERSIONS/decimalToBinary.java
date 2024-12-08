// WAP to convert decimal number to binary number

import java.util.Scanner;

public class decimalToBinary {
    static int reverseNum(int num) {
        int newNum = 0;
        while (num > 0) {
            int last = num % 10;
            newNum = newNum * 10 + last;
            num = num / 10;
        }
        return newNum;
    }

    static int decimalToBinaryNum(int decimalNum) {
        int binaryNUm = 0;
        while (decimalNum > 0) {
            int rem = decimalNum % 2;
            binaryNUm = binaryNUm * 10 + rem;
            decimalNum = decimalNum / 2;
        }
        binaryNUm = reverseNum(binaryNUm);
        return binaryNUm;
    }

    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a decimal number : ");
        int decimalNum = inp.nextInt();
        System.out.println();

        System.out.println(decimalNum + " in binary is : " + decimalToBinaryNum(decimalNum));
    }
}
