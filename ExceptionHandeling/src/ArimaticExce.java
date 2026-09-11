
class Methods{
    public void someMethod(){
        try{
            int r=100/0;
            System.out.println(r);
        }finally {
            System.out.println("Arithmetic exception is generated");
        }
    }
}

public class ArimaticExce {
    public static void main(String[] args) {
        Methods methods=new Methods();
        methods.someMethod();
    }
}
