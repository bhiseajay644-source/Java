import java.util.Scanner;

class Reverse{
    public static void reverse(int left,int right,int[] array){

        int temp=0;
        while(left<right){
            temp=array[left];
        array[left]=array[right];
        array[right]=temp;
        right--;
        left++;
    }
}
}
public class RotateArrayByPositions {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=scan.nextInt();
        int[] array=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter the elements for index:"+i);
            array[i]=scan.nextInt();
        }
        System.out.println("Enter the value of k position:");
        int k=scan.nextInt();

        Reverse.reverse(0,k-1,array);
        Reverse.reverse(k,size-1,array);
        Reverse.reverse(0,size-1,array);

        System.out.println("Array after rotation to the right side by k positonns:");
        for(int element:array){
            System.out.print(element+" ");
        }
    }
}
