// WAP to check weather the input year is leap year or not

import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter year : ");
        int year = inp.nextInt();
        System.out.println();

        if ((year % 400 == 0) || (year % 4 == 0) && (year != 100)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Non-Leap year");
        }
    }
}
