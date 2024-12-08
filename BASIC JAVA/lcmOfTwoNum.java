// WAP to find the LCM of two numbers

import java.util.Scanner;

public class lcmOfTwoNum {
    static int findGCD(int u, int v) {
        if (v == 0) {
            return u;
        }
        return findGCD(v, u % v);
    }

    static int findLCM(int a, int b) {
        int gcd = findGCD(a, b);
        return (a / gcd) * b;
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

        if (num2 > num1) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;
        }

        System.out.println("The Lcm of two numbers is : " + findLCM(num1, num2));
    }
}
