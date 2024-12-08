// WAP to find the largest number from the three numbers taken as input from the user as input

import java.util.Scanner;

public class largestAmongThree {
    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter any three numbers");
        System.out.println();
        System.out.print("First : ");
        int num1 = inp.nextInt();
        System.out.print("Second : ");
        int num2 = inp.nextInt();
        System.out.print("Third : ");
        int num3 = inp.nextInt();
        System.out.println();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the greatest number");
        } else if (num2 > num3) {
            System.out.println(num2 + " is the greatest number");
        } else {
            System.out.println(num3 + " is the greatest number");
        }
    }
}
