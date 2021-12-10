package task2_5.entity;

import java.util.ArrayList;

public class TouristVouchers {
    String typeVouchers;
    String transport;
    String food;
    int days;

    public TouristVouchers(String typeVouchers, String transport, String food, int days) {
        this.typeVouchers = typeVouchers;
        this.transport = transport;
        this.food = food;
        this.days = days;
    }

    public String getTypeVouchers() {
        return typeVouchers;
    }

    public void setTypeVouchers(String typeVouchers) {
        this.typeVouchers = typeVouchers;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "TouristVouchers{" +
                "typeVouchers='" + typeVouchers + '\'' +
                ", transport='" + transport + '\'' +
                ", food='" + food + '\'' +
                ", days=" + days +
                '}';
    }
}
