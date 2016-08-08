package CollectionsDemo;

import java.util.*;

/**
 * Created by ahmetatalay on 08/08/16.
 */
public class ArrayListDemo {

    private List<Person> personList;

    public ArrayListDemo() {
        this.personList = new ArrayList<Person>();
        System.out.println("---------- ArrayListDemo MainDemo ----------");
    }

    public void add(Person... persons){
        for (Person person : persons){
            personList.add(person);
        }
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void clear(){
        personList.clear();
    }

    public void changePerson(Person oldPerson, Person newPerson){
        int indexOfOldPerson = findIndex(oldPerson);
        personList.set(indexOfOldPerson,newPerson);
    }
    public int findIndex(Object object){
        return personList.indexOf(object);
    }

    public void show(){
        System.out.println("Listed Persons:");
        for (Person person : personList){
            System.out.println(person.toString());
        }
        System.out.println();
    }
}
