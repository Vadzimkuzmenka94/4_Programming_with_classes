package task2_4;

import task2_4.Service.*;
import task2_4.entity.Bill;
import task2_4.entity.Person;

import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        Bill bill = new Bill (2000, 55, true);
        Bill bill1 = new Bill(3000, 22, true);
        Bill bill2 = new Bill(4000, 11, true);
        Bill bill3 = new Bill(-2000, 44, true);
        Bill bill4 = new Bill(-3000, 99, true);
       ArrayList<Bill> billList = new ArrayList<>();
        billList.add(bill);
        billList.add(bill1);
        billList.add(bill2);
        billList.add(bill3);
        billList.add(bill4);
        System.out.println(billList);
        Person person = new Person("Вадим", "Кузьменко", billList);
        System.out.println(person);
        Collections.sort(billList, new SortBill());
        System.out.println(person);
        BlockBill blockBill = new BlockBill();
        blockBill.blockPersonBill(bill1, bill);
        System.out.println("после блокировки счётов bill и bill1 -->");
        System.out.println(person);
        SumBill sumBill = new SumBill();
        sumBill.sumAllBills(person);
        SumBillNegative sumBillNegative = new SumBillNegative();
        sumBillNegative.sumNegativeBills(person);
        SumBillPositive sumBillPositive = new SumBillPositive();
        sumBillPositive.sumPositiveBills(person);
        SearchBill searchBill = new SearchBill();
        searchBill.searchPersonBill(person);

    }
}
