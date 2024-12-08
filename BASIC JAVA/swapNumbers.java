// WAP to swap two numbers taken as input from the user

import java.util.Scanner;

public class swapNumbers {
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

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("First number : " + num1);
        System.out.println("Second number : " + num2);
    }
}
