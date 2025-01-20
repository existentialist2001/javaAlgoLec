package restudy.hashMapAndTreeSet.p0405;

import java.util.*;

/*
문제 읽으면서 감조차 못잡고 너무 복잡하다고 생각했는데, 실은 문제를 제대로 안읽어서 그런 거였다. 입출력 예시까지
명확하게 파악하자.

강의 풀이처럼 삼중 for문을 구성하면 인덱스 에러가 날 것이라 생각했는데 아니었다. 반복문에도 사실상 조건문이 내재되어 있는 거니까.

TreeSet이 원소들을 정렬해주는 것은 알고 있었는데, 인덱싱까지 지원해줄 거라는 오개념을 가지고 있었다.
*/

public class LecSolution {

    public int solution(int[] arr, int n, int k) {

        int answer = -1;
        //이러면 내림차순으로 정렬함
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        //Tset.remove(143);
        //System.out.println(Tset.size());
        //System.out.println("first : "+ Tset.first());
        //System.out.println("last : "+ Tset.last());

        for (int x : Tset) {

            //System.out.println(x);
            cnt++;
            if (cnt == k) return x;
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
        System.out.println(T.solution(arr, n, k));
    }
}
