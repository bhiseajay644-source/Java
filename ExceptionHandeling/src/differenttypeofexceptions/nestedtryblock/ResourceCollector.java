package differenttypeofexceptions.nestedtryblock;

public class ResourceCollector {
    public static void method(){
        try{
            int y=100/20;
            System.out.println("Result : "+y);
            try{
                int z=100/0;
                System.out.println("Result : "+z);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
