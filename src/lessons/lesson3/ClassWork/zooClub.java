package lessons.lesson3.ClassWork;


import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class zooClub {
        public static void main(String[] args) {

        Pet pet1 = new Pet("cat");
        Pet pet2 = new Pet("dog");
        ArrayList pets1 = new ArrayList<Pet>();
        pets1.add(pet1);
        pets1.add(pet2);

        Pet pet3 = new Pet("snake");
        ArrayList pets2 = new ArrayList<Pet>();
        pets2.addAll(pets1);
        pets2.add(pet3);

        Pet pet4 = new Pet("turtle");
        ArrayList pets3 = new ArrayList<Pet>();
        pets3.addAll(pets2);
        pets3.add(pet4);


        Person member1 = new Person("member1");
        Person member2 = new Person("member2");
        Person member3 = new Person("member3");


        //TASK 1 AND 2 ADDING MEMBERS AND THEIR PETS IN CLUB
        Map<Person, List<Pet>> club = new HashMap<>();
        club.put(member1, pets1);
        club.put(member2, pets2);
        club.put(member3, pets3);


        //Task 3 DELETE PET FROM CLUB MEMBER
//        System.out.println(club.get(member3));
//        deletePetFromMember(member3, club, "cat");
//        System.out.println(club.get(member3));


                //TASK 4 DELETE CLUB MEMBER
//                System.out.println(club.keySet());
//                deleteClubMember(member1,club);
//                System.out.println(club.keySet());


//      TASK 5 DELETE ONE PET FROM ALL CLUB MEMBERS
//                System.out.println("53 " + club.values());
//                deletePetFromAll(club, "dog");
//                System.out.println("55 " + club.values());














        }


        //TASK 3 DELETE PET FROM CLUB MEMBER
        public static void deletePetFromMember(Person item, Map map, String petToDelete) {
                ArrayList<Pet> list;
                list = (ArrayList<Pet>) map.get(item);
                for (Pet p : list){
                        if(p.name == petToDelete){
                                list.remove(p);
                                break;
                        }
                }
                map.replace(item,list);


        }

        //TASK 4 DELETE CLUB MEMBER
        public static void deleteClubMember(Person item, Map map) {
                map.remove(item);
        }


       //TASK5 DELETE ONE PET FROM ALL CLUB MEMBERS
       public static void deletePetFromAll(Map map, String petToDelete) {
               List<Person> list = new ArrayList<Person>(map.keySet());
                for (Person p : list ) {
                        ArrayList<Pet> petList;
                        petList = (ArrayList<Pet>) map.get(p);
                        for (Pet pet : petList){
                                if(pet.name.equals(petToDelete)){
                                        petList.remove(pet);
                                        break;
                                }
                        }

                }

       }

}
