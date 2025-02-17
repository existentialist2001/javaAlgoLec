package restudy.hashMapAndTreeSet.p0402;

/*
강의 풀이는 Map 자료구조를 하나만 사용했음
*/

/*
2회독
두번째 풀이가 더 간결해진 것 같음
강의 풀이에서 get 함수 쓴 부분에, key가 없는데 바로 get을 쓰면 NPE가 발생하지 않나? 의문점이 들었는데,
그렇지 않고 그냥 null을 반환함

강의 풀이 논리가 약간 비직관적이긴 함
생각해보니 여태까지 코딩 문제 풀면서 조건문에서 or 사용해본 적 드문 것 같음
*/

import java.util.HashMap;
import java.util.Scanner;

public class MySol {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String w1 = kb.nextLine();
        String w2 = kb.nextLine();

        HashMap<Character,Integer> m1 = new HashMap<>();
        HashMap<Character,Integer> m2 = new HashMap<>();

        //m1 초기화
        for (char key : w1.toCharArray()) {
            m1.put(key,m1.getOrDefault(key,0) + 1);
        }

        //m2초기화
        for (char key : w2.toCharArray()) {
            m2.put(key,m2.getOrDefault(key,0) + 1);
        }

        int count = 0;
        for (char key : m1.keySet()) {

            if (m2.containsKey(key)) {

                if (m1.get(key).equals(m2.get(key))) {
                    count++;
                }
            }
            else {
                count = -1;
                break;
            }
        }

        //최종 검사
        if (count == m1.size()) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
