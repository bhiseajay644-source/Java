import java.util.Scanner;

public class ThirdLargestElement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=scan.nextInt();
        int[] array=new int[size];

        for(int i=0;i<array.length;i++){
            System.out.println("Enter the elements: "+i);
            array[i]=scan.nextInt();
        }

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        int thirdLargest=Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                thirdLargest=secondLargest;
                secondLargest=largest;
                largest=array[i];
            }else if(array[i]>secondLargest && array[i]<largest){
                secondLargest=array[i];
            }else if(array[i]>thirdLargest && array[i]<secondLargest){
                thirdLargest=array[i];
            }
        }
        System.out.println("The third largest element: "+thirdLargest);
        System.out.println("Second Largest element: "+secondLargest);
        System.out.println("Largest element: "+largest);
        scan.close();

    }
}
