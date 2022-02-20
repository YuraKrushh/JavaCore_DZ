package lessons.lesson2.class_work;

import java.util.Objects;

public class Start2 {
    public static void main(String[] args) {

        Magazine magazine = new Magazine(false, 4, "Glossiness", 40, true);
        Comics comics = new Comics(false, 3, "Paper", 40, true, "Unknown");

        System.out.println(magazine);
        System.out.println(comics);



    }
}

 class Papyrus {
     Boolean papyrus;

     public Papyrus() {
     }

     public Papyrus(Boolean papyrus) {
         this.papyrus = papyrus;
     }

     public Boolean getPapyrus() {
         return papyrus;
     }

     public void setPapyrus(Boolean papyrus) {
         this.papyrus = papyrus;
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Papyrus papyrus1 = (Papyrus) o;
         return Objects.equals(papyrus, papyrus1.papyrus);
     }

     @Override
     public int hashCode() {
         return Objects.hash(papyrus);
     }

     @Override
     public String toString() {
         return "Papyrus{" +
                 "papyrus=" + papyrus +
                 '}';
     }
 }

class Book extends Papyrus {
    int size;

    public Book() {

    }

    public Book(Boolean papyrus, int size) {
        super(papyrus);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return size == book.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

    @Override
    public String toString() {
        return "Book{" +
                "size=" + size +
                '}';
    }
}

class Magazine extends Book{
    String cover;
    int pages;
    Boolean colors;

    public Magazine() {
    }

    public Magazine(Boolean papyrus, int size, String cover, int pages, Boolean colors) {
        super(papyrus, size);
        this.cover = cover;
        this.pages = pages;
        this.colors = colors;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Boolean getColors() {
        return colors;
    }

    public void setColors(Boolean colors) {
        this.colors = colors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return pages == magazine.pages && Objects.equals(cover, magazine.cover) && Objects.equals(colors, magazine.colors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cover, pages, colors);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "papyrus=" + papyrus +
                ", size=" + size +
                ", cover='" + cover + '\'' +
                ", pages=" + pages +
                ", colors=" + colors +
                '}';
    }
}

class Comics extends Book {
    String cover;
    int pages;
    Boolean games;
    String author;

    public Comics() {
    }

    public Comics(Boolean papyrus, int size, String cover, int pages, Boolean games, String author) {
        super(papyrus, size);
        this.cover = cover;
        this.pages = pages;
        this.games = games;
        this.author = author;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Boolean getGames() {
        return games;
    }

    public void setGames(Boolean games) {
        this.games = games;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Comics comics = (Comics) o;
        return pages == comics.pages && Objects.equals(cover, comics.cover) && Objects.equals(games, comics.games) && Objects.equals(author, comics.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cover, pages, games, author);
    }

    @Override
    public String toString() {
        return "Comics{" +
                "papyrus=" + papyrus +
                ", size=" + size +
                ", cover='" + cover + '\'' +
                ", pages=" + pages +
                ", games=" + games +
                ", author='" + author + '\'' +
                '}';
    }
}

