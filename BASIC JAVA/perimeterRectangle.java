// WAP to find the perimeter of the rectangle

import java.util.Scanner;

public class perimeterRectangle {
    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter as requested");
        System.out.println();
        System.out.print("Length : ");
        int l = inp.nextInt();
        System.out.print("Breadth : ");
        int b = inp.nextInt();
        System.out.println();

        int p = 2 * (l + b);

        System.out.println("Perimeter : " + p);
    }
}
