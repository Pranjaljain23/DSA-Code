public class Hollow_Rectangle {
    static void HollowRectangle(int row, int col){
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= col; j++) {
                //cell - (i, j)
                if(i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        HollowRectangle(5, 5);
    }
}
