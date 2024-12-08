/* WAP to print the following pattern
 * * * * * * *
 * * * * * * *
 * * * * * * *
 * * * * * * *
 * * * * * * *
 * * * * * * *
 * * * * * * *
 */

public class squareStar {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
