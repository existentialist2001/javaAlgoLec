package restudy.StackQueue.p0506;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
일단 풀이 원리는 나와 동일한데, 코드 내공이 다름
Queue도 LinkedList로 구현하니, Deque쓰면 될 듯
offer,poll,peek,contains 함수들 잘 알아놓자
Deque를 스택으로 쓸 때는 어떤 함수들을, 큐로 쓸 때는 어떤 함수들을 이런 식으로 명확히하자
*/

public class LecSol {

    public int solution(int n, int k) {

        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) Q.offer(i);

        while (!Q.isEmpty()) {

            //내공..
            for (int i = 1; i < k; i++) Q.offer(Q.poll());
            Q.poll();
            if (Q.size() == 1) answer = Q.poll();
        }

        return answer;
    }

    public static void main(String[] args){

        LecSol T = new LecSol();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        System.out.println(T.solution(n, k));
    }
}
