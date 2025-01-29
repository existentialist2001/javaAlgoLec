package solved.StackQueue.p0502;

import java.util.*;

/*
get 함수가 있으니, 굳이 내 풀이처럼 역으로 바꾸는 걸 고려해서 Deque 자료형을 쓸 필요도 없었다.(size 함수와 함께 활용)
나는 일단 스택에 넣어주고 검사했는데, 강의 풀이는 검사하고 넣어줬다. 그런데 그러면 조건이 많아지는 거니 내 풀이가 더 좋다고 생각한다.
while문 내공 ㄷㄷ..
*/

public class LecSol {

    public String solution(String str) {

        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {

            if (x == ')') {
                while (stack.pop() != '(');
            }
            else stack.push(x);
        }

        for (int i = 0; i < stack.size(); i++) answer += stack.get(i);
        return answer;
    }

    public static void main(String[] args){

        LecSol T = new LecSol();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}
