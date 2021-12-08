package task1_4;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // организация ввода данных с консоли
        int n = 5;
        Train trains[] = new Train[n];
        trains[0] = new Train("Moskva", 1, "12:42");
        trains[1] = new Train("Petushki", 35, "12:45");
        trains[2] = new Train("Venediktovo", 2, "23:08");
        trains[3] = new Train("Erofeevo", 4, "12:42");
        trains[4] = new Train("Venechkino", 5, "05:44");
        while (true) {
            System.out.println(
                    "Выберете пункт меню:" + "\n" +
                            "1. сортировка по номерам поездов" + "\n" +
                            "2. вывод информации о поезде по номеру" + "\n" +
                            "3. сортировка по пункту назначения" + "\n" +
                            "4. вывод всех поездов" + "\n" +
                            "5. выход" + "\n"
            );
            int choice = scanner.nextInt();
            if (choice == 5)
                break;
            if (choice < 1 || choice > 5) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }
            switch (choice) {
                case 1:
                    Arrays.sort(trains, new Train.ByNumberComparator());
                    break;
                case 2:
                    System.out.println("введи индекс поезда: ");
                    int pos = scanner.nextInt();
                    if (pos < 0 || pos >= trains.length)
                        System.out.println("выбран неправильный номер элемента массива");
                    else
                        trains[pos].print();
                    break;
                case 3:
                    Arrays.sort(trains, new Train.ByDestinationAndTimeComparator());
                    break;
                case 4:
                    for (int i = 0; i < trains.length; ++i) {
                        System.out.print(i + " ");
                        trains[i].print();
                    }
                    break;
            }
        }
    }
}

