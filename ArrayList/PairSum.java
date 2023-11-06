import java.util.ArrayList;

public class PairSum {

    public static boolean solution (ArrayList<Integer> list, int target) {

        //Brute force
        // for (int i = 0; i < list.size(); i++) {
        //     for (int j = i + 1; j < list.size(); j++) {
        //         if (list.get(i) + list.get(j) == target) {
        //             return true;
        //         }
        //     }
        // }

        // return false;


        //2 Pointer approach
        int leftptr = 0;
        int rightptr = list.size() - 1;

        while (leftptr != rightptr) {
            if (list.get(leftptr) + list.get(rightptr) == target) {
                return true;
            }

            if (list.get(leftptr) + list.get(rightptr) < target) {
                leftptr++;
            }
            else{
                rightptr--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //Arraylist is sorted for this question
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        System.out.println(solution(list, target));
    }
}
