package differenttypeofexceptions;

public class BackTraceOfArithmaticException {
    public static void main(String[] args) {
        try{
            int z=100/0;
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
}
