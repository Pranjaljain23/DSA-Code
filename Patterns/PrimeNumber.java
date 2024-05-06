import java.util.*;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        boolean isPrime = true;
        if(n == 2) {
            System.out.println("2 is Prime");
        }
        else {
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) {
                    isPrime = false;
                }
            }
        }

        if(isPrime){
            System.out.println(n + " is Prime");
        }
        else {
            System.out.println(n + " is not Prime");
        }
    }
}