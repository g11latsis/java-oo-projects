package gr.aueb.ch15;

import java.util.Locale;

public class PointApp extends PointUtil {
    public static void main(String[] args) {
        Point p = new Point(12);
        Point p2 = new Point2D(4, 6);
        Point p3 = new Point3D(5, 12, 6);

        System.out.printf(Locale.US, "%.2f%n", p.getDistanceFromOrigin());
        System.out.printf(Locale.US, "%.2f%n", p2.getDistanceFromOrigin());
        System.out.printf(Locale.US, "%.2f%n", p3.getDistanceFromOrigin());
        System.out.printf(Locale.US, "%.2f%n", distanceFromOrigin(p2));

    }

    public static void doMovePlus10(Point point) {
        point.movePlus10();
    }

    public static void doPrint(Point point) {
        System.out.println(point);
    }
}

