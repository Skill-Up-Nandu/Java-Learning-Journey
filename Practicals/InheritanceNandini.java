import java.util.*;

// Interface for Area Calculation
interface Function{
   public double calArea();
}


// Base Class
class Shape{

    // displays the area 
    public void display(double area){
        System.out.println("Area : "+ area);
    }
}


// Derived class for Rectangle
class Rectangle extends Shape implements Function{
    double length , breadth;

    // constructor
    Rectangle(double l , double w){
        length = l;
        breadth = w;
    }

    // using interface fuction
    public double calArea(){
        double area = length*breadth;
        return area;
    }
}

// Second derived class for Triangle
class Triangle extends Shape implements Function{
    double base, height;

    // constructor
    Triangle(double bs, double h){
        base = bs;
        height = h;
    }

    // using interface function
    public double calArea(){
        double area = 0.5*base*height;
        return area;
    }
}

// main class
public class InheritanceNandini {

    public static void main(String[] args) {
        // Scanner object
        Scanner sc = new Scanner(System.in);

        // Object Creation for Rectangle
        System.out.println("Enter Lenght and Breadth of Rectangle : ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        Rectangle robj = new Rectangle(l , b);

        double rArea = robj.calArea();
        robj.display(rArea);

        // object creation for triangle class
        System.out.println("Enter Base and Height of Triangle : ");
        double bs = sc.nextDouble();
        double h = sc.nextDouble();

        Triangle tobj = new Triangle(bs , h);
        
        double tArea = tobj.calArea();
        tobj.display(tArea);
    }
}
