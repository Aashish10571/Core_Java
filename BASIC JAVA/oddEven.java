// WAP to check if the given number is odd or even

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = inp.nextInt();
        System.out.println();

        if (num % 2 == 0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
    }
}
