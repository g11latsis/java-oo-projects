package gr.aueb.ch17;

import java.io.Serializable;
import java.util.Objects;

public class Line extends AbstractShape implements ILine, Serializable,Cloneable {
    private static final long serialVersionUID = 1L;
    private double length;
    private  transient int hashCode;

    public Line() {
    }

    public Line(double length) {
        this.length = length;
    }
//    Copy constructor
    public Line(Line line){
        this.length = line.length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Line{" +
                "length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        return Double.compare(length, line.length) == 0;
    }

    @Override
    public int hashCode() {
      return Objects.hash(length);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
