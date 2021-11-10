package Lection05.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 03.11.2021
 */

public class Point {

    public int x;
    public int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "point x: " + x + " point y: " + y;
    }
}
