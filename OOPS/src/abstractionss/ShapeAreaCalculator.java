package abstractionss;

abstract class Shape{
    abstract double calculateArea();
}
class Circle extends Shape{
    float radius;
    Circle(float radius){
        this.radius=radius;
    }
    @Override
    double calculateArea() {
        double pi=2.14;
        double area=radius*radius*pi;
        return area;
    }
}
class Rectangle extends Shape{
    int length;
    int breadth;

     Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    double calculateArea(){
        double area=length*breadth;
        return area;
    }
}
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape s=new Circle(5);
        double area=s.calculateArea();
        System.out.println(area);
        Shape sv=new Rectangle(10,4);
       double area2= sv.calculateArea();
        System.out.println(area2);
    }
}
