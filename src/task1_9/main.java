package task1_9;


import task1_8.Customer;

import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        BookShop megamarket = new BookShop("Megamarket");
        megamarket.addBookToShopList(new Book("Война и мир", "Толстой", "Эксмо", 2000, 1200, "Жесткий", 200));
        megamarket.addBookToShopList(new Book("Пиковая Дама", "Пушкин", "Эксмо", 2002, 120, "Мягкий", 150));
        megamarket.addBookToShopList(new Book("Мертвые души", "Гоголь", "Эксмо", 1999, 12, "Жесткий", 200));
        megamarket.addBookToShopList(new Book("Убийство в восточном экспрессе", "Кристи", "Салют", 1998, 1200, "Жесткий", 150));
        megamarket.addBookToShopList(new Book("Десять негритят", "Кристи", "Кристи", 2012, 670, "Жесткий", 500));
        megamarket.addBookToShopList(new Book("Анна Каренина", "Толстой", "Салют", 2010, 10, "Мягкий", 201));
        megamarket.addBookToShopList(new Book("Джон-ячменное зерно", "Лондон", "Эксмо", 2021, 812, "Жесткий", 15));
        megamarket.addBookToShopList(new Book("Москва-Петушки", "Ерофеев", "Салют", 2012, 415, "Мягкий", 220));


        System.out.println("\nвывод книг после 2001 года:");
        List<Book> bookListSortYear = megamarket.getListByBookYear(2001);
        for (Book c : bookListSortYear) {
            System.out.println(c);
        }



       System.out.println("\nвывод книг автора - Толстой:");
        List<Book> bookListSortAuthor = megamarket.getListByBookAuthor("Толстой");
        for (Book c : bookListSortAuthor) {
            System.out.println(c);
        }

        System.out.println("\nвывод книг по издательству - Эксмо:");
        List<Book> listSortByPublishing = megamarket.getListByPublishing("Эксмо");
        for (Book c : listSortByPublishing) {
            System.out.println(c);
        }
        }
    }



