import java.util.Scanner;

public class MergingOfTwoArrays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of first array: ");
        int size=scan.nextInt();
        System.out.println("Enter the size of the second array: ");
        int size1=scan.nextInt();

        int[] arr=new int[size];
        int[] array=new int[size1];

        for(int i=0;i<size;i++){
            System.out.println("Enter the elements for array: "+i);
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<size1;i++){
            System.out.println("Enter the element for second array: "+i);
            array[i]=scan.nextInt();
        }
        int[] result=new int[size+size1];
        for(int i=0;i<size;i++){
            result[i]=arr[i];
        }
        for(int i=0;i<size1;i++){
            result[size+i]=array[i];
        }
        for(int element: result){
            System.out.print(element+" ");
        }
        scan.close();
    }
}
