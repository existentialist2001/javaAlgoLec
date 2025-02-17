package restudy.hashMapAndTreeSet.p0401;

/*
내 풀이는 해쉬를 데이터와 인덱스의 동일로 이해하고 있었고, 아스키 코드를 통해서 이를 구현했다.
강의 풀이는 Map 자료구조를 사용해서 간단하게 해결했다.
Map은 key가 중복이 안된다는 성질을 이용함.

그리고 예전에는 이런 경우 막 이차원 배열로 되게 힘들게 구현했던 것 같고 이게 약간 습관이 되어 있는데,
이제는 Map을 사용하면 된다.
*/

/*
2회독
내가 이해하고 있는 해쉬 = 데이터와 순서의 동일
아스키 코드 - 숫자끼리 계산, 종래에는 다시 변환해주어야함

Map에 대해서 나름 잘 안다고 생각하고 있지만
여태까지 문제 풀면서 스스로 이걸 써서 해결한 적은 없었음
아직 미숙하다고 봐야함
*/

import java.util.Scanner;

public class MySol {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        char result;

        int[] candidates = new int[5];
        int n = kb.nextInt();
        //꼭 해주기
        kb.nextLine();
        char[] electionArr = new char[n];
        String election = kb.nextLine();

        for (int i = 0; i < n; i++) {
            electionArr[i] = election.charAt(i);
        }

        //개표
        for (int i = 0; i < n; i++) {
            candidates[electionArr[i] - 65]++;
        }

        //최대값 찾기
        int max = candidates[0];
        int index = 0;
        for (int i = 1; i < 5; i++) {

            if (candidates[i] > max) {

                max = candidates[i];
                index = i;
            }
        }

        //결과
        result = (char)(index + 65);
        System.out.println(result);
    }
}
