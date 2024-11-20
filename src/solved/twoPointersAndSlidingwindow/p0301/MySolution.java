package solved.twoPointersAndSlidingwindow.p0301;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
배열의 크기가 아무리 길어봤자 100이니까.. 어떤 걸 써도 성능 문제 없을 것 같은데..
오름차순으로 정렬된 배열이 들어오니까, 그냥 끝에 더하면 됨, 그러면 LinkedList보단 ArrayList
두 배열이 주어진다고 해서 내가 꼭 두 배열로 받을 필요는 없잖아 ㅋㅋ
내 풀이는 맞았음, 강의 풀이 확인

코딩 인터뷰같은데서 이런 문제가 나오면, 단순히 문제를 풀 수 있냐가 아니라 투 포인터(스) 알고리즘을 아느냐 묻는 것이다.
아 투 포인터 알고리즘 학교 수업 어디선가 접해본 적 있다;
투 포인터 알고리즘 -> 정렬된 두 배열을 합쳐 새로운 정렬된 배열을 만들 때
*/

public class MySolution {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        int n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            arr1.add(kb.nextInt()); //O(1)
        }

        int m = kb.nextInt();
        for (int i = 0; i < m; i++) {
            arr1.add(kb.nextInt()); //O(1)
        }

        Collections.sort(arr1);  //그나마 이게 제일 영향 많을 듯
        for (Integer i : arr1) {
            System.out.print(i + " ");
        }
    }
}
