package task2_4.Service;

import task2_4.entity.Bill;
import task2_4.entity.Person;

import java.util.Scanner;

public class SearchBill {
    public void searchPersonBill(Person person) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите номер счёта для поиска");
        for (i = 0; i < person.getBillList().size(); i++) {
            if (person.getBillList().get(i).getNumber() == scanner.nextInt()) {
                System.out.println("найден подходящий лицевой счёт" + person.getBillList().get(i));
            } else {
                System.out.println("введенного лицевого счёта не существует");
            }
        }
    }
}

