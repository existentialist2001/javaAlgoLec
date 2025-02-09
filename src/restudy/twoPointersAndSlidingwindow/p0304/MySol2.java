package restudy.twoPointersAndSlidingwindow.p0304;

import java.util.Scanner;

/*
접근 자체는 나쁘지 않았음,
투 포인터 + 슬라이딩 윈도우(초기 윈도우 구성까지)
다만 초기 윈도우 구성 꼼꼼하게 안해줘서 조금 헤멤

강의 내공 따라하겠다고 전위 증가 연산자나 후위 증가 연산자 써준 것 나쁘지 않았는데, 간편하지만 이러면 인덱스 바운더리 오류를 못잡아냄
그래서 간편한게 능사는 아닌듯
투 포인터 + 슬라이딩 윈도우에서 이제 초기 윈도우 구성은 어느정도 익숙해졌고, rt의 인덱스가 바운더리를 초과하지 않도록만 주의하면 될 듯
*/

public class MySol2 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        //초기 윈도우
        int cnt = 0;
        int lt = 0;
        int rt = lt;

        int tempSum = arr[lt];

        //
        while (rt < arr.length && lt <= rt) {

            //클 때
            if (tempSum > m) {
                tempSum -= arr[lt++];
            }
            //작을 때
            else if (tempSum < m) {

                rt++;
                if (rt >= arr.length) break;
                tempSum += arr[rt];
            }
            //같을 떄
            else {

                cnt++;
                rt++;
                if (rt >= arr.length) break;
                tempSum += arr[rt];
                tempSum -= arr[lt++];
            }
        }

        System.out.print(cnt);
    }
}