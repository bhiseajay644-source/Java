import java.util.Scanner;

public class ThirdSmallestElement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=scan.nextInt();
        int[] array=new int[size];

        for(int i=0;i<array.length;i++){
            System.out.println("Enter the elements for array: "+i);
            array[i]=scan.nextInt();
        }

        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        int thirdSmallest=Integer.MAX_VALUE;

        for(int i=0;i<array.length;i++){
            if(array[i]<smallest){
                thirdSmallest=secondSmallest;
                secondSmallest=smallest;
                smallest=array[i];
            }else if(array[i]>smallest && array[i]<secondSmallest){
                secondSmallest=array[i];
            }else if(array[i]>secondSmallest && array[i]<thirdSmallest){
                thirdSmallest=array[i];
            }
        }
        System.out.println("Smallestt Element: "+smallest);
        System.out.println("Second Smallest: "+secondSmallest);
        System.out.println("Third smallest: "+thirdSmallest);
        scan.close();
    }
}
