public class ReverseArray {

    static void reverse (int[] arr) {
        int size = arr.length;

        for(int i = 0; i <= size/2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }
    }

    static void print(int[] arr)  {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    } 

    public static void main(String[] args) {
        int[] arr = {2, 4, 6 , 8 ,10, 12};

        reverse(arr);
        print(arr);
    }
}
