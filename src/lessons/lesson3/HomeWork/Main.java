package lessons.lesson3.HomeWork;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.TreeSet;



public class Main {
    public static void main(String[] args) {

    Skills java = new Skills("Java", 10);
    Skills c = new Skills("C++", 10);
    Skills html = new Skills("HTML", 10);
    Skills css = new Skills("CSS", 10);
    Skills javascript = new Skills("JavaScript", 10);
    Skills python = new Skills("Python", 10);
    Skills node = new Skills("Node.js", 10);

    List<Skills> skills1 = new ArrayList<>();
    List<Skills> skills2 = new ArrayList<>();
    List<Skills> skills3 = new ArrayList<>();
    List<Skills> skills4 = new ArrayList<>();

    skills1.add(java); skills1.add(c); skills1.add(css); skills1.add(html);
    skills2.add(java); skills2.add(python);
    skills3.add(java); skills3.add(c); skills3.add(css); skills3.add(javascript); skills3.add(node);
    skills4.add(java); skills4.add(python); skills4.add(node);

    HashSet<Person> set = new HashSet<>();

    for (Integer i = 1; i<11; i++) {
        if (i%2==0 && i%4==0) {
            Person person = new Person(i, "Name" + i, "Surname" + i, i + "email@mail.com", 20 + i, Sex.Male, skills1, new Car("car", 2000d + i, 200d + i));
            set.add(person);
        }
        if (i%2==0 && i%4!=0) {
            Person person = new Person(i, "Name" + i, "Surname" + i, i + "email@mail.com", 20 + i, Sex.Female, skills2, new Car("car", 2000d + i, 200d + i));
            set.add(person);
        }
        if (i%2!=0 && i%3==0) {
            Person person = new Person(i, "Name" + i, "Surname" + i, i + "email@mail.com", 20 + i, Sex.Male, skills3, new Car("car", 2000d + i, 200d + i));
            set.add(person);
        }
        if (i%2!=0 && i%3!=0) {
            Person person = new Person(i, "Name" + i, "Surname" + i, i + "email@mail.com", 20 + i, Sex.Female, skills4, new Car("car", 2000d + i, 200d + i));
            set.add(person);
        }


    }


        //TASK  REMOVE ALL MEN FROM HASHSET
//        Collection<Person> removeCandidates = new LinkedList<Person>();
//        for (Person person : set) {
//            if (person.sex == Sex.Male) {
//                removeCandidates.add(person);
//            }
//        };
//        set.removeAll(removeCandidates);
//        System.out.println(set.size());





        //TASK RETURN FROM THE BIGGEST SKILLS LIST
//        Collection<Person> persons = new LinkedList<Person>();
//        persons.addAll(set);
//        TreeSet<Person> treeSet = new TreeSet<>();
//        for (Person person : set) {
//            treeSet.add(person);
//        }
//        for (Person person : treeSet) {
//            System.out.println(person);
//        }













    }



}
