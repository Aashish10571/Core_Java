// WAP to find the GCD of two numbers

import java.util.Scanner;

public class gcdOfTwoNum {
    static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }

    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter any two numbers");
        System.out.println();
        System.out.print("First number : ");
        int num1 = inp.nextInt();
        System.out.print("Second number : ");
        int num2 = inp.nextInt();
        System.out.println();

        System.out.println("The gcd of two numbers is : " + findGCD(num1, num2));
    }
}
