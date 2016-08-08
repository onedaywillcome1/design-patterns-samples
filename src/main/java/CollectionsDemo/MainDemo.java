package CollectionsDemo;

import java.util.*;

/**
 * Created by ahmetatalay on 08/08/16.
 */
public class MainDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Ahmet",25);
        Person person2 = new Person("Can",22);
        Person person3 = new Person("Berk",28);
        Person person4 = new Person("Kamil",30);

        ArrayListDemo demo = new ArrayListDemo();
        demo.add(person1,person2,person3,person4);
        demo.show();
        Person newPerson = new Person("YILMAZ",40);
        demo.changePerson(person1,newPerson);
        demo.show();
        demo.remove(person3);
        demo.show();
        demo.clear();
        demo.show();

        LinkedListDemo demo2 = new LinkedListDemo();
        demo2.add(person1,person2,person3,person4);
        demo2.show();

        HashSetDemo peopleWhoKnowsEnglish = new HashSetDemo("Set of people who knows English");
        peopleWhoKnowsEnglish.add(person1,person2,person3);
        peopleWhoKnowsEnglish.show();

        HashSetDemo peopleWhoKnowsFrench = new HashSetDemo("Set of people who knows French");
        peopleWhoKnowsFrench.add(person2,person3,person4);
        peopleWhoKnowsFrench.show();


        HashSetDemo peopleWhoKnowFrenchAndEnglish = new HashSetDemo(peopleWhoKnowsEnglish.getPersonSet(),"Intersect of People who knows English and French");
        peopleWhoKnowFrenchAndEnglish.intersectionOfSets(peopleWhoKnowsFrench.getPersonSet());
        peopleWhoKnowFrenchAndEnglish.show();

        HashSetDemo wholePeople = new HashSetDemo(peopleWhoKnowsEnglish.getPersonSet(),"Union of People who knows English or French");
        wholePeople.unionOfSets(peopleWhoKnowsFrench.getPersonSet());
        wholePeople.show();


        Set<Integer> a = new TreeSet<Integer>(Arrays.asList(new Integer[]{0,2,4,5,6,8,10}));
        Set<Integer> b = new TreeSet<Integer>(Arrays.asList(new Integer[]{5,6,7,8,9,10}));
        //union
        Set<Integer> c = new TreeSet<Integer>(a);
        c.addAll(b);
        System.out.println(c);


//        Set<Person> unionOfSets = new HashSet<Person>(peopleWhoKnowsEnglish.getPersonSet());
//        Set<Person> diffOfSets = new HashSet<Person>(peopleWhoKnowsEnglish.getPersonSet());
//        Set<Person> reverseOfSets = new HashSet<Person>(peopleWhoKnowsEnglish.getPersonSet());

//        Set<Person> intersectOfSets = new HashSet<Person>(peopleWhoKnowsEnglish.getPersonSet());
//        intersectOfSets.retainAll(peopleWhoKnowsFrench.getPersonSet());
//        intersectOfSet
//        peopleWhoKnowsEnglish.intersectionOfSets(peopleWhoKnowsFrench.getPersonSet());
//        peopleWhoKnowsEnglish.show();


    }
}
