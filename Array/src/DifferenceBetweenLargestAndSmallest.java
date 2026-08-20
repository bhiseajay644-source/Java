import java.util.Scanner;

public class DifferenceBetweenLargestAndSmallest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size =scan.nextInt();
        int[] array=new int[size];

        for(int i=0;i<array.length;i++){
            System.out.println("Enter the elements for index: "+i);
            array[i]=scan.nextInt();
        }

        int largest=array[0];
        int smallest=array[0];
        int difference=0;

        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                largest=array[i];
            }
            if(array[i]<smallest){
                smallest=array[i];
            }
        }
         difference=largest-smallest;
        System.out.println("The largest element: "+largest);
        System.out.println("The smallest element: "+smallest);
        System.out.println("The difference between the largest and smallest: "+difference);
        scan.close();
    }
}
