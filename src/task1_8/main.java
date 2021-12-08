package task1_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        shop megamarket = new shop("Megamarket");
        megamarket.addCustomerToShopList(new Customer("Иван", "Иванов", "Иванович", "Бангладеш", 11_23_38_51, 11111));
        megamarket.addCustomerToShopList(new Customer("Игорь", "Петров", "Иванович", "Израиль", 11_33_44_55, 22222));
        megamarket.addCustomerToShopList(new Customer("Саша", "Сидоров", "Иванович", "Турция", 11_44_55_66, 33333));
        megamarket.addCustomerToShopList(new Customer("Виктор", "Дмитриев", "Иванович", "ОАЭ", 44_51_18_76, 44444));
        megamarket.addCustomerToShopList(new Customer("Леха", "Викторов", "Иванович", "Беларусь", 90_32_12_81, 55555));
        megamarket.addCustomerToShopList(new Customer("Павел", "Ростиславов", "Иванович", "Украина", 61_19_14_09, 66666));
        megamarket.addCustomerToShopList(new Customer("Егор", "Леонидов", "Иванович", "Украина", 77_56_19_23, 77777));
        megamarket.addCustomerToShopList(new Customer("Артем", "Барсуков", "Иванович", "Швеция", 88_99_01_98, 88888));
        megamarket.addCustomerToShopList(new Customer("Barak", "Obama", "Huseinovich", "UK", 89_10_14_22, 99999));
        megamarket.addCustomerToShopList(new Customer("Артем", "Вадимов", "Иванович", "Украина", 11_12_23_94, 00000));

        System.out.println("\nсортировка по имени:");
        List<Customer> listSortByName = megamarket.getListByName();
        for (Customer c : listSortByName) {
            System.out.println(c);
        }

        System.out.println("\nсортировка по фамилии:");
        List<Customer> listSortByName2 = megamarket.getListBySurname();
        for (Customer c : listSortByName2) {
            System.out.println(c);
        }

        System.out.println("\nвывод по диапозону счёта:");
        List<Customer> listSortByDiapazonCreditCard = megamarket.getListByDiapasonCreaditCard(22_33_44_55, 66_77_88_99);
        for (Customer c : listSortByDiapazonCreditCard) {
            System.out.println(c);
        }


    }
}



