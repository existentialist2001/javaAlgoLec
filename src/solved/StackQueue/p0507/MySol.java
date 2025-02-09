package solved.StackQueue.p0507;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/*
결과가 true or false 거나, YES or NO일 때 기본값은 실패했을 때를 경우로 설정해야한다.
이번은 YES or NO의 경우였는데, 기본값을 그냥 빈 문자열로 설정해서 한 번 실패했음

그리고 입력받는 거 자꾸 헷갈리는데, 문제가 되는 상황 하나만 기억하면 된다.
숫자를 입력받고 그 다음 바로 문자를 입력받을 때, 숫자를 입력받고 엔터문자가 남아있기 때문에 이걸 따로 버퍼에서 제거해줘야 한다는 것

그리고 Deque로 구현했지만 최대한 큐 함수들 사용함

강의 풀이는 내 풀이보다 더 효율적인 것 같음,
수강계획을 큐로 따로 만들지 않고 for문으로 바로 처리함
그리고 구조도, 기본값을 YES로 한 다음 조건 값을 NO로 했음, 사실 이건 어느 방법으로 해도 상관없는 듯
큐를 통해서 풀었다는 점은 동일

매번 느끼지만, 70%는 문제 이해, 예시 분석, 코드 고안에 투자하고 30%는 코드를 치는게 맞는 듯,
고민안하고 냅다 코드부터 치면 못풀어냄
*/

public class MySol {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String answer = "NO";

        String essential = kb.nextLine();
        String plan = kb.nextLine();

        Deque<Character> eQueue = new LinkedList<>();
        Deque<Character> pQueue = new LinkedList<>();

        for (char c : essential.toCharArray()) {
            eQueue.offer(c);
        }

        for (char c : plan.toCharArray()) {
            pQueue.offer(c);
        }

        //연산
        while (!pQueue.isEmpty()) {

            char c = pQueue.poll();

            if (eQueue.contains(c)) {
                if (eQueue.getFirst() == c) {
                    eQueue.poll();

                    if (eQueue.isEmpty()) {

                        answer = "YES";
                        break;
                    }
                }
                else {

                    answer = "NO";
                    break;
                }
            }
        }
        System.out.print(answer);
    }
}