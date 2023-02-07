import java.util.ArrayList;
import java.util.*;

public class Nagusia {
    private List<Point> points;

    public Nagusia(){
        this.points = new ArrayList<>();
        this.points.add(new Point(3,6));
        this.points.add(new Point(-4,7));
        this.points.add(new Point(1,1));
        this.points.add(new Point(0,5));
        this.points.add(new Point(0,0));
        this.points.add(new Point(5,-8));
    }

    public void display(){
        for (Point point : this.points){
            System.out.println(point.toString());
        }
    }

    public List<Point> reversePoints() {
        List<Point> reversedPoints = new ArrayList<>();
        for (int i = points.size() - 1; i >= 0; i--) {
            reversedPoints.add(points.get(i));
        }

        return reversedPoints;

    }


    public Point getFirstPointInSecondQuadrant() {
        Iterator<Point> iterator = points.iterator();
        boolean aurkituta = false;
        Point aurkitutatakoPoint = null;

        while (iterator.hasNext() && !aurkituta) {
            Point point = iterator.next();
            if (point.getX() <= 0 && point.getY() >= 0) {
                aurkituta = true;
                aurkitutatakoPoint = point;
            }
        }

        if(!aurkituta){
            System.out.println("Ez dago punturik bigarren koadrantean.");
        }
        return aurkitutatakoPoint;
    }

    public int showIndexOfPoint00() {
        Point point00 = new Point(0, 0);
        boolean aurkituta = false;
        int i = 0;
        while(i<this.points.size() && !aurkituta){
            if(this.points.get(i).compareTo(point00) == 0);{

                aurkituta = true;

            }

            i++;
        }

        if(aurkituta){
            return i;
        } else{
            System.out.println("Ez dago (0,0) puntua.");
            return -1;
        }
    }

    public void oneOnePointExists(){
        if (this.points.indexOf(new Point (1,1))<0){
            System.out.println("Ez da (0,0) puntua aurkitu.");
        } else{
            System.out.println("Aurkituta ondorengo indizea");
        }


    }


}
