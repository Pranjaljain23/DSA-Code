import java.util.ArrayList;

public class OperationsInAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //Add any element at a particular index
        list.add(1, 9); //--> list.add(1, 9) => list.add(index, element (integer value));

        //Add operations O(1)
        // list.add(5);
        // System.out.println(list);

        //Get operation O(1)
        // System.out.println(list.get(2));

        //Remove operation O(n)
        // list.remove(2);
        // System.out.println(list);

        //Set operation O(n)
        // list.set(2, 10);
        // System.out.println(list);
        
        //Contains operation O(n)
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));
    }
}