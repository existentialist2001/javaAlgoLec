package solved.StackQueue.p0506;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/*
스택 자료구조로는 안될 것 같다고 생각, 큐 자료구조 사용함
옛날에 학교에서 c언어로 자료구조 배웠을 때의 원형 큐가 떠오름
탈락이 아닌 왕자는 다시 맨 뒤에 넣어줌

처음에는 왕자 n명을 안만들어주고, 겉으로만 구현해주면 된다고 생각했는데, 실제로 구현함

Queue 자료구조를 사용할까 하다가, 자바 강의에서 스택이든 큐든 Deque 쓰라고 했어서 후자 씀
LinkedList니까, add함수를 사용하면 자동으로 제일 뒤에 넣어줌
앞에거 뺴는 건 removeFirst 사용함
*/

public class MySol {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();

        Deque<Integer> deque = new LinkedList<>();

        //실제 데이터 넣기, 연걸리스트니까 뒤에 넣어지는 거 맞음
        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        int cnt = 0;

        //뽑기 시작
        while (deque.size() != 1) {

                int prince = deque.removeFirst();
                cnt++;

                if (cnt == k) cnt = 0;
                else deque.add(prince);
        }

        System.out.print(deque.poll());
    }
}