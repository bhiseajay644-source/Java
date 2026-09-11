package differenttypeofexceptions.arrayindexoutofBonds;


class Demo{
    public void someMethod(){
        try {
            int[] array=new int[5];
            array[5] =20;
            System.out.println(array[5]);
        }finally {
            System.out.println("ArrayOutOfBondsException.");
        }
    }
}
public class ArrayIndexOutOfBond {
    public static void main(String[] args) {
        Demo demo=new Demo();
        demo.someMethod();
    }
}
