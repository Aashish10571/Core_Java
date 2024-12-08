// WAP to find the simple interest

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter as requested");
        System.out.println();
        System.out.print("Principal : ");
        double p = inp.nextDouble();
        System.out.print("Time : ");
        double t = inp.nextDouble();
        System.out.print("Rate : ");
        double r = inp.nextDouble();
        System.out.println();

        double si = (p * t * r) / 100;

        System.out.println("Simple Interest : " + si);
    }
}
