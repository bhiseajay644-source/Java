import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=scan.nextInt();
        int[] array=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter the elements for inedx:"+i);
            array[i]=scan.nextInt();
        }
        System.out.println("Enter the elements for remove:");
        int ele=scan.nextInt();
        int index=-1;
        for(int i=0;i<size; i++){
            if(array[i]==ele){
            index=i;
            }
        }
        if(index==-1){
            System.out.println("Element is not found in the array!");
        }else{
            for(int i=index;i<size-1;i++){
                array[i]=array[i+1];
            }
        }
        for(int i=0;i<size-1;i++){
            System.out.print(array[i]+" ");
        }
        scan.close();
    }
}
