import java.util.HashMap;
import java.util.Set;

public class IterationOnHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);


        //Iterate
        Set<String> Keys = hm.keySet();
        System.out.println(Keys);

        for (String k : Keys) {
            System.out.println("Key= " + k + ", Value= " + hm.get(k));
        }
    }
}
