package polymorhism.methodoverloadingusingstring;

class Person{
    public void display(String name){
        System.out.println("Name: "+name);
    }
    public void display(String name,int age){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class MethodOverloadingUsingString {
    public static void main(String[] args) {
        Person p=new Person();
        p.display("Sachin");
        p.display("Sachin",22);
    }
}
