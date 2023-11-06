public class SelectionSort {
    static void Selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { //Array index 
            int minPos = i; //Let smallest at i
            for (int j = i + 1; j < arr.length; j++) { //Search in unsorted array only
                if (arr[minPos] > arr[j]) { //">" for ascending "<" for descending order
                    minPos = j;
                }
            }
            //swap after iterating the complete array and finding the smallest
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        Selection(arr);
        printArray(arr);
    }
}
