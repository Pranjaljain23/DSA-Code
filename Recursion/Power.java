public class Power {

    //Time complexity = O(n)
    public static int calculatePower (int x, int n) {
        if (n == 0) {
            return 1;
        }
        
        return x * calculatePower(x, n - 1);   // x * x^(n - 1);
    }

    //Optimized code for Power function with Time Complexity of O(log n)
    public static int optimizedPower (int x, int n) {
        if (n == 0) {
            return 1;
        }

        //int halfPowerSq = optimizedPower(x, n/2) * optimizedPower(x, n/2);  --> Still gives O(n) because of multiple call of same function
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        //System.out.println(calculatePower(x, n));
        System.out.println(optimizedPower(x, n));
    }
}
