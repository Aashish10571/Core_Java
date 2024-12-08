/* WAP to print the following spiral rectangle pattern
 1  2  3  4 5
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9
*/

public class spiralRectangle {
    static void printSpiralRectangle(int size) {
        int row = 0, col = 0, boundry = size - 1, noOfMovement = size - 1;
        boolean flag = false;
        char move = 'R';
        int[][] matrix = new int[size][size];

        for (int i = 1; i <= size * size; i++) {
            matrix[row][col] = i;

            switch (move) {
                case 'U':
                    row -= 1;
                    break;
                case 'D':
                    row += 1;
                    break;
                case 'R':
                    col += 1;
                    break;
                case 'L':
                    col -= 1;
                    break;
            }

            if (i == boundry) {
                boundry += noOfMovement;
                if (!flag) {
                    flag = true;
                } else {
                    flag = false;
                    noOfMovement -= 1;
                }

                switch (move) {
                    case 'U':
                        move = 'R';
                        break;
                    case 'D':
                        move = 'L';
                        break;
                    case 'R':
                        move = 'D';
                        break;
                    case 'L':
                        move = 'U';
                        break;
                }
            }
        }


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printSpiralRectangle(5);
    }
}
