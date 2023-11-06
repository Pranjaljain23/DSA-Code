public class CharacterPattern {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 4;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
