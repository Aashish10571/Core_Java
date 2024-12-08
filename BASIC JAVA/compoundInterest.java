// WAP to find the compound interest

import java.util.Scanner;

public class compoundInterest {
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

        double ci = p * (Math.pow((1 + r / 100), t));

        System.out.println("Compound Interest : " + ci);
    }
}
