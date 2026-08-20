import java.util.Scanner;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=scan.nextInt();
        int[] array=new int[size];

        for(int i=0;i<array.length;i++){
            System.out.println("Enter the elements for the array: "+i);
            array[i]=scan.nextInt();
        }

        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]<smallest){
                secondSmallest=smallest;
                smallest=array[i];
            }else if(array[i]>smallest && array[i]<secondSmallest){
                secondSmallest=array[i];
            }
        }
        System.out.println("Smallest Element in Array: "+smallest);
        System.out.println("Second smallest element in Array: "+secondSmallest);
        scan.close();
    }
}
