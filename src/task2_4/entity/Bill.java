package task2_4.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class Bill {
    private int amount;
    private int number;
    private boolean condition;

    public boolean isCondition() {
        return condition;
    }
    public void setCondition(boolean condition) {
        this.condition = condition;
    }
    public Bill(int amount, int number, boolean condition) {
        this.amount = amount;
        this.number = number;
        this.condition = condition;
    }
    @Override
    public String toString() {
        return "Bill{" +
                "amount=" + amount +
                ", number='" + number + '\'' +
                ", condition=" + condition +
                '}';
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}
