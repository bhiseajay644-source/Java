import java.util.Locale;

class Test{
    public void someMethods(){
        int[] arr=new int[5];
        try{
            arr[5]=21;
            arr[1]=13;
            System.out.println(arr[5]);
            System.out.println(arr[1]);
            String str=null;
            System.out.println(str.toUpperCase());
        }
        finally {
            System.out.println("Finally i am here..");
        }
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
    Test t=new Test();
    try{
        t.someMethods();
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
    }
}
