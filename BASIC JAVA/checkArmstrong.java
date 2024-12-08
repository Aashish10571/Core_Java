// WAP to check if the given number is armstrong or not

import java.util.Scanner;

public class checkArmstrong {
    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = inp.nextInt();
        System.out.println();

        int temp = num;
        int newNum = 0;

        while (num > 0) {
            int last = num % 10;
            newNum = last * last * last + newNum;
            num = num / 10;
        }

        if (newNum == temp) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
