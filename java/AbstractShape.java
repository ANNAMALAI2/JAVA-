interface shape {
    double calculate();
}

abstract class abstractShape1 implements shape {
    protected double area;

    abstractShape1() {
        initialized();
    }

    public void display() {
        System.out.println("area of shape is " + calculate());
    }

    public abstract void initialized();

}

class circle extends abstractShape1 {

    double radius;

    circle(double radius) {
        super();
        this.radius = radius;
    }

    public void initialized() {
        radius = 1.0;
    }

    public double calculate() {
        area = Math.PI * radius * radius;
        return area;
    }
}

class rectangle extends abstractShape1 {
    double length;
    double width;

    rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void initialized() {
        length = 1.0;
        width = 1.0;

    }

    public double calculate() {
        area = length * width;
        return area;

    }
}

public class AbstractShape {
    public static void main(String[] args) {

        circle c = new circle(2.0);
        c.display();
        rectangle r = new rectangle(10, 20);
        r.display();
    }
}
