public class FirstOccurance {
    public static int firstOccurance (int[] arr, int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firstOccurance(arr, key, i + 1);
    }
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 4, 6, 9, 2, 0, 8, 7};
        int key = 6;
        System.out.println("The index of the key is: " + firstOccurance(arr, key, 0));
    }
}
