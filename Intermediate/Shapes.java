abstract class Shape {
    abstract void area();  
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void area() {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle: " + result);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

public class Shapes {
    public static void main(String[] args) {

        Shape t = new Triangle(10, 5);
        Shape r = new Rectangle(4, 6);
        Shape c = new Circle(7);

        t.area();
        r.area();
        c.area();
    }
}
