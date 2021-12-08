package task1_6;

import java.util.Scanner;

public class Time {
    private int hour, minute, second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите часы");
        if (scanner.nextInt() > 23) {
            setHour(0);
        } else {
            setHour(scanner.nextInt());
        }
        System.out.println("введите минуты");
        if (scanner.nextInt() > 59) {
            setMinute(0);
        } else {
            setMinute(scanner.nextInt());
        }

        System.out.println("введите секунды");
        if (scanner.nextInt() > 59) {
            setSecond(0);
        } else {
            setSecond(scanner.nextInt());
        }
    }

    public void setHour () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("сколько часов установить ?");
        if (scanner.nextInt() > 23) {
            setHour(0);
        } else {
            setHour(scanner.nextInt());
        }
    }
    public void setMinute () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("сколько минут установить ?");
        if (scanner.nextInt() > 59) {
            setMinute(0);
        } else {
            setMinute(scanner.nextInt());
        }
    }

    public void setSecond () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("сколько cекунд установить ?");
        if (scanner.nextInt() > 59) {
            setSecond(0);
        } else {
            setSecond(scanner.nextInt());
        }
    }
    public void addTime () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько часов добавить ?");
            setHour(hour + scanner.nextInt());
        if (hour > 23) {
            setHour(0);
        } else {
            setHour(hour);
        }

        System.out.println("Сколько минут добавить ?");
        setMinute(minute + scanner.nextInt());
        if (minute > 59) {
            setMinute(0);
        } else {
            setMinute(minute);
        }
        System.out.println("Сколько cекунд добавить ?");
        setSecond(second+ scanner.nextInt());
        if (second > 59) {
            setSecond(0);
        } else {
            setSecond(second);
        }
    }
    public void setHour(int hour) {
        this.hour = hour;
    }


    public void setMinute(int minute) {
        this.minute = minute;
    }



    public void setSecond(int second) {
        this.second = second;
    }
    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
