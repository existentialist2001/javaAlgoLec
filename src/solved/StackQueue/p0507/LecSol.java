package solved.StackQueue.p0507;

import java.util.*;

public class LecSol {

    public String solution(String need, String plan) {

        //기본 구조를 참으로 설정
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char x : need.toCharArray()) Q.offer(x);
        for (char x : plan.toCharArray()) {
            if(Q.contains(x)) {
                if (x != Q.poll()) return "NO";
            }
        }

        //필수 과목 몇 개 빠뜨린 경우
        if (!Q.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args){

        LecSol T = new LecSol();
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.println(T.solution(a, b));
    }
}
