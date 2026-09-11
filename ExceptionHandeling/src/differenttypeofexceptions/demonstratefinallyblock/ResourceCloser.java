package differenttypeofexceptions.demonstratefinallyblock;

public class ResourceCloser {
    public static void resource(String str){
        try{
            int age=Integer.parseInt(str);
            System.out.println("Age of the person is : "+age);
        } catch (NumberFormatException e) {
            System.out.println("Error : invalid input");
        }finally {
            {
                System.out.println("Closing resources .");
            }
        }
    }
}
