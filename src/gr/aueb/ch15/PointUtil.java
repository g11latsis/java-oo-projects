package gr.aueb.ch15;

public class PointUtil {

    public static double distanceFromOrigin(Point point) {
        if (point instanceof Point2D) {
            Point2D point2D = (Point2D) point;
            return Math.sqrt(Math.pow(point2D.getX(), 2) + Math.pow(point2D.getY(), 2));
        } else if (point instanceof Point3D) {
            Point3D point3D = (Point3D) point;
            return Math.sqrt(Math.pow(point3D.getX(), 2) + Math.pow(point3D.getY(), 2) + Math.pow(point3D.getZ(), 2));
        } else {
            return Math.abs(point.getX());
        }
    }
}
