package CollectionsDemo;

import java.util.*;

/**
 * Created by ahmetatalay on 08/08/16.
 */
public class HashSetDemo {
    private Set<Person> personSet;

    public HashSetDemo(String message){
        personSet = new HashSet<Person>();
        System.out.println("---------- "+message+" ----------");
    }
    public HashSetDemo(Set<Person> set,String message){
        this.personSet = set;
        System.out.println("---------- "+message+" ----------");
    }

    public void add(Person... persons){
        for (Person person : persons){
            personSet.add(person);
        }
    }

    public void remove(Person person){
        personSet.remove(person);
    }

    public void clear(){
        personSet.clear();
    }

    public void show(){
        System.out.println("Set Persons:");
        for (Person person : personSet){
            System.out.println(person.toString());
        }
        System.out.println();
    }

    public void intersectionOfSets(Set<Person> set){
        personSet.retainAll(set);
    }

    public void unionOfSets(Set<Person> set){
        personSet.addAll(set);
    }


    public Set<Person> getPersonSet() {
        return personSet;
    }
}
