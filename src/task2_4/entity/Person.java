package task2_4.entity;

import java.util.ArrayList;

public class Person {
    private String name;
    private String surname;
    ArrayList<Bill> billList;

    public ArrayList<Bill> getBillList() {
        return billList;
    }

    public void setBillList(ArrayList<Bill> billList) {
        this.billList = billList;
    }

    public Person(String name, String surname, ArrayList <Bill> billList) {
        this.name = name;
        this.surname = surname;
        this.billList = billList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", billList=" + billList +
                '}';
    }
}
