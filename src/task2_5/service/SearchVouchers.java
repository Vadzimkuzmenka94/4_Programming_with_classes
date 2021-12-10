package task2_5.service;

import task2_4.entity.Person;
import task2_5.entity.TouristVouchers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchVouchers {
    public void searchTouristVouchers (ArrayList <TouristVouchers> list) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите тип путевки");
        String a = scanner.nextLine();
        System.out.println("введите транспорт на которым вы хотите добраться");
        String b = scanner.nextLine();
        System.out.println("введите то, как бы вы хотели питаться");
        String c = scanner.nextLine();
        System.out.println("введите количество дней");
        int d = scanner.nextInt();

    for (i = 0; i < list.size(); i++) {
        if (list.get(i).getTypeVouchers().equals(a)
                & list.get(i).getDays() == d
                & list.get(i).getTransport().equals(b)
                & list.get(i).getFood().equals(c)) {
              ArrayList <TouristVouchers> newList = new ArrayList<>();
              newList.add(list.get(i));
            System.out.println("Идеальное предложение для Вас -->>>" + newList);
        }
    }
    }
    }


