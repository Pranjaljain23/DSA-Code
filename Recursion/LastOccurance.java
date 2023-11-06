public class LastOccurance {
    static int lastOccurance (int[] arr, int key, int i) {
        if (i < 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return lastOccurance(arr, key, i - 1);
    }
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 4, 6, 9, 2, 6, 8, 7};
        int key = 6;
        System.out.println("The last index of the key is: " + lastOccurance(arr, key, arr.length - 1));
    }
}
