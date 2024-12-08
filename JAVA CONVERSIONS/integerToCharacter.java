// WAP to convert integer into character

import java.util.Scanner;

public class integerToCharacter {
    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a integer number : ");
        int num = inp.nextInt();
        System.out.println();

        char ch = (char) num;

        System.out.println(ch);
    }
}
