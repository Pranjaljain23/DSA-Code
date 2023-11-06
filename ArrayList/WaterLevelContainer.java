import java.util.ArrayList;

public class WaterLevelContainer {
    // public static int storeWater (ArrayList<Integer> height) {

    //     // BRUTE FORCE - O(n^2)
    //     int maxWater = 0;

    //     for (int i = 0; i < height.size(); i++) {
    //         for (int j = i + 1; j < height.size(); j++) {
    //             int ht = Math.min(height.get(i), height.get(j)); //water level will be equal to the minimum of 2 bars
    //             int width = j - i;    //index 2 - index 1 will give the width of the container
    //             int max = ht * width;
    //             maxWater = Math.max(max, maxWater);
    //         }
    //     }
        
    //     return maxWater;
    // }
    

    //Optimized approach
    //via 2 pointer approach
    public static int storeWater (ArrayList<Integer> height) {
        int maxWater = 0;
        int leftptr = 0;
        int rightptr = height.size() - 1;

        while (leftptr < rightptr) {
            int ht = Math.min(height.get(leftptr), height.get(rightptr));
            int width = rightptr - leftptr;
            int currWater = ht * width;
            maxWater = Math.max(currWater, maxWater);

            //update ptr
            if(height.get(leftptr) < height.get(rightptr)) {
                leftptr++;
            }
            else {
                rightptr--;
            }
        }

        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}
