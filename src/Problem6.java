import CtCILibrary.CtCILibrary.AssortedMethods;

/**
 * Created by Bob_JIANG on 8/17/2015.
 */
public class Problem6 {
    public static boolean findElement(int[][] matrix, int target) {
        int row = 0, column = matrix[0].length - 1;
        while(row < matrix.length && column >= 0) {
            if(target == matrix[row][column]) {
                return true;
            }
            else if(target > matrix[row][column]) {
                row++;
            }
            else {
                column--;
            }
        }
        return false;
    }

    //Start from top left corner and you're basically forced to make the right move
    public static void main(String[] args) {
        int M = 10;
        int N = 5;
        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = 10 * i + j;
            }
        }

        AssortedMethods.printMatrix(matrix);

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                int v = 10 * i + j;
                System.out.println(v + ": " + findElement(matrix, v));
            }
        }

    }
}
