
import java.util.Scanner;

public class RemoveElementFromIndex {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=scan.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the elements for index:"+i);
            array[i]=scan.nextInt();

        }
        System.out.println("Enter the index:");
        int index=scan.nextInt();
        if(index<0 || index>size-1){
            System.out.println("Invalid index!");
        }else{
            for(int i=index;i<size-1;i++){
                array[i]=array[i+1];
            }
        }
        System.out.println("Array after the remove the element from the index:");
        for(int i=0;i<size-1;i++){
            System.out.print(array[i]+" ");
        }
        scan.close();
    }
}

