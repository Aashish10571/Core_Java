/* WAP to print the following pattern
 * * * * *
 * * * *
 * * *
 * *
 *
*/

public class reverseTriangularStar {
    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
