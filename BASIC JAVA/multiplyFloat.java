// WAP to take two float numbers input from the user and print their sum

import java.util.Scanner;

public class multiplyFloat {
    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter any two numbers");
        System.out.println();
        System.out.print("First number : ");
        float num1 = inp.nextFloat();
        System.out.print("Second number : ");
        float num2 = inp.nextFloat();
        System.out.println();

        System.out.println("The product of two numbers is : " + (num1 * num2));
    }
}
