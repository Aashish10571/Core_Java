// WAP to check if the input character is vowel or consonant

import java.util.Scanner;

public class checkVowelConsonant {
    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a character : ");
        char ch = inp.next().charAt(0);
        System.out.println();

        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
            System.out.println("Vowel letter");
        } else {
            System.out.println("Consonant letter");
        }
    }
}
