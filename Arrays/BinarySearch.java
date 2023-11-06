public class BinarySearch {

    static int binarySearch (int[] numbers, int key) {
        //Time Complexity = O(log n)
        
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if(numbers[mid] == key) { //found
                return mid;
            }
            if(numbers[mid] < key) { //right
                start = mid + 1;
            }
            else {      //left
                end = mid - 1;
            }
        }

        return -1; //not found
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 4;
        
        System.out.println("The element is at index: " + binarySearch(numbers, key));
    }
}
