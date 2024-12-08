// WAP to check if the given number is a neon number or not

import java.util.Scanner;

public class checkNeonNum {
    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = inp.nextInt();
        System.out.println();

        int tempNum = num;
        int newNum = 0;
        num = num * num;

        while (num > 0) {
            int last = num % 10;
            newNum = last + newNum;
            num = num / 10;
        }

        if (tempNum == newNum) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not Neon Number");
        }
    }
}
