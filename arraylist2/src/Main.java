import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PointList test = new PointList();
        test.showPoints();
        ArrayList<Point> a = test.reversePoints();
        System.out.println(a);

        //test.getFirstPointInSecondQuadrant();
        //test.removeFirstPointWithinDistance10From00();
        //test.showPoints();
        //test.showIndexOfPoint00();
    }
}




