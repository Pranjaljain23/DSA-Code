import java.util.HashSet;

public class HashSetImplimentation {
    public static void main(String[] args) {

        //Hashset only contains unique values

        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(2);
        hs.add(1);

        System.out.println(hs);

        if(hs.contains(2)){
            System.out.println("Contains 2");
        }
        if(hs.contains(3)) {
            System.out.println("Contains 3");
        }
    }
}
