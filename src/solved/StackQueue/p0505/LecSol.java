package solved.StackQueue.p0505;

import java.util.*;

/*
스택에서 검사를 할 때, 스택을 검사할 수도 있고, 입력(input)을 검사할 수도 있음
이를 명확히 인지하지 못하고 있었다.
*/

public class LecSol {

    public int solution(String str) {

        int cnt = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(') stack.push('(');
            else {

                stack.pop();
                if (str.charAt(i - 1) == '(') cnt += stack.size();
                else cnt++;
            }
        }

        return cnt;
    }

    public static void main (String[] args) {

        LecSol T = new LecSol();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}
