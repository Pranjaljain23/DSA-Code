public class Floyds_Pyramid{
    public static void main(String[] args) {
        int n = 6, counter = 1;
        for(int i = 1; i <= n; i++){

            for(int j = 1; j<= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}