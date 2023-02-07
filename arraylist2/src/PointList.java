import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class PointList {
    private ArrayList<Point> points;


    public PointList() {
        points = new ArrayList<Point>();

        points.add(new Point(1, 2));
        points.add(new Point(-3, 4));
        points.add(new Point(-5, 6));
    }


    public PointList(ArrayList<Point> points) {
        this.points = points;
    }


    public void showPoints() {
        for (Point point : points) {
            System.out.println(point.toString());
        }
    }

    public ArrayList<Point> reversePoints() {
        ArrayList<Point> reversedPoints = new ArrayList<Point>();
        for (int i = points.size() - 1; i >= 0; i--) {
            reversedPoints.add(points.get(i));
        }
        return reversedPoints;
    }


    public Point getFirstPointInSecondQuadrant() {
        Iterator<Point> iterator = points.iterator();
        while (iterator.hasNext()) {
            Point point = iterator.next();
            if (point.getX() > 0 && point.getY() > 0) {
                return point;
            }
        }
        return null;
    }


    public void showIndexOfPoint00() {
        Point point00 = new Point(0, 0);
        for (int i = 0; i < points.size(); i++) {
            if (points.get(i).equals(point00)) {
                System.out.println("El índice del punto (0,0) es: " + i);
                return;
            }
        }
        System.out.println("ArrayList no contiene ningún punto (0,0)");
    }

    public void showIfPoint11IsInList() {
        Point point11 = new Point(1, 1);
        for (Point point : points) {
            if (point.equals(point11)) {
                System.out.println("El punto (1,1) está dentro de ArrayList");
                return;
            }
        }
        System.out.println("El punto (1,1) no está dentro de ArrayList");
    }


    public void removeFirstPointWithinDistance10From00() {
        Point point00 = new Point(0, 0);
        for (int i = 0; i < points.size(); i++) {
            if (points.get(i).distance(point00) < 10) {
                points.remove(i);
                return;
            }
        }
    }

    public void removePointsInFourthQuadrant() {
        Iterator<Point> iterator = points.iterator();
        while (iterator.hasNext()) {
            Point point = iterator.next();
            if (point.getX() < 0 && point.getY() < 0) {
                iterator.remove();
            }
        }
    }
}