package CollectionsDemo;

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


        System.out.println("---------- HashSet MainDemo ----------");

        HashSetDemo firstSet = new HashSetDemo();
        firstSet.add(person1,person2,person3);
        firstSet.show();

        HashSetDemo secondSet = new HashSetDemo();
        secondSet.add(person2,person3,person4);
        secondSet.show();

        HashSetDemo setDemo = new HashSetDemo("Set of Intersection");
        setDemo.intersectionOfSets(firstSet.getPersonSet(),secondSet.getPersonSet());
        setDemo.show();

        setDemo = new HashSetDemo("Set of Union");
        setDemo.unionOfSets(firstSet.getPersonSet(),secondSet.getPersonSet());
        setDemo.show();

        setDemo = new HashSetDemo("Set of Difference");
        setDemo.diffOfSets(firstSet.getPersonSet(),secondSet.getPersonSet());
        setDemo.show();

        System.out.println("---------- HashMap MainDemo ----------");
        MapDemo.testHashMapFeatures();
        System.out.println("---------- TreeMap MainDemo ----------");
        MapDemo.testSortedTreeMapFeatures();
        System.out.println("---------- TreeMap & SortedSet MainDemo ----------");
        MapDemo.testSortedMapWithSortedSet();

    }
}
