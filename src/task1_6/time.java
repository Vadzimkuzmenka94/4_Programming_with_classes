package task1_6;

import java.util.Scanner;

public class time {
    private int hour, minute, second;
    public time (int ho, int mi, int sec) {
        set_ho (ho);
        set_mi (mi);
        set_sec (sec);
    }
    public time (int ho, int mi) {
        this(ho, mi, 0);
    }
    public time () {
        this (0,0,0);
    }
    public void set_ho (int ho) {
        if (ho < 0 || ho > 23)
            ho = 0;
        else
            hour = ho;
    }
    public void set_mi (int mi) {
        if (mi < 0 || mi > 59)
            mi = 0;
        else
            minute = mi;
    }
    public void set_sec (int sec) {
        if (sec < 0 || sec > 59)
            sec = 0;
        else
            second = sec;
    }
    public int hours () {
        return hour;
    }
    public int minutes () {
        return minute;
    }
    public int seconds () {
        return second;
    }
    public void print () {
        System.out.println(toString());
    }
    public String toString () {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    static time read (Scanner scanner) {
        time Time = new time();
        System.out.println("часы:");
        Time.set_ho(scanner.nextInt());
        System.out.println("минуты:");
        Time.set_mi(scanner.nextInt());
        System.out.println("секунды:");
        Time.set_sec(scanner.nextInt());
        return Time;
    }
    public void add_sec (int second) {
        second += second;
        minute += second / 60;
        second = second %60;
        hour += minute / 60;
        minute = minute % 60;
        hour = hour %24;
    }
    public void add_minute (int minute) {
        add_sec(minute * 60);
    }
    public void add_hours (int hour) {
        add_sec (hour * 3600);
    }
}