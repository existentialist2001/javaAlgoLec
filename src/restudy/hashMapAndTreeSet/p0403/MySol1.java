package restudy.hashMapAndTreeSet.p0403;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
두 번 다르게 풀어봤는데, 둘 다 시간초과로 틀림
특히 두번째는 왜 시간초과됐는지 분석 필요할 듯

아직 슬라이딩 윈도우로 배열 탐색하는 것 미흡하다.
rt를 lt가 쫒아오는 방식
그리고 투포인터가 슬라이딩 윈도우랑 동의어는 아니다, 슬라이딩 윈도우의 기반이 투포인터가 된다고 봐야한다.

강의 풀이는 Map의 key가 Set이라는 점, Map의 key 삭제를 이용했다.
*/
public class MySol1 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        HashMap<Integer,Integer> result = new HashMap<>();
        //map 초기화
        for (int i = 0; i < k; i++) {
            result.put(i,0);
        }

        int count = 0;
        HashSet<Integer> set = new HashSet<>();

        //계산
        for (int i = 0; i <= n - k; i++) {

            //한 단계 계산
            while (count < k) {

                int index = i + count;
                set.add(arr[index]);
                count++;
            }

            //한 단계 계산 마쳤으면 반영하고 초기화
            result.put(i,set.size());
            set.clear();
            count = 0;
        }

        //출력
        for (int x : result.keySet()) {
            System.out.print(result.get(x) + " ");
        }
    }
}