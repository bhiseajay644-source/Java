import java.util.Scanner;

public class SeprateEvenAndOddElements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=scan.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the elements for array: ");
            array[i]=scan.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        int[] result1=new int[even];
        int[] result2=new int[odd];

        int evenIndex=0;
        int oddIndex=0;

        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                result1[evenIndex]=array[i];
                evenIndex++;
            }else{
                result2[oddIndex]=array[i];
                oddIndex++;
            }
        }
        System.out.println("Even array elements: ");
        for(int element: result1){
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println("Odd array elements: ");
        for(int element: result2){
            System.out.print(element+" ");
        }
        scan.close();
    }
}
