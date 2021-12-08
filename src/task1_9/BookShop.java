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

    List<Book> getListByBookYear(int diapazonStart) {
        List<Book> list = new ArrayList<>();
        for (Book c : bookList) {
            if (c.getYear() >= diapazonStart) {
                list.add(c);
            }
        }
        return list;
    }

    List<Book> getListByBookAuthor(String AuthorEq) {
        List<Book> list = new ArrayList<>();
        for (Book c : bookList) {
            if (c.getAuthor() == AuthorEq) {
                list.add(c);
            }
        }
        return list;
    }

    List<Book> getListByPublishing(String Publish) {
        List<Book> list = new ArrayList<>();
        for (Book c : bookList) {
            if (c.getPublishing() == Publish) {
                list.add(c);
            }
        }
        return list;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}

