/* WAP to print the following pattern
 * * * * * * * * *
   * * * * * * *
     * * * * *
       * * *
         *
 */

public class reversePyramidStar {
    public static void main(String[] args) {
        System.out.println();

        for (int i = 5; i >= 1; i--) {
            for (int k = i; k <= 5; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int l = 1; l < i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
