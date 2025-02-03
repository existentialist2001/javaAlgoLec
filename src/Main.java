import java.util.*;

public class Main {
    public static void main(String[] args) {

       Scanner kb = new Scanner(System.in);

       char[] input = kb.nextLine().toCharArray();
       Stack<Integer> stack = new Stack<>();

       for (char c : input) {

           if (Character.isDigit(c)) {

               stack.push(Character.getNumericValue(c));
           }
           else {

               int a = stack.pop();
               int b = stack.pop();

               if (c == '+') stack.push(b + a);
               if (c == '-') stack.push(b - a);
               if (c == '*') stack.push(b * a);
               if (c == '/') stack.push(b / a);
           }
       }

        System.out.println(stack.pop());
    }
}