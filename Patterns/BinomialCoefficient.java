class BinomialCoefficient {
    //Factorial without recursion by using loops
    static int factorial (int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f *= i;
        }
        return f;
    }

    static int bincoff(int n, int r){      // Binomial factorial formula is =  n! / (r! * (n - r)!)
        int result;
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        result = n_fact / (r_fact * nmr_fact);
        return result;
    }
    public static void main(String[] args){
        System.out.println(bincoff(5, 2));
    }
}