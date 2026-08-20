import java.util.Scanner;

public class SortingArrayInDescendingOrder {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=scan.nextInt();
        int[] array=new int[size];

        for(int i=0;i<array.length;i++){
            System.out.println("Enter the elements: "+i);
            array[i]=scan.nextInt();
        }
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]>array[i]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("Array after desecending order: ");
        for(int element:array){
            System.out.print(element+" ");
        }

        scan.close();
    }
}
