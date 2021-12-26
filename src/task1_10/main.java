/*10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
        и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
        методами. Задать критерии выбора данных и вывести эти данные на консоль.
        Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
        Найти и вывести:
        a) список рейсов для заданного пункта назначения;
        b) список рейсов для заданного дня недели;
        c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/


        package task1_10;

import task1_9.Book;
import task1_9.BookShop;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Airport minsk2 = new Airport("Minsk-2");
        minsk2.addAirline(new Airline(1, "Пассажиркий", 20.31, "Понедельник", "Москва"));
        minsk2.addAirline(new Airline(2, "Грузовой", 10.32, "Вторник", "Гомель"));
        minsk2.addAirline(new Airline(3, "Пассажиркий", 22.33, "Понедельник", "Нью-Йорк"));
        minsk2.addAirline(new Airline(4, "Грузовой", 19.15, "Понедельник", "Москва"));
        minsk2.addAirline(new Airline(5, "Пассажиркий", 02.35, "Пятница", "Кобрин"));
        minsk2.addAirline(new Airline(6, "Грузовой", 20.36, "Понедельник", "Нью-Йорк"));
        minsk2.addAirline(new Airline(7, "Пассажиркий", 19.25, "Суббота", "Москва"));
        minsk2.addAirline(new Airline(8, "Грузовой", 08.15, "Вторник", "Нью-Йорк"));




        System.out.println("\nвывод рейсов на понедельник:");
        List<Airline> AirlineSortByDay = minsk2.getListByNumberDayOfWeek("Понедельник");
        for (Airline c : AirlineSortByDay) {
            System.out.println(c);
        }

        System.out.println("\nвывод рейсов на понедельник после 19.30:");
        List<Airline> AirlineSortByDayAndTime = minsk2.getListByTimeAndDay("Понедельник", 19.30);
        for (Airline c : AirlineSortByDayAndTime) {
            System.out.println(c);
        }
        System.out.println("\nвывод рейсов в Нью-йорк");
        List<Airline> AirlineSortByDestination = minsk2.getListByDestination("Нью-Йорк");
        for (Airline c : AirlineSortByDestination) {
            System.out.println(c);
        }
    }
}



