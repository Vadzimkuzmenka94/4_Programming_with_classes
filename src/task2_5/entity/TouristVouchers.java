package task2_5.entity;

import java.util.ArrayList;
import java.util.Objects;

public class TouristVouchers {
    String typeVouchers;
    String transport;
    String food;
    int days;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TouristVouchers that = (TouristVouchers) o;
        return days == that.days && Objects.equals(typeVouchers, that.typeVouchers) && Objects.equals(transport, that.transport) && Objects.equals(food, that.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeVouchers, transport, food, days);
    }

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
