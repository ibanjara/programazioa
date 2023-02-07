import java.io.IOException;
import java.sql.SQLDataException;
import java.util.Objects;

public class Point implements Comparable <Point>{

    private int x;
    private int y;

    public Point (int x, int y){
        this.x = x;
        this.y = y;

    }

    @Override

    public String toString(){
        return "Point [x: " + this.x + " y: " + this.y + "]";
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;

    }


    @Override
    public int compareTo(Point point){
        if (this.x == point.getX() && this.y == point.getY()){
            return 0;
        } else if(this.x > point.getX() && this.y > point.getY()){

            return 1;
        } else{
            return -1;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.x, this.y);
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj instanceof Point){
            Point p = (Point)obj;
            return (this.x == p.getX() && this.y == p.getY());
        }
        return false;
    }
}
