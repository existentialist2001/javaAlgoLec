package solved.twoPointersAndSlidingwindow.p0306;

import java.util.ArrayList;
import java.util.Scanner;

//투 포인터 알고리즘은 그냥 변수 두 개로 배열을 탐색한다, 이렇게 보면 될 듯, 무조건 배열의 양쪽 끝에서 탐색을 시작해야 하는 게 아니다.
/*
두~세 번만에 맞췄다. 일단 너무 지저분하게 풀어서 꼭 강의 풀이 보면서 개선해야할 것 같고,
변수(포인터)를 늘려서 반복횟수(탐색횟수)를 줄이자는 게 투 포인터 알고리즘의 핵심 같은데,
이것 말고도 전체적으로 변수가 늘어나면 조건이 바뀔 때마다 초기화 작업을 해주어야 하는데, 쉽게 놓친다.
그리고 주어진 예시 얼렁뚱땅 분석하지말고,철저히 분석해야 한다. 뭔가 이 정도 했으면 쉽게 풀리겠지~ 하는 마인드가 있다.

강의 풀이에서 자주 등장하는 투 포인터 알고리즘(+sliding window 알고리즘)의 구조
for문 + rt
    while문 + lt
이렇게 lt가 rt를 따라가는 구조
아직 여기에 안익숙해서 연습 필요

강의 풀이는 sliding window를 적극적으로 활용한 것 같은데, 이번 풀이도 전 연산의 결과가 다음 연산의 결과에 영향을 미치는 거 같다.
그래서 내 풀이처럼 모든 경우를 하나하나 따지지 않아도 된다?
그런데 아직 직관적으로 느껴지진 않아서, 복습할 때 강의 풀이대로 따라가려고 연습해야할 듯(사실 강의 풀이 보면 이렇게 한다고 된다고?의 느낌이다.)
*/
public class MySolution {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(kb.nextInt());
        }

        int start = 0;
        int now = start;
        int max = Integer.MIN_VALUE;
        int count = 0;
        int chance = k;

        while (start < arr.size()) {

            //0이면
            if (arr.get(now) == 0) {

                if (chance > 0) {

                    chance--;
                    count++;
                    now++;
                }
                else {

                    chance = k;
                    //더이상 1의 가능성이 없으면 count를 0으로 초기화 해줘야함
                    count = 0;
                    start++;
                    now = start;
                }
            }

            //1이면
            else {

                count++;
                now++;
            }

            //한 타임 끝나고 최대값 갱신
            if (count > max) {
                max = count;
            }

            //최대값 검사하고 왔고, 인덱스 초과됐다는 건 가망없다는 뜻, 새로 갱신
            if (now >= arr.size()) {

                start++;
                now = start;
                chance = k;
                count = 0;
            }
        }

        System.out.println(max);
    }
}
