import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=scan.nextInt();

        int[] array=new int[size];

        for(int i=0;i<array.length;i++){
            System.out.println("Enter the elements for index: "+i);
            array[i]=scan.nextInt();
        }
        Arrays.sort(array);

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array[i]==array[j]){
                    for(int k=j;k<size-1;k++){
                        array[k]=array[k+1];
                    }
                    j--;
                    size--;
                }
            }
        }
        System.out.println("Array after removing elements: ");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        scan.close();
    }
}
