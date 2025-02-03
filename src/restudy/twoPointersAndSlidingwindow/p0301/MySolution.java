package restudy.twoPointersAndSlidingwindow.p0301;

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

2회독
투 포인터 알고리즘으로 풀었음,
배열에 getFirst, removeFirst같은 함수를 사용하여 인덱스로 골치 아픈 문제를 어느정도 해결할 수 있어보임, 코드도 더 직관적이게 느껴짐
다만 강의 채첨 사이트 컴파일러가 버전이 낮아서 그런지 컴파일 에러가 떠서, get(0), remove(0) 을 사용했음

강의 풀이는 내 풀이와 다르게 실제 배열에서 원소를 제거해주지 않았음, 후처리도 훨씬 간단하게 함
반복문이 사실상 조건문을 내포하고 있다고 보면 될 듯 
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
