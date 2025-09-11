import java.util.*;
interface Function{
   void calArea();
}

class Shape{
    double area;

    void display(){
        System.out.println("Area : "+ area);
    }
}

class Rectangle extends Shape implements Function{
    double length , breadth;


    Rectangle(double l , double w){
        length = l;
        breadth = w;
    }

    void calArea(){
        area = length*breadth;
        System.out.println("Area Of Rectangle : "+ area);
    }
}

class Triangle extends Shape implements Function{
    double base, height;

    Triangle(double b, double h){
        base = b;
        height = h;
    }

    void calArea(){
        area = 0.5*base*height;
        System.out.println("Area of Triangle : "+area);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Rectangle robj = new Rectangle(2,2);
        robj.calArea();
        Triangle tobj = new Triangle(4,4);
        tobj.calArea();
    }
}
