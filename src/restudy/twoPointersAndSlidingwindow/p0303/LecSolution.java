package restudy.twoPointersAndSlidingwindow.p0303;

import java.util.*;

public class LecSolution {

    public int solution(int n, int k, int[] arr) {

        int answer, sum = 0;
        //전처리, 미리 창문을 만들어 둠
        for (int i = 0; i < k; i++) sum += arr[i];

        answer = sum;

        //겉으로 보기엔 미끄러지는 창문이지만, 내부적으로는 새로운 하나를 더하고 이전 하나를 빼면서 구현
        for (int i = k; i < n; i++) {

            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer,sum);
        }

        return answer;
    }

    public static void main(String[] args){

        LecSolution T = new LecSolution();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }
}