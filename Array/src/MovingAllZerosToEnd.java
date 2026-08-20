import java.util.Scanner;

public class MovingAllZerosToEnd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=scan.nextInt();
        int[] array=new int[size];

        for(int i=0;i<array.length;i++){
            System.out.println("Enter the elements for array: "+i);
            array[i]=scan.nextInt();
        }
        int index=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                array[index]=array[i];
                index++;
            }
        }
        while(index<array.length){
            array[index]=0;
            index++;
        }
        System.out.println("Array after the moving all zeros to end: ");
       for(int  i=0;i<array.length;i++){
           System.out.print(array[i]+" ");
       }
        scan.close();

    }
}
