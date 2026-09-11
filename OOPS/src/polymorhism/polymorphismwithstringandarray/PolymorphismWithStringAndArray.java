package polymorhism.polymorphismwithstringandarray;

class Polymorphism{
    String name;
    String[] names;

    Polymorphism(String name,String[] names){
        this.name=name;
        this.names=names;
    }
    public void process(String names){
        System.out.println("Name Length: "+name.length());
    }

    public void process(String[] names){
        System.out.println("Number of Names: "+names.length);
    }
}

public class PolymorphismWithStringAndArray {
    public static void main(String[] args) {
        String[] arr={"Ravi","Sachin","Arun"};
        Polymorphism p=new Polymorphism("Sachin",arr);
        p.process("Sachin");

        p.process(arr);
    }
}
