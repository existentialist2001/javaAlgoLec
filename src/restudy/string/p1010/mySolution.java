package restudy.string.p1010;

import java.util.Scanner;

public class mySolution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char t =  sc.next().charAt(0);

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            int lstart = i - 1;
            int lend = 0;
            int rstart = i + 1;
            int rend = s.length() - 1;
            int lmin = Integer.MAX_VALUE;
            int rmin = Integer.MAX_VALUE;

            //자신이 e라면
            if (c == t) {
                System.out.print(0 + " ");
                continue;
            }

            //왼쪽 검사
            while (lstart >= lend) {

                if (s.charAt(lstart) == t) {

                    if ((i - lstart) < lmin) {
                        lmin = i - lstart;
                    }
                }
                lstart--;
            }

            //오른쪽 검사
            while (rstart <= rend) {

                if (s.charAt(rstart) == t) {

                    if ((rstart - i) < rmin) {
                        rmin = rstart - i;
                    }
                }
                rstart++;
            }

            //더 작은 것 바로 출력
            int result = Math.min(lmin,rmin);
            System.out.print(result + " ");
        }
    }
}

/*
-nextLine 함수 대신 공백 문자(스페이스, 탭, 엔터)를 배제하는 next 함수 사용
-최소값 초기값 설정으로 Integer.MAX_VALUE 상수 사용
-최소값 결정할 때 Math.min 함수 사용
-문자열 인덱스 에러(익셉션) 피하기 위해 for문 대신 while문 사용
-입력, 처리, 출력을 동시에(섞어서) 하면 성능이 올라가고 코드가 더 간겨해지는 경우가 있음, 여기에서는 처리와 출력을 동시에 해줬음
*/
