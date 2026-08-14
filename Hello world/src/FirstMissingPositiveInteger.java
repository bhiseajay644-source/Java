import java.util.Scanner;

public class FirstMissingPositiveInteger {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=scan.nextInt();
        int[] array=new int[size];

        for(int i=0;i<array.length;i++){
            System.out.println("Enter the elements for the index:"+(i+1));
            array[i]=scan.nextInt();
        }
        int max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        for(int i=1;i<=max;i++){
            boolean found=false;
            for(int j=0;j<array.length;j++){
                if(array[j]==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println(i);
            }
        }


        scan.close();
    }
}
