package restudy.twoPointersAndSlidingwindow.p0302;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
또 틀렸다.

습관처럼 이중반복문으로 접근해서 공통원소를 찾고, 마지막에 정렬해주는 방법, 당연히 시간초과
배열 두 개니까 투 포인터 알고리즘 떠올림, 두 배열 모두 정렬한 후 탐색(여기까진 좋았음)
두 배열 길이 안맞는 문제 발생, 길이가 긴 배열을 기준으로 탐색해줌, 탐색 코드가 두 번 반복됐지만, 어쨌든 하나만 실행되고 투포인터 알고리즘이라 괜찮다 생각(주석처리)
근데도 틀림
뭔가 두 경우로 나누지말고, 하나로 통합해야한다는 생각이 들었지만 방법이 안떠오름
챗지피티
챗지피티 풀이 논리는 정렬된 상태니까, 두 원소가 다를 때 작은 부분을 + 해줘야한다라는 것, 나처럼 한 배열을 기준으로 같냐 다르냐를 비교할 것이 아니라
내 풀이가 어떤 케이스를 못잡았는 지 잘 모르겠지만, 챗지피티 풀이가 더 합리적인 것 같음
강의 풀이도 챗지피티 풀이랑 같은 논리임
*/

public class MySol2 {
    public static void main(String[] args) {

        List<Integer> result = new ArrayList<>();

       Scanner kb = new Scanner(System.in);

       int n = kb.nextInt();
       List<Integer> arr1 = new ArrayList<>();

       for (int i = 0; i < n; i++) {
           arr1.add(kb.nextInt());
       }

       int m = kb.nextInt();
       List<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            arr2.add(kb.nextInt());
        }

        //미리 정렬
        Collections.sort(arr1);
        Collections.sort(arr2);

        //공통원소 찾기
        int p1 = 0;
        int p2 = 0;

        //약간 거친 방법
        /*if (arr1.size() >= arr2.size()) {

            while (p1 < arr1.size()) {

                if (arr1.get(p1).equals(arr2.get(p2))) {

                    result.add(arr1.get(p1));
                    p1++;
                    p2++;
                }
                else p1++;
            }
        }
        else {
            while (p2 < arr2.size()) {

                if (arr2.get(p2).equals(arr1.get(p1))) {

                    result.add(arr2.get(p2));
                    p1++;
                    p2++;
                }
                else p2++;
            }
        }*/

        while (p1 < arr1.size() && p2 < arr2.size()) {

            if (arr1.get(p1).equals(arr2.get(p2))) {

                result.add(arr1.get(p1));
                p1++;
                p2++;
            } else if (arr1.get(p1) < arr2.get(p2)) {
                p1++;
            } else {
                p2++;
            }
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}