package task2_5.service;

import task2_4.entity.Bill;
import task2_5.entity.TouristVouchers;

import java.util.Comparator;

public class SortVouchers implements Comparator <TouristVouchers> {
    @Override
    public int compare(TouristVouchers o1, TouristVouchers o2) {
        if (o1.getTypeVouchers().equals(o2.getTypeVouchers())) {
            return 1;
        } else {
            return -1;
        }
    }
}



