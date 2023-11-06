public class LargestNumber {
    static int getSmallest (int[] numbers) {
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }

        return smallest;
    }

    static int getLargest (int[] numbers) {
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
            
        }

        return largest;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 6, 3, 5};

        System.out.println("Smallest element is: " + getSmallest(numbers));
        System.out.println("Largest element is: " + getLargest(numbers));
    }
}
