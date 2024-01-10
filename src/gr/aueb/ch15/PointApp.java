package gr.aueb.ch15;

public class PointApp extends PointUtil{
    public static void main(String[] args) {
        Point p = new Point(12);
        Point p2 = new Point2D(4, 6);
        Point p3 = new Point3D(5, 12, 6);

        System.out.println(p.getDistanceFromOrigin());
        System.out.println(p2.getDistanceFromOrigin());
        System.out.println(p3.getDistanceFromOrigin());

        System.out.println(distanceFromOrigin(p2));

    }

    public static void doMovePlus10(Point point) {
        point.movePlus10();
    }

    public static void doPrint(Point point) {
        System.out.println(point);
    }
}

