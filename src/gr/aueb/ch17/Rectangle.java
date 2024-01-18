package gr.aueb.ch17;

import org.w3c.dom.css.Rect;

import java.io.Serializable;
import java.util.Objects;

public class Rectangle extends AbstractShape implements IRectangle, Serializable,Cloneable {
    private static final long serialVersionUID = 3L;
    private double width;
    private double height;
    private  transient int hashCode;

    public Rectangle(){}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Copy constructor
    public Rectangle(Rectangle rectangle){
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(width, rectangle.width) != 0) return false;
        return Double.compare(height, rectangle.height) == 0;
    }

    @Override
    public int hashCode() {
       return Objects.hash(width,height);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
