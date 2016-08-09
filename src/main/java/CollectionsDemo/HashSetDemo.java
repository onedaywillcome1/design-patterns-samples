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
    public HashSetDemo(){
        this.personSet = new HashSet<Person>();
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

    public void intersectionOfSets(Set<Person> firstSet,Set<Person> secondSet){
        Set<Person> intersectSet = new HashSet<Person>(firstSet);
        intersectSet.retainAll(secondSet);
        personSet = intersectSet;
    }

    public void unionOfSets(Set<Person> firstSet, Set<Person> secondSet){
        Set<Person> unionSet = new HashSet<Person>(firstSet);
        unionSet.addAll(secondSet);
        personSet = unionSet;
    }

    public Set<Person> getPersonSet() {
        return personSet;
    }

    public void diffOfSets(Set<Person> firstSet, Set<Person> secondSet) {
        Set<Person> diffSet = new HashSet<Person>(firstSet);
        diffSet.removeAll(secondSet);
        personSet = diffSet;
    }

}
