package task1_7;

public class Triagle {
    private Point a, b, c;
    public Triagle (Point a1, Point b1, Point c1) {
        a = a1;
        b = b1;
        c = c1;
    }
    public double square () {
        double ab = Point.distance(a,b);
        double bc = Point.distance(b,c);
        double ac = Point.distance(a,c);
        double p = (ab + bc + ac) / 2;
        return Math.sqrt(p * (p-ab)*(p-bc)*(p-ac));
    }
    public double perimetr () {
        double ab = Point.distance(a,b);
        double bc = Point.distance(b,c);
        double ac = Point.distance(a,c);
        return ab + bc + ac;
    }
    public Point median_crossing () {
        return new Point((a.x + b.x + c.x) / 3, (a.y + b.y + c.y) / 3);
    }
    public void print() {
        System.out.println("a:");
        a.print();
        System.out.println("b:");
        b.print();
        System.out.println("c:");
        c.print();
    }
}
