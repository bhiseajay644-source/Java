package differenttypeofexceptions.arithmaticexception;

public class Test {

    public static void DivisionHandler(int x,int y){
        try{
            int c=x/y;
            System.out.println("Result : "+c);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
