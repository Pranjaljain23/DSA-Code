import java.util.*;

public class DuplicateParenthesis {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //closing bracket
            if (ch == ')') {
                int count = 0;

                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (count < 1) {
                    return true; //Duplicate found
                }
                else {
                    s.pop(); //removing opening bracket
                }
            }
            else {
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))"; //true because duplicate exist
    
        String str2 = "(a+b)"; //false because duplicate doesn't exist

        System.out.println(isDuplicate(str));

        System.out.println(isDuplicate(str2));
    }
}
