package lessons.lesson3.HomeWork;

import java.util.Objects;

public class Skills {

    String title;
    Integer exp;

    @Override
    public String toString() {
        return "Skills{" +
                "title='" + title + '\'' +
                ", exp=" + exp +
                '}';
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Skills(String title, Integer exp) {
        this.title = title;
        this.exp = exp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skills skills = (Skills) o;
        return Objects.equals(title, skills.title) && Objects.equals(exp, skills.exp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, exp);
    }


}
