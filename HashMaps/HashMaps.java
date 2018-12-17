package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    /*
     * HashMap is an unsynchronised version of hashtable
     * Default capacity is 16 and load factor of 0.75
     *
     * */
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("prateek", 10);
        map.put("sachin", 20);
        map.put("bitcoin", 12);

        System.out.println("Size of the map" + map.size());
        if (map.containsKey("prateek")) {
            Integer a = map.get("prateek");
            System.out.println("Corresponding hash value" + a);
        }
        map.clear();
//    To print the map
        print(map);
    }

    public static void print(Map<String, Integer> map) {
        if (map.isEmpty()) {
            System.out.println("map is empty");
        } else {
            System.out.println(map);
        }

    }
}