package gr.aueb.ch12.point;

public class PointXYZApp {

    public static void main(String[] args) {

        PointXYZ p1 = new PointXYZ();
        PointXYZ p2 = new PointXYZ(10,15,55);
        PointXYZ p3 = new PointXYZ(500,456,862);

        p1.setX(15);
        p1.setY(25);
        p1.setZ(5);

        System.out.println(p1.pointToString());
        System.out.println(p2.pointToString());
        System.out.println(p3.pointToString());
    }
}
