package solved.twoPointersAndSlidingwindow.p0305;

import java.util.*;
/*
수학적 원리
이미 연속되어 있는 것들에 빼고 남은 부분을 동등하게 배분해주니(연속된 것들 수만큼 나누어서 나누어 떨어진다면) 그 결과도 연속적일 것

전 연산 결과가 다음 연산 결과에 연결되는 풀이

앞으로 반복문 사용할 때 1. 종료 조건 2. 변수 갱신 꼭 두 개 생각하면서
*/
public class LecSolution2 {

    public int solution(int n) {

        //cnt는 연속된 자연수의 개수
        int answer = 0, cnt = 1;
        //1을 반복문 전에 미리 반영해주는 것
        n--;

        while (n > 0) {

            cnt++;
            //연속된 자연수들만큼 빼주고
            n = n - cnt;
            //남은 부분을 동등하게 배분할 수 있다면
            if (n % cnt == 0) answer++;
        }
        return answer;
    }

    public static void main(String[] args){

        LecSolution2 T = new LecSolution2();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.print(T.solution(n));
    }
}
