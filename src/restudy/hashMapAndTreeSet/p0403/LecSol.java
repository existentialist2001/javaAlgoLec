package restudy.hashMapAndTreeSet.p0403;

import java.util.*;

public class LecSol {

    public ArrayList<Integer> solution(int n, int k, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();
        //이걸 처음부터 끝까지 쭉 활용
        HashMap<Integer,Integer> HM = new HashMap<>();

        //전처리, 이 부분도 눈여겨 봐야함, 슬라이딩 윈도우를 하기 위한 전처리
        for (int i = 0; i < k - 1; i++) {
            HM.put(arr[i],HM.getOrDefault(arr[i],0) + 1);
        }

        //슬라이딩 윈도우, lt가 rt를 쫒아오는 방식
        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {

            HM.put(arr[rt],HM.getOrDefault(arr[rt],0) + 1);
            answer.add(HM.size());

            //왼쪽 제거 후 이동
            HM.put(arr[lt],HM.get(arr[lt]) - 1);
            if(HM.get(arr[lt]) == 0) HM.remove(arr[lt]);
            lt++;
        }
        return answer;
    }

    public static void main(String[] args){

        LecSol T = new LecSol();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x : T.solution(n, k, arr)) System.out.print(x+" ");
    }
}
