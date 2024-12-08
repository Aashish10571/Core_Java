// WAP to find the factorial of the given number

import java.util.Scanner;

public class factorial {
    static int findFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = inp.nextInt();
        System.out.println();

        System.out.println("Factorial : " + findFactorial(num));
    }
}
