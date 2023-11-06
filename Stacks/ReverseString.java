import java.util.Stack;

public class ReverseString {

    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++)  {
            s.push(str.charAt(i));
        }

        StringBuilder result = new StringBuilder("");

        while (!s.isEmpty()) {
            result.append(s.pop());
        }

        return result.toString();
    }
    
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverse(str));
    }
}
