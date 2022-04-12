package lessons.lesson3.ClassWork;


import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ZooClub {


        //TASK 3 DELETE PET FROM CLUB MEMBER
        public void deletePetFromMember(Person item, Map map, String petToDelete) {
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
        public void deleteClubMember(Person item, Map map) {
                map.remove(item);
        }


       //TASK5 DELETE ONE PET FROM ALL CLUB MEMBERS
       public void deletePetFromAll(Map map, String petToDelete) {
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
