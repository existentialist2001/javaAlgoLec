package solved.twoPointersAndSlidingwindow.p0302;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/*
이중 for문으로 풀었는데 시간 초과했고, 투 포인터 알고리즘으로는 못풀겠어서, 컬렉션 프레임워크 이용해서 풀었다.
아직 투 포인터 알고리즘 잘 모름.
투 포인터 알고리즘이, 단순히 배열 두 개에 이들을 가리키는 포인터 한개씩 있는 게 아니라,
정렬된 배열 두 개라고 봐야할 듯.
*/

public class MySolution {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        HashSet<Integer> a = new HashSet<>();

        for (int i = 0; i < n; i++) {
            a.add(kb.nextInt());
        }

        int m = kb.nextInt();
        HashSet<Integer> b = new HashSet<>();

        for (int i = 0; i < m; i++) {
            b.add(kb.nextInt());
        }

        //교집합 해주기
        a.retainAll(b);

        ArrayList<Integer> result = new ArrayList<>(a);
        Collections.sort(result);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
