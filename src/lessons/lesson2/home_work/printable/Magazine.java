package lessons.lesson2.home_work.printable;

public class Magazine implements Printable{
    public String name;
    public int pages;
    Boolean news;

    public Magazine(String name, int pages, Boolean news) {
        this.name = name;
        this.pages = pages;
        this.news = news;
    }

    public Magazine() {
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

    public Boolean getNews() {
        return news;
    }

    public void setNews(Boolean news) {
        this.news = news;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", news=" + news +
                '}';
    }

    public void print() {
        System.out.println(this);
    }
}
