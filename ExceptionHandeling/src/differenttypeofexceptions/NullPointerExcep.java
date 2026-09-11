package differenttypeofexceptions;


import java.util.Locale;

class Demo{
    public void someMethod(){
        try{
            String str=null;
            System.out.println(str.toUpperCase());
        }finally {
            System.out.println("NullPointerException is generated.");
        }
    }
}
public class NullPointerExcep {
    public static void main(String[] args) {
        Demo demo=new Demo();
        demo.someMethod();
    }
}
