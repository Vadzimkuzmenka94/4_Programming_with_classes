package task2_5;

import task2_5.entity.TouristVouchers;
import task2_5.service.SearchVouchers;
import task2_5.service.SortVouchers;

import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        ArrayList<TouristVouchers>list = new ArrayList();
        TouristVouchers touristVouchers = new TouristVouchers("Relaxation","Plane", "AllInclusive", 7);
        TouristVouchers touristVouchers1 = new TouristVouchers("Relaxation","Plane", "AllInclusive", 10);
        TouristVouchers touristVouchers2 = new TouristVouchers("Relaxation","Plane", "Dinner", 10);
        TouristVouchers touristVouchers3 = new TouristVouchers("Relaxation","Bus", "AllInclusive", 7);
        TouristVouchers touristVouchers4 = new TouristVouchers("Relaxation","Bus", "AllInclusive", 7);
        TouristVouchers touristVouchers5 = new TouristVouchers("Excursion","Plane", "AllInclusive", 14);
        TouristVouchers touristVouchers6 = new TouristVouchers("Excursion","Plane", "Dinner", 14);
        TouristVouchers touristVouchers7 = new TouristVouchers("Excursion","Bus", "Dinner", 7);
        TouristVouchers touristVouchers8 = new TouristVouchers("Excursion","Bus", "AllInclusive", 7);
        TouristVouchers touristVouchers9 = new TouristVouchers("Excursion","Plane", "AllInclusive", 10);
        TouristVouchers touristVouchers10 = new TouristVouchers("treatment","Plane", "AllInclusive", 14);
        TouristVouchers touristVouchers11 = new TouristVouchers("treatment","Bus", "AllInclusive", 7);
        TouristVouchers touristVouchers12 = new TouristVouchers("treatment","Bus", "Dinner", 7);
        TouristVouchers touristVouchers13 = new TouristVouchers("treatment","Plane", "Dinner", 7);
        TouristVouchers touristVouchers14 = new TouristVouchers("treatment","Plane", "AllInclusive", 7);
        TouristVouchers touristVouchers15 = new TouristVouchers("Cruise","Plane", "AllInclusive", 7);
        TouristVouchers touristVouchers16 = new TouristVouchers("Cruise","Plane", "AllInclusive", 7);
        TouristVouchers touristVouchers17 = new TouristVouchers("Cruise","Plane", "AllInclusive", 7);
        TouristVouchers touristVouchers18 = new TouristVouchers("Cruise","Plane", "AllInclusive", 10);
        TouristVouchers touristVouchers19 = new TouristVouchers("Cruise","Plane", "Dinner", 7);
        TouristVouchers touristVouchers20 = new TouristVouchers("Cruise","Plane", "AllInclusive", 14);
         list.add (touristVouchers);
        list.add(touristVouchers1);
        list.add (touristVouchers2);
        list.add(touristVouchers3);
        list.add (touristVouchers4);
        list.add(touristVouchers5);
        list.add (touristVouchers8);
        list.add(touristVouchers7);
        list.add (touristVouchers9);
        list.add(touristVouchers10);
        list.add (touristVouchers11);
        list.add(touristVouchers12);
        list.add (touristVouchers13);
        list.add(touristVouchers14);
        list.add (touristVouchers15);
        list.add(touristVouchers16);
        list.add (touristVouchers17);
        list.add(touristVouchers18);
        list.add(touristVouchers19);
        list.add (touristVouchers20);
        list.add (touristVouchers6);
        System.out.println(list);
        System.out.println();
        Collections.sort(list, new SortVouchers());
        System.out.println(list);
        SearchVouchers searchVouchers = new SearchVouchers();
        searchVouchers.searchTouristVouchers(list);





    }
}
