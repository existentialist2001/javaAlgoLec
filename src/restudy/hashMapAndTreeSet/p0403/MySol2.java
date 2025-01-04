package restudy.hashMapAndTreeSet.p0403;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MySol2 {
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


        HashSet<Integer> set = new HashSet<>();
        int start = 0;
        int lt = start;
        int rt = lt + k - 1;

        while (start <= n - k) {

            //set에 반영해주고, 각자 이동
            set.add(arr[lt++]);
            set.add(arr[rt--]);

            //서로 엇갈린다면
            if (lt > rt) {

                result.put(start,set.size());
                set.clear();
                start++;
                lt = start;
                rt = lt + k - 1;
            }
        }

        //출력
        for (int x : result.keySet()) {
            System.out.print(result.get(x) + " ");
        }
    }
}