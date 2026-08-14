package array;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=scan.nextInt();
        int[] array=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the elements for index:"+(i+1));
            array[i]=scan.nextInt();

        }
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        scan.close();
    }
}