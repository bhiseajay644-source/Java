package polymorhism.methodoverloadingusingarrays;

class Parent{
    public void display(int[] values){
        for(int va:values){
            System.out.print(va+" ");
        }
    }
    public void display(String[] values){
        for(String str: values){
            System.out.print(str+" ");
        }
    }
}
public class MethodOverloadingUsingArrays {
    public static void main(String[] args) {
        int[] values={10,20,30};
        Parent p=new Parent();
        p.display(values);
        System.out.println();
        String[] value={"Java","Spring","Sql"};
        p.display(value);
    }
}
