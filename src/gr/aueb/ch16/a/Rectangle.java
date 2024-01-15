package gr.aueb.ch16.a;

public class Rectangle extends AbstractShape implements ITwoDimensional{
    private double width;
    private double height;

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
