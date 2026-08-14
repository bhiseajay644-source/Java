import java.util.Scanner;

public class RotateMatrixBy90Degree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the rows and columns of the matrix:");
        int rows = scan.nextInt();
        int cols = scan.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Enter the elements for matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                array[i][j] = scan.nextInt();
            }
        }

        // Transpose
        int[][] transpose = new int[cols][rows];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                transpose[j][i] = array[i][j];
            }
        }

        // Reverse each row
        for(int i = 0; i < transpose.length; i++) {

            int left = 0;
            int right = transpose[i].length - 1;

            while(left < right) {
                int temp = transpose[i][left];
                transpose[i][left] = transpose[i][right];
                transpose[i][right] = temp;

                left++;
                right--;
            }
        }

        // Print rotated matrix
        System.out.println("Matrix after 90 Degree Clockwise Rotation:");

        for(int[] row : transpose) {
            for(int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }

        scan.close();
    }
}