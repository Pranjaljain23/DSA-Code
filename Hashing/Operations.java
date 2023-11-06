import java.util.*;

class Operations {
    public static void main(String[] args) {
        //Creating a hashmap
        HashMap<String, Integer> hm = new HashMap<>(); //Hashmap is unordered map
        
        //Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        //Get operation - O(1)
        System.out.println(hm.get("India"));

        System.out.println(hm.get("Indonesia")); //returns null if no key matched in hashmap

        //ContainsKey - O(1)
        System.out.println(hm.containsKey("US"));       //true
        System.out.println(hm.containsKey("Bhutan"));   //false

        //Remove - O(1) 
        System.out.println(hm.remove("US"));
        
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty

        hm.clear();  // Clears/Empty the complete hashmap in once
        
        System.out.println(hm.isEmpty());
    }
}