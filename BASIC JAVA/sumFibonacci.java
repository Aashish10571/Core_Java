import java.util.Scanner;

public class sumFibonacci {
    static int sumOfFibonacci(int a, int b, int n, int sum) {
        if (n == 0) {
            return sum;
        }

        int c = a + b;

        return sumOfFibonacci(b, c, n - 1, sum + c);
    }

    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = inp.nextInt();
        System.out.println();

        num -= 1;

        System.out.println("Sum of the first " + num + " terms of the fibonacci series : " + sumOfFibonacci(0, 1, 2 * num, 1));
    }
}
