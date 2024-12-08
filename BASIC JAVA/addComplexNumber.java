import java.util.Scanner;

public class addComplexNumber {
    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter any two complex numbers");
        System.out.println();
        System.out.println("First complex number");
        System.out.println();
        System.out.print("Real : ");
        int r1 = inp.nextInt();
        System.out.print("Imaginary : ");
        int i1 = inp.nextInt();
        System.out.println();
        System.out.println("Second complex number");
        System.out.println();
        System.out.print("Real : ");
        int r2 = inp.nextInt();
        System.out.print("Imaginary : ");
        int i2 = inp.nextInt();
        System.out.println();

        System.out.println("The sum of the two complex number is : " + (r1 + r2) + " " + (i1 + i2) + "i");
    }
}
