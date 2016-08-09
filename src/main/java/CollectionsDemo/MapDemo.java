package CollectionsDemo;

import java.util.*;

/**
 * Created by ahmetatalay on 08/08/16.
 */
public class MapDemo {


    public static void testSortedTreeMapFeatures(){
        TreeMap<String,Double> treeMap = new TreeMap<String,Double>();
        treeMap.put("Zara", new Double(3434.34));
        treeMap.put("Mahnaz", new Double(123.22));
        treeMap.put("Ayan", new Double(1378.00));
        treeMap.put("Daisy", new Double(99.22));
        treeMap.put("Qadir", new Double(-19.08));
        System.out.println("Hashmap.keyset(): " +treeMap.keySet());
        System.out.println("Hashmap.entrySet(): " +treeMap.entrySet());
        System.out.println("Hashmap.values(): " +treeMap.values());
        printWithHashMap(treeMap,"Printing with Tree Map according to its keys");

        NavigableMap<String,Double> reversedTreeMap =treeMap.descendingMap();
        printWithHashMap(reversedTreeMap,"Printing with Reverse Sorted Tree Map according to its keys");

        SortedMap<String,Double> sortedMapUntilSpecificKey = treeMap.headMap("Mahnaz",true);
        printWithHashMap(sortedMapUntilSpecificKey,"Printing Sorted Tree Map until specific Key");
    }

    public static void testSortedMapWithSortedSet(){
        SortedSet<Map.Entry<String, Double>> sortedset = new TreeSet<Map.Entry<String, Double>>(
                new Comparator<Map.Entry<String, Double>>() {
                    @Override
                    public int compare(Map.Entry<String, Double> e1,
                                       Map.Entry<String, Double> e2) {
                        return e1.getValue().compareTo(e2.getValue());
                    }
                });

        SortedMap<String, Double> myMap = new TreeMap<String, Double>();
        myMap.put("Zara", new Double(3434.34));
        myMap.put("Mahnaz", new Double(123.22));
        myMap.put("Ayan", new Double(1378.00));
        myMap.put("Daisy", new Double(99.22));
        myMap.put("Qadir", new Double(-19.08));
        sortedset.addAll(myMap.entrySet());

        System.out.println("SortedSet sorts hashmap according to its values!");
        for (Map.Entry entry : sortedset) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void testHashMapFeatures(){
        HashMap<String,Double> hashMap = new HashMap<String,Double>();
        hashMap.put("Zara", new Double(3434.34));
        hashMap.put("Mahnaz", new Double(123.22));
        hashMap.put("Ayan", new Double(1378.00));
        hashMap.put("Daisy", new Double(99.22));
        hashMap.put("Qadir", new Double(-19.08));

        System.out.println("Hashmap.keyset(): " +hashMap.keySet());
        System.out.println("Hashmap.entrySet(): " +hashMap.entrySet());
        System.out.println("Hashmap.values(): " +hashMap.values());
        printWithHashMap(hashMap,"Printing with Map");

        hashMap.remove("Daisy");
        printWithHashMap(hashMap,"Printing with Map with removed key");
    }

    public static void printWithHashMap(Map<String,Double> map,String message){
        System.out.println("\n"+message);
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }

    public static void printWithMapEntry(Map<String,Double> map){
        System.out.println("\nPrinting with Map.Entry");
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void printWithIterator(Map<String,Double> map){
        System.out.println("\nPrinting with iterator & Map.Entry");
        Iterator iterator =  map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


}
