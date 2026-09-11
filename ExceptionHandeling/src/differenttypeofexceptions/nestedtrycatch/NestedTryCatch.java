package differenttypeofexceptions.nestedtrycatch;

import java.util.Scanner;

class NestedTryDemo{
    public void someMethods(int x,int y){
        try{
            int[] array=new int[5];
            array[5]=20;
            System.out.println(array[5]);
            try{
                int z=x/y;
                System.out.println(z);
            }catch(ArithmeticException ex){
                System.out.println(ex.toString());
            }
        }finally{

        }
    }
}
public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first: ");
        int first=scan.nextInt();
        System.out.println("Enter the second: ");
        int second=scan.nextInt();
        NestedTryDemo demo=new NestedTryDemo();
       try{
           demo.someMethods(first,second);
       }catch(ArrayIndexOutOfBoundsException e) {
           System.out.println(e.getMessage());
       }
        scan.close();
    }
}
