public class FindPermutation {
    public static void findPermutation (String str, String ans) {
        //base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        //recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde" => "ab" + "de" = "abde"
            String NewStr = str.substring(0, i) + str.substring(i + 1); 
            //str.substring(i + 1) --> if we don't provide ending index it automatically take it as last index
            findPermutation (NewStr, ans + curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutation (str, "");
    }
}
