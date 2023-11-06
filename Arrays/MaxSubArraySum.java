public class MaxSubArraySum {

    static void printSubArrays (int[] arr) {

        //BRUTE FORCE
        //Time complexity = O(n^3)

            // int sum = 0;
            // int maxSum = Integer.MIN_VALUE;

            // for (int i = 0; i < arr.length; i++) { //start
            //     for (int j = i; j < arr.length; j++) { //end
            //         sum = 0;
            //         for (int k = i; k <= j; k++) { //element from start to end
            //             sum += arr[k];
            //         }
            //         if (sum > maxSum) {
            //             maxSum = sum;
            //         }
            //     }
            // }
            // System.out.println("Max sum is: " + maxSum);



        //PREFIX SUM ALGORITHM APPROCH
        //Time complexity = O(n^2)

            // int sum = 0;
            // int maxSum = Integer.MIN_VALUE;
            // int[] prefix = new int[arr.length];
                
            // prefix[0] = arr[0];
            // for(int i = 1; i < arr.length; i++) {
            //     prefix[i] = prefix[i - 1] + arr[i];
            // }
            
            // for(int i = 0; i < arr.length; i++) {
            //     int start = i;
            //     for (int j = i; j < arr.length; j++) {
            //         int end = j;
            //         sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
            
            //         if (maxSum < sum) {
            //             maxSum = sum;
            //         }
            //     }
            // }
            
            // System.out.println("Max sum is: " + maxSum);


        //KADANE'S ALGORITHM
        //Time complexity = O(n)
            int cs = 0;
            int ms = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                cs += arr[i];
                
                if(cs < 0) {
                    cs = 0;
                }
                ms = Math.max(ms, cs);
            }

            System.out.println("Max Sum is: " + ms);
    }
    
    public static void main(String[] args) {
        //int[] arr = {1, -2, 6, -1, 3};
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3}; //For Kadane's algorithm
        printSubArrays(arr);
    }
}
