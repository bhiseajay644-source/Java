package differenttypeofexceptions.numberformatexception;

class Demo{
    public void someMethods(){
        try{
            String str="Ten";
            int r=Integer.parseInt(str);
            System.out.println(r);
        }finally{
            System.out.println("NumberFormatException is generated" );
        }
    }
}
public class NumberFormatExcep {
    public static void main(String[] args) {
        Demo demo=new Demo();
        demo.someMethods();
    }
}
