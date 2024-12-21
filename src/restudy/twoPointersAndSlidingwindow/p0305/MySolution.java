package restudy.twoPointersAndSlidingwindow.p0305;

import java.util.Scanner;

//투 포인터 알고리즘은 그냥 변수 두 개로 배열을 탐색한다, 이렇게 보면 될 듯, 무조건 배열의 양쪽 끝에서 탐색을 시작해야 하는 게 아니다.
/*
이중 for문이랑 비교하자면, 주어진 상황에서 배열의 모든 경우의 수를 다 따져봐야 할 때,
이중 for문은 하나의 포인터(변수)로 배열을 탐색해야해서 어쩔 수 없이 이중 for문을 써야하는데,
투 포인터 알고리즘은 두 개의 포인터로 배열을 탐색하므로 이중 for문 대신 1중 반복문으로 충분하다, 이런 원리인 듯?

for문이든 while문이든 반복문의 종료 조건을 잘 성정하는 것도 중요, 항상 다 잘해놓고 여기서 문제가 생김(인덱스 바운드 에러같은)
예시 분석 단계에서 꼼꼼히 고민

그리고 sliding window 알고리즘도 기반은 투 포인터 알고리즘이라 볼 수 있을 듯, 포인터 두 개 사이의 범위를 마치 창문처럼 보는 거니까
*/
public class MySolution {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        //투 포인터
        int start = 1;
        int now = start;

        int sum = 0;
        int count = 0;

        while(start <= n / 2) {

            sum += now;

            //크면
            if (sum > n) {

                start++;
                now = start;
                sum = 0;
            }
            //작으면
            else if (sum < n) {
                now++;
            }

            //같으면
            else {

                count++;
                sum = 0;
                start++;
                now = start;
            }
        }
        System.out.println(count);
    }
}
