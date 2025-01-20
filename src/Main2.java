import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String input = kb.nextLine();
        char[] arr = input.toCharArray();

        Queue<Character> queue = new LinkedList<>();

        for (char c : arr) {
            queue.add(c);
        }

        boolean result = true;
        int cnt = 0;
        boolean isMinusStream = false;

        while (queue.size() > 0) {

            char c = queue.poll();

            if (c == '(') {

                cnt++;

                if (isMinusStream) {

                    result = false;
                    break;
                }

            }

            else {

                cnt--;

                if (cnt < 0) {

                    result = false;
                    break;
                }
                else if (cnt > 0) {
                    isMinusStream = true;
                }
                else {
                    isMinusStream = false;
                }
            }
        }

        if (result) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}