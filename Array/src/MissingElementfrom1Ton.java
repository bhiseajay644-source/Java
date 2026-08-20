import java.util.Arrays;
import java.util.Scanner;

public class MissingElementfrom1Ton {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=scan.nextInt();
        int[] array=new int[size];

        for(int i=0;i<array.length;i++){
            System.out.println("Enter the elements for the array: "+i);
            array[i]=scan.nextInt();
        }

        int largest=array[0];

        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                largest=array[i];

            }
        }
        Arrays.sort(array);
        for(int i=1;i<=largest;i++){
            boolean isFound=false;
            for(int j=0;j<array.length;j++){
                if(i==array[j]){
                    isFound=true;
                    break;
                }
            }
            if(!isFound){
                System.out.print(i+" ");
            }
        }

        scan.close();
    }
}
