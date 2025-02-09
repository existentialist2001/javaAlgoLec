package solved.twoPointersAndSlidingwindow.p0305;

import java.util.*;
/*
내 풀이는 가상의 배열이 있다고 가정하고 풀었는데,
강의 풀이는 실제 배열을 만들었고 특히 수학적 원리를 활용한 sliding window 알고리즘을 활용했다.
그래서 하나하나 모든 경우의 수를 다 따진 내 풀이와 다르게 검사 수가 줄어든 것 같다.(sum이 target보다 크다면
가장 작은 값을 빼는 게 맞음)

다만 이 풀이가 직관적인가? 의문이 든다.
같은 경우, 큰 경우, 작은 경우가 명시적으로 분리되어 있지 않고, 똑같은 if문도 두 번 중복되는데..
*/
public class LecSolution1 {

    public int solution(int n) {

        int answer = 0, sum = 0;
        int m = n / 2 + 1;

        int[] arr = new int[m];
        for (int i = 0; i < m; i++) arr[i] = i + 1;
        int lt = 0;

        for (int rt = 0; rt < m; rt++) {

            sum += arr[rt];
            if (sum == n) answer++;

            while (sum >= n) {

                //같거나 크다면(가장 작은 것을 빼줘야 그나마 가능성이 있으니) 왼쪽에서 한 칸 이동
                sum -= arr[lt++];
                //왼쪽에서 한 칸 이동해주었는데 같다면 카운팅
                if (sum == n) answer++;
            }
            //작다면 다시 위로 올라가서 하나 더 더해주고 검사
        }
        return answer;
    }

    public static void main(String[] args){

        LecSolution1 T = new LecSolution1();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.print(T.solution(n));
    }
}
