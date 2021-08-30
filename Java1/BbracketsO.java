
import java.util.Stack;
import java.util.Scanner;

public class BbracketsO {
     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          int t = sc.nextInt();

          while (t-- > 0) {
               Stack<Character> st = new Stack<Character>();
               String s = sc.next();
               for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '(' || s.charAt(i) == '{')
                         st.push(s.charAt(i));
                    else if (!st.isEmpty() && (((s.charAt(i) == ')' && st.peek() == '('))
                              || ((s.charAt(i) == '}' && st.peek() == '{'))))
                         st.pop();
                    else
                         st.push(s.charAt(i));
               }
               if (st.isEmpty())
                    System.out.println(1);
               else
                    System.out.println(0);

          }
     }
}