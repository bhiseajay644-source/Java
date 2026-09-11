package abstractionencapsulation;

import abstractionin.onlinepaymentgateway.Receipt;

abstract class Shape{
    private String shapeName;

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    Shape(String shapeName){
        this.shapeName=shapeName;
    }
   abstract double calculateArea();
}

class Circle extends Shape{
    double radius;
    Circle(double radius,String shapeName){
        super(shapeName);
        this.radius=radius;
    }
    @Override
    double calculateArea() {
        double areaOfCircle=2.14*radius*radius;
        System.out.println(getShapeName()+" = "+areaOfCircle);
        return areaOfCircle;
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;

    Rectangle(double length,double breadth,String shapeName){
        super(shapeName);
        this.length=length;
        this.breadth=breadth;
    }

    double calculateArea(){
        double areaOfRectangle=length*breadth;
        System.out.println(getShapeName()+" = "+areaOfRectangle);
        return areaOfRectangle;
    }
}

class Triangle extends Shape{
    double base;
    double height;

    Triangle(double base,double height,String shapeName){
        super(shapeName);
        this.base=base;
        this.height=height;
    }

    double calculateArea(){
        double areaOfTriangle=0.5*base*height;
        System.out.println(getShapeName()+" = "+areaOfTriangle);
        return areaOfTriangle;
    }


}
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape[] shapes={
                new Circle(5,"Circle"),new Triangle(8,6,"Triangle"),new Rectangle(10,4,"Rectangle")
        };
        double totalArea=0;
        for(Shape shape: shapes){
            double area=shape.calculateArea();
            totalArea=totalArea+area;
        }


        System.out.println("Total Area: "+totalArea);
    }
}
