package lessons.lesson3.HomeWork;

import java.util.List;
import java.util.Objects;

public class Person implements Comparable<Person>{

    Integer id;
    String name;
    String surname;
    String email;
    Integer age;
    Sex sex;
    List <Skills> skills;
    Car car;

    public Person(Integer id, String name, String surname, String email, Integer age, Sex sex, List<Skills> skills, Car car) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.sex = sex;
        this.skills = skills;
        this.car = car;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(email, person.email) && Objects.equals(age, person.age) && sex == person.sex && Objects.equals(skills, person.skills) && Objects.equals(car, person.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, email, age, sex, skills, car);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", skills=" + skills +
                ", car=" + car +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        int result =  o.getSkills().size() - this.skills.size();
        if (result == 0 ) {
            return this.id - o.getId();
        }
        return result;
    }
}
