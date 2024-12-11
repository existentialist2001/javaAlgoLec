package solved.twoPointersAndSlidingwindow.p0304;

import java.util.*;

public class LecSolution {

    public int solution(int n, int m, int[] arr) {

        int answer = 0, sum = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {

            sum += arr[rt];
            if (sum == m) answer++;

            //같거나 크다면, 왼쪽 것 하나를 빼준다.
            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){

        LecSolution T = new LecSolution();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}
