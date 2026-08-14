import java.util.Scanner;

public class MultiplicationofTwodimensionalArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the matrix1:");
        int row=scan.nextInt();
        int col=scan.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.println("Enter the row and col size for matrix2:");
        int row1=scan.nextInt();
        int col1=scan.nextInt();
        int[][] arr1=new int[row1][col1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]=scan.nextInt();
            }
        }
        int[][] result=new int[row][col];
        if(row==col1){
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    for(int k=0;k<col1;k++){
                        result[i][k]=result[i][k]+arr[i][j]*arr1[j][k];
                    }
                }
            }
        }else{
            System.out.println("Multiplication of the matrix is not possible!");
        }
        System.out.println("The array after multiplication:");
        for(int[] r:result){
            for(int element:r){
                System.out.print(element+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
