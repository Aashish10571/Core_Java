/* WAP to print the following pattern
         1
        2 3 2
      3 4 5 4 3
    4 5 6 7 6 5 4
  5 6 7 8 9 8 7 6 5
*/

public class pyramidNumber {
    public static void main(String[] args) {
        System.out.println();

        int count = 0;

        for (int i = 1; i <= 5; i++) {
            for (int k = i; k <= 5; k++) {
                System.out.print("  ");
            }
            count = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            count--;
            for (int l = 1; l < i; l++) {
                count--;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
