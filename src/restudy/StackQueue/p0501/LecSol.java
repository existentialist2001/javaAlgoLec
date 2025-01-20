package restudy.StackQueue.p0501;

/*
스스로 못풀었음

상태 관리 방법은 다양한 것 같다, 나는 boolean 자료형으로 했는데, 강의 풀이는 문제의 요구조건에 맞춰서
String 자료형으로 했다.
*/

import java.util.*;

public class LecSol {

    public String solution(String str) {

        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {

            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        if (!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args){

        LecSol T = new LecSol();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}