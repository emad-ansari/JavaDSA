package datastructures;
import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing {
    public static void main(String[] args) {
        /*
         1. HashMap is an unordered datastructure
         2. It stores the element as key value pair
         3. Every time we print it , will display in different ordered.
         4. For insertion put() method is used
         5. there are two scenario
            (a) first when key exist -> it will update the value
            (b) second when key doesn't exist -> it will create a new key with the value
         6. Searching -> checking whether key exist in Map or not
            for this we have containsKey() method
         7. For get the value of a key, we have map.get(key) method
            Again there are two scenario
            1) when key exist -> simply return the value of key
            2) when not exist -> return null;
         8.

         */
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("China", 150);
        map.put("Gaza", 50);

        System.out.println(map);

        // Search -> means checking whether a particular key exist in Map or not
        if (map.containsKey("India")){
            System.out.println("key exist in Map");
        }
        else {
            System.out.println("key does not exist in map");
        }

        // Iteration on HashMap
        for (Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey() +  " : " + e.getValue() );

        }
        // storing the keys into set and then iterating over the set and accessing the value for the current key.
        Set<String> keys = map.keySet();
        for (String key: keys){
            System.out.println(key + " : " + map.get(key));
        }

        // Remove key and value from Map
        map.remove("China");
        System.out.println(map);




    }
}
