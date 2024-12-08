// WAP to add two binary strings

import java.util.Scanner;

public class addBinaryStrings {
    static String findSum(String x, String y) {
        int num1 = Integer.parseInt(x, 2);

        int num2 = Integer.parseInt(y, 2);

        int sum = num1 + num2;

        String result = Integer.toBinaryString(sum);

        return result;
    }

    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter any two binary string");
        System.out.println();
        System.out.print("First string : ");
        String str1 = inp.next();
        System.out.print("Second string : ");
        String str2 = inp.next();
        System.out.println();

        System.out.println("Sum of the two binary string is : " + findSum(str1, str2));
    }
}
