package task1_9;

import task1_8.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookShop {
    private String shopName;
    private ArrayList<Book> bookList = new ArrayList<>();

    public BookShop(String megamarket) {
    }

    void addBookToShopList(Book book) {
        bookList.add(book);
    }
    public String getShopName() {
        return shopName;
    }

    List<Book> getListByBookYear(int diapazonStart, int diapazonEnd) {
        List<Book> Booklist = new ArrayList<>();
        for (Book c : Booklist) {
            if (c.getYear() >= diapazonStart && c.getYear() <=diapazonEnd) {
                Booklist.add(c);
            }
        }
        return Booklist;
    }

    List<Book> getListByBookAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите автора");
        List<Book> Booklist = new ArrayList<>();
        for (Book c : Booklist) {
            if (c.getAuthor() == scanner.nextLine()) {
                Booklist.add(c);
            }
            else {
                System.out.println("нет такого автора");
            }
        }
        return Booklist;
    }

    List<Book> getListByPublishing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите издательство");
        List<Book> Booklist = new ArrayList<>();
        for (Book c : Booklist) {
            if (c.getPublishing() == scanner.nextLine()) {
                Booklist.add(c);
            } else {
                System.out.println("нет такого издательства");
            }
        }
        return Booklist;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}

