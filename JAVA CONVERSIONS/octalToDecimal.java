// WAP to convert octal number to decimal number

import java.util.Scanner;

public class octalToDecimal {
    static int octalToDecimalNum(int octalNum) {
        int decimalNum = 0;
        int p = 0;
        while (octalNum > 0) {
            int last = octalNum % 10;
            decimalNum = (int) (last * (Math.pow(8, p))) + decimalNum;
            octalNum = octalNum / 10;
            p++;
        }
        return decimalNum;
    }

    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a octal number : ");
        int octalNum = inp.nextInt();
        System.out.println();

        System.out.println(octalNum + " in decimal is : " + octalToDecimalNum(octalNum));
    }
}
