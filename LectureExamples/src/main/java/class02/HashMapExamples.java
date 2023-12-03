package class02;


import java.util.HashMap;

public class HashMapExamples {

    public static void main(String[] args) {

        /* CREATING A HASHMAP AND ADDING KEY/VALUE PAIRS */

        // TODO: Declare an empty HashMap, add key/value pairs, and print the map

        // Create a map, itemsToPack, that can hold String keys and Integer values
        HashMap<String, Integer> elvesInfo = new HashMap<>();

        // Add 4 key/value pairs to it representing the elves and their ages
        elvesInfo.put("Legolas", 2931);
        elvesInfo.put("Thranduil", 6500);
        elvesInfo.put("Elrond", 6500);
        elvesInfo.put("Arwen", 2901);

        // Print the map
        System.out.println(elvesInfo);

        /* HASHMAP METHODS */

        // TODO: Practice using different methods of the HashMap class

        // Print the size
        System.out.println(elvesInfo.size());
        // Print the entry set
        System.out.println(elvesInfo.entrySet());
        // Print just the key set
        System.out.println(elvesInfo.keySet());
        // Print just the values
        System.out.println(elvesInfo.values());
        // Check if it contains a certain key and print result
        System.out.println(elvesInfo.containsKey("Legolas"));
        // Check if it contains a certain value and print result
        System.out.println(elvesInfo.containsValue(6501));
    }
}
