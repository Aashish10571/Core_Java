// WAP to print all the prime numbers from 1 to n

import java.util.Scanner;

public class printPrimeNum {
    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = inp.nextInt();
        System.out.println();

        boolean flag;

        System.out.println("The prime numbers from 1 to " + num + " is");
        System.out.println();

        for (int i = 2; i <= num; i++) {
            flag = false;
            for (int j = 2; j <= num / 2; j++) {
                if (i != j)
                    if (i % j == 0) {
                        flag = true;
                        break;
                    }
            }
            if (!flag) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
