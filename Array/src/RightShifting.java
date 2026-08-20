import java.util.Arrays;
import java.util.Scanner;

public class RightShifting {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=scan.nextInt();
        int[] array=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the elements for the array: "+i);
            array[i]=scan.nextInt();
        }

        System.out.println("Enter the rotations: ");
        int k=scan.nextInt();
        k=k%size;

        int temp = 0;
        for (int i = 0; i<k; i++){
            temp = array[size-1];
            for(int j = size-1; j>0; j--){
                array[j] = array[j-1];
            }
            array[0] = temp;
        }
        System.out.println(Arrays.toString(array));
        scan.close();
    }
}
