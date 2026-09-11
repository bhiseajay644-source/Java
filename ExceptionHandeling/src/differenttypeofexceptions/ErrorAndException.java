package differenttypeofexceptions;

public class ErrorAndException {
    public static void main(String[] args) {
        try{
            int z=100/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // error in the programs
        try{
            int[] array=new int[Integer.MAX_VALUE];
        }finally{
            System.out.println("Error in the program");
        }
    }
}
