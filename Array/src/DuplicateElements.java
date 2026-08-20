import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=scan.nextInt();
        int[] array=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter the elements for the array: "+i);
            array[i]=scan.nextInt();
        }
        boolean[] visited=new boolean[array.length];

        for(int i=0;i<array.length;i++){
            if(visited[i]){
                continue;
            }
            boolean found=false;
            for(int j=i+1;j<array.length;j++){
                if(array[j]==array[i]){
                    visited[j]=true;
                    found=true;
                    break;
                }
            }
            if(found){
                System.out.println("Duplicate element: "+array[i]+" ");
            }
        }
        scan.close();
    }
}
