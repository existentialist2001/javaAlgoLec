package restudy.twoPointersAndSlidingwindow.p0304;

import java.util.Scanner;

/*
포인터 두 개로 배열을 탐색한다는 점에선 내 풀이와 강의 풀이가 동일하다.
하지만 내 풀이는 케이스 별로 나뉘어서 직관적인데, 강의 풀이는 케이스가 섞여있고, 코드 중복도 있어 딱히 좋은 풀이처럼
느껴지지 않는다.
어쨌든, 배열을 탐색하는 방법은 꼭 for문으로 하나씩 탐색하는 것만 있는 게 아니라 다양하다.
이번에 배운 투포인터와, 강의 풀이처럼 for문과 while문을 조합하는 것도 가능하다.
그러니까 선입견에서 탈피하자.

2회독, 아래의 내 풀이는 슬라이딩 윈도우가 아니다.
내가 느낀 슬라이딩 윈도우의 핵심은 기존 결과를 다음 연산때 활용해주는 건데, 아래는 합이 같을 때 사실상 처음 시작한다. 연산 속도가 떨어질 수 밖에 없다.
그리고 강의 풀이는 다시 봐도 비직관적이다. 엄청난 내공이 필요할 듯
*/

public class MySolution {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        int start = 0;
        int count = 0;
        int result = 0;
        int sum = arr[start];

        while  ((start < arr.length) && (count < arr.length)) {

            if (sum < m) {

                count++;
                if (count >= arr.length) {
                    break;
                }
                else {
                    sum = sum + arr[count];
                }
            }
            else if (sum > m) {

                sum = sum - arr[start];
                start++;
            }
            else {

                result++;
                start++;
                //추가
                count = start;
                sum = arr[start];
            }
        }
        System.out.println(result);
    }
}