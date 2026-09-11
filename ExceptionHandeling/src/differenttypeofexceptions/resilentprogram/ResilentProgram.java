package differenttypeofexceptions.resilentprogram;

public class ResilentProgram {
    public static void method(){
        try{
            System.out.println("Starting application");
            System.out.println("Attempting risky division..");
            int z=100/0;
        }catch(Exception e){
            System.out.println("Exception Handled: caught division by zero.");
        }

        System.out.println("Moving on... The program successfully reached the end!");
    }
}
