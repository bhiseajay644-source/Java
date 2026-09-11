package differenttypeofexceptions.ClassCastException;

class Demo{
    public void somemethod(){
        Object obj = new Integer(1001);
        String s = (String)obj;

    }
}
public class ClassCastException {
    public static void main(String[] args) {
        Demo demo=new Demo();
        demo.somemethod();
    }
}
