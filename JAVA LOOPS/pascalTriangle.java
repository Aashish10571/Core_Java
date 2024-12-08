/* WAP to print the pascal triangle
          1
        1   1
      1   2   1
    1   3   3   1
  1   4   6   4   1
1   5   10   10   5   1
*/

public class pascalTriangle {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int k = i; k <= 5; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(factorial(i) / (factorial(i - j) * factorial(j)) + " ");
            }
            System.out.println();
        }
    }
}
