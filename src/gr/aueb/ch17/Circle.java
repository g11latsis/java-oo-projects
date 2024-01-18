package gr.aueb.ch17;

import java.io.Serializable;
import java.util.Objects;

public class Circle extends AbstractShape implements ICircle, Serializable, Cloneable {
    private static final long serialVersionUID = 2L;
    private double radius;
    private  transient int hashCode;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    //Copy constructor
    public Circle(Circle circle) {
        this.radius = circle.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(radius, circle.radius) != 0) return false;
        return hashCode == circle.hashCode;
    }

    @Override
    public int hashCode() {
       return Objects.hash(radius);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
