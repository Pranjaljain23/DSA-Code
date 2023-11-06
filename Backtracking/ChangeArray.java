public class ChangeArray {

    //A program just for the understanding of the backtracking using arrays

    public static void changeArr (int[] arr, int i, int val) {
        //base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        //recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1); //Function call
        arr[i] -=  2;  //Backtracking step
        //arr[i] = val - 2; --> This also works same as the above line because arr[i] and val are same at each call while returning
     }


    public static void printArr (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}