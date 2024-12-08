// WAP to take two numbers input from the user and print the sum

import java.util.Scanner;

public class inputSum {
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

        System.out.println("The sum of the two numbers is : " + (num1 + num2));
    }
}
