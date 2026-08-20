import java.util.Scanner;

public class MoveAllZeroToBeginning {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=scan.nextInt();
        int[] array=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter the elements for array: "+i);
            array[i]=scan.nextInt();
        }
        int left=0;
        int right=0;

        while(right<array.length){
            if(array[right]!=0){
                int temp=array[left];
                array[left]=array[right];
                array[right]=temp;
                left++;
            }
            right++;
        }
        for(int element: array){
            System.out.print(element+" ");
        }
        scan.close();
    }
}
