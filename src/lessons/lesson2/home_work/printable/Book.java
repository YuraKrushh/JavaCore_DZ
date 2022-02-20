package lessons.lesson2.home_work.printable;

import java.util.Objects;

public class Book implements Printable{
    public String name;
    public int pages;
    public String author;

    public Book() {
    }

    public Book(String name, int pages, String author) {
        this.name = name;
        this.pages = pages;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                '}';
    }
    @Override
    public void print() {
        System.out.println(this);
    }
}
