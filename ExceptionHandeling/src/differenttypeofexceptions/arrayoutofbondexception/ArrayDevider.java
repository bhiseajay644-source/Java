package differenttypeofexceptions.arrayoutofbondexception;

public class ArrayDevider {
   public static void array(int index,int size,int divisor){
       int[] arr=new int[size];

       try{
            int y=arr[index]/divisor;
           System.out.println("Result : "+y);
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Error : Array index out of bound !");
       }catch(ArithmeticException e){
           System.out.println("Error : Cannot divide array element by zero !");
       }
   }
}
