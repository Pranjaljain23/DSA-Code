class LinearSearch {
    static int Search (int[] numbers, int key) {
        //Time Complexity = O(n)
        
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        int index = Search(numbers, key);
        if (index == -1) {
            System.out.println("NOT Found");
        }
        else {
            System.out.println("Key found at: " + index);
        }
    }
}