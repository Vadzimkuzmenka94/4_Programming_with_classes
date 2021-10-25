package task1_7;

import java.util.Scanner;

public class Point {
    public double x,y;
    public Point (double x1, double y1) {
        x = x1;
        y = y1;
    }
    public Point () {
        this (0,0);
    }
    public static double distance (Point a, Point b) {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        return Math.sqrt(dx * dx + dy + dy);
    }
    public void print () {
        System.out.println("x:" + x + "y" + y);
    }
    public void read (Scanner scanner) {
        System.out.println("x:");
        x = scanner.nextDouble();
        System.out.println("y:");
        y = scanner.nextDouble();
        System.out.println("с");

    }
}