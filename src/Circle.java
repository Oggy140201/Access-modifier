import java.awt.geom.Area;

public class Circle {
    private String color = "Red";
    private double radius = 1.0;
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }
    public Circle(){
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius *Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}
