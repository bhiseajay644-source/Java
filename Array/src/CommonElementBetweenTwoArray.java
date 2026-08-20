import java.util.Scanner;

public class CommonElementBetweenTwoArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=scan.nextInt();
        int[] arr=new int[size];
        int[] array=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the elements for array: "+i);
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println("Enter the elements for array: "+i);
            array[i]=scan.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            boolean found=false;
            for(int j=0;j<array.length;j++){
                if(arr[i]==array[j]){
                    found=true;
                    break;
                }
            }
            if(found){
                System.out.print(arr[i]+" ");
            }
        }
        scan.close();
    }
}
