public class MergeSort {
    public static void mergeSort (int[] arr, int si, int ei) {
        //base
        if (si >= ei) {
            return;
        }

        //mid
        int mid = si + (ei - si) / 2; //Can also write (si + ei) / 2

        //Kaam
        mergeSort(arr, si, mid); //left part
        mergeSort(arr, mid + 1, ei);//right part
        merge(arr, si, mid, ei);
    }

    public static void merge (int[] arr, int si, int mid, int ei) {
        //left(0, 3) = 4 elements      right(4, 6) = 3 elements so, 6 - 0 + 1 = 7 elements
        int[] temp = new int[ei - si + 1];
        int i = si; //iterator for left part
        int j = mid + 1; //iterator for right part
        int k = 0; //iterator for temporary array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //remaining of the left part
        while (i <= mid) {
            temp[k++] = arr[i++];
            // temp[k] = arr[i];
            // i++;
            // k++;
        }

        //remaining of the right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for(k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }


    public static void printArray (int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}