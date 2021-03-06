package task1_9;

import java.util.Objects;

public class Book {


    {
        idGenerator++;
    }
    private static int idGenerator = 0;
    private int id = idGenerator;
    String title;
    String author;
    String publishing;
    int year;
    int pages;
    String binding;
    int price;

    public static int getIdGenerator() {
        return idGenerator;
    }

    public static void setIdGenerator(int idGenerator) {
        Book.idGenerator = idGenerator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishing='" + publishing + '\'' +
                ", year='" + year + '\'' +
                ", pages=" + pages +
                ", binding='" + binding + '\'' +
                ", price=" + price +
                '}';
    }

    public Book(String title, String author, String publishing, int year, int pages, String binding, int price) {
        this.title = title;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.pages = pages;
        this.binding = binding;
        this.price = price;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && year == book.year && pages == book.pages && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publishing, book.publishing) && Objects.equals(binding, book.binding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, publishing, year, pages, binding, price);
    }
}
