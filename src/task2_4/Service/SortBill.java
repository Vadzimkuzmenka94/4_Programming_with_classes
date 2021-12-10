package task2_4.Service;

import task2_4.entity.Bill;
import task2_4.entity.Person;

import java.util.Collections;
import java.util.Comparator;

public class SortBill implements Comparator <Bill> {


    @Override
    public int compare(Bill o1, Bill o2) {
        if (o1.getNumber() == o2.getNumber()) {
            return 0;
        } else if (o1.getNumber() < o2.getNumber()) {
            return 1;
        } else {
            return -1;
        }
    }
}




