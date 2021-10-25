package task1_6;

public class main {
    public static void main(String[] args) {
        time a = new time (13, 24,14);
        time b = new time (50, 3);
        time c = new time ();
        a.print();
        b.print();
        c.print();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        a.set_ho(25);
        a.set_mi(45);
        a.set_sec(24);
        b.add_sec(50);
        c.add_sec(80);
        a.print();
        b.print();
        c.print();
        System.out.println("@@@@@@@@@@@@@@@@@@@");
        a.add_minute(20);
        b.add_hours(3);
        c.add_hours(33);
        a.print();
        b.print();
        c.print();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
    }
}