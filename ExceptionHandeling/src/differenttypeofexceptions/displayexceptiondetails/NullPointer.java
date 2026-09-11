package differenttypeofexceptions.displayexceptiondetails;

public class NullPointer {
    public static void method(){
        try{
            String str=null;
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
